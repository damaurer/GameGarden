package de.maurer.gamegarden.config


import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.security.test.context.support.WithAnonymousUser
import org.springframework.security.test.context.support.WithUserDetails
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext


@SpringBootTest
class SecurityConfigIntegrationTest(var wac: WebApplicationContext) {


    lateinit var mvc: MockMvc

    @BeforeEach
    @Throws(java.lang.Exception::class)
    fun setup() {
        mvc = MockMvcBuilders.webAppContextSetup(wac).build()
    }

    @Test
    @WithAnonymousUser
    @Throws(Exception::class)
    fun whenAnonymousAccessLogin_thenOk() {
        mvc.perform(get("/api/user/login"))
            .andExpect(status().isOk())
    }

    @Test
    @WithAnonymousUser
    @Throws(Exception::class)
    fun whenAnonymousAccessRestrictedEndpoint_thenIsUnauthorized() {
        mvc.perform(get("/api/user/all"))
            .andExpect(status().isUnauthorized())
    }

    @Test
    @WithUserDetails
    @Throws(Exception::class)
    fun whenUserAccessUserSecuredEndpoint_thenOk() {
        mvc.perform(get("/api/user/user"))
            .andExpect(status().isOk())
    }

    @Test
    @WithUserDetails
    @Throws(Exception::class)
    fun whenUserAccessRestrictedEndpoint_thenOk() {
        mvc.perform(get("/api/user/all"))
            .andExpect(status().isOk())
    }

    @Test
    @WithUserDetails
    @Throws(Exception::class)
    fun whenUserAccessAdminSecuredEndpoint_thenIsForbidden() {
        mvc.perform(get("/api/user/admin"))
            .andExpect(status().isForbidden())
    }

    @Test
    @WithUserDetails
    @Throws(Exception::class)
    fun whenUserAccessDeleteSecuredEndpoint_thenIsForbidden() {
        mvc.perform(delete("/api/user/delete"))
            .andExpect(status().isForbidden())
    }

    @Test
    @WithUserDetails(value = "admin")
    @Throws(java.lang.Exception::class)
    fun whenAdminAccessUserEndpoint_thenOk() {
        mvc.perform(get("/api/user/user"))
            .andExpect(status().isOk())
    }

    @Test
    @WithUserDetails(value = "admin")
    @Throws(java.lang.Exception::class)
    fun whenAdminAccessAdminSecuredEndpoint_thenIsOk() {
        mvc.perform(get("/api/user/admin"))
            .andExpect(status().isOk())
    }

    @Test
    @WithUserDetails(value = "admin")
    @Throws(java.lang.Exception::class)
    fun whenAdminAccessDeleteSecuredEndpoint_thenIsOk() {
        mvc.perform(delete("/api/user/delete").content("{}"))
            .andExpect(status().isOk())
    }
}