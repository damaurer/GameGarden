package de.maurer.gamegarden.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.provisioning.JdbcUserDetailsManager
import org.springframework.security.provisioning.UserDetailsManager
import javax.sql.DataSource

@Configuration
class DataSourceConfig {

    @Bean
    fun jdbcUserDetailsManager(dataSource: DataSource): UserDetailsManager {
        return JdbcUserDetailsManager(dataSource).apply {
            usersByUsernameQuery = "select * from users where username = ?"
            setAuthoritiesByUsernameQuery("select * from authorities where user_id = ?")
        }

    }
}