package de.maurer.gamegarden.repository

import de.maurer.gamegarden.model.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository: JpaRepository<Member, Long>, JpaSpecificationExecutor<Member> {

    fun findAllByOrderByMembername(): List<Member>
}