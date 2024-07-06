package de.maurer.gamegarden.repository

import de.maurer.gamegarden.model.Member
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository: PagingAndSortingRepository<Member, Long>, JpaSpecificationExecutor<Member> {

    fun findAllByOrderByMembername(): List<Member>
}