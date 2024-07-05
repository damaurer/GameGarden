package de.maurer.gamegarden.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.Customizer
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig {

    /**
     * Creates a security filter chain for HTTP security configuration.
     *
     * @param http the HttpSecurity instance to configure
     * @return the configured security filter chain
     */
    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {

        http
            .csrf { t -> t.disable() }
            .authorizeHttpRequests { authorizeRequest ->
                authorizeRequest.anyRequest().authenticated()
            }.oauth2ResourceServer { t -> t.jwt(Customizer.withDefaults()) }
            .sessionManagement { t -> t.sessionCreationPolicy(SessionCreationPolicy.STATELESS) }
        return http.build()
    }
}