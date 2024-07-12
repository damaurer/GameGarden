package de.maurer.gamegarden.config

import de.maurer.gamegarden.model.Users
import org.springframework.data.domain.AuditorAware
import org.springframework.stereotype.Component
import java.util.*

@Component
class AuditorAwareImpl : AuditorAware<Users> {

    override fun getCurrentAuditor(): Optional<Users> {
        val member = Users()
        member.username = "Maximator"

        return Optional.of(member)
    }
}