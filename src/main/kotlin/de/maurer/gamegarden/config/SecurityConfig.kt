package de.maurer.gamegarden.config

import de.maurer.gamegarden.model.enums.Roles
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.crypto.factory.PasswordEncoderFactories
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain


@Configuration
@EnableWebSecurity
@EnableMethodSecurity(securedEnabled = true, jsr250Enabled = true, prePostEnabled = true)
class SecurityConfig {

    @Bean
    @Throws(Exception::class)
    fun filterChain(http: HttpSecurity): SecurityFilterChain {

        http
            .authorizeHttpRequests { authorize ->
                authorize
                    .requestMatchers("/").permitAll()
                    .requestMatchers("/api").hasAnyRole(Roles.USER.toString())
                    .requestMatchers("/api/admin").hasAnyRole(Roles.ADMIN.toString())
                    .anyRequest().authenticated()
            }
            .formLogin { login -> login.defaultSuccessUrl("/").permitAll() }
            .logout { logout -> logout.logoutSuccessUrl("/") }

        return http.build()
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder()
    }


}