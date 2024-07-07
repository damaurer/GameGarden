package de.maurer.gamegarden.config

import de.maurer.gamegarden.model.Member
import org.springframework.data.domain.AuditorAware
import org.springframework.stereotype.Component
import java.util.*

@Component
class AuditorAwareImpl: AuditorAware<Member> {

    override fun getCurrentAuditor(): Optional<Member> {
        val member = Member()
        member.email = "test@test.de"
        member.membername = "Maximator"

        return Optional.of(member)
    }
}