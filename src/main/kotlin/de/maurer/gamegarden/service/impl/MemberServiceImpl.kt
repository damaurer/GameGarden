package de.maurer.gamegarden.service.impl

import de.maurer.gamegarden.model.Member
import de.maurer.gamegarden.repository.MemberRepository
import de.maurer.gamegarden.service.MemberService
import org.springframework.stereotype.Service

@Service
class MemberServiceImpl(val repository: MemberRepository) : MemberService {


    override fun getTableData(): List<Member> {
        return repository.findAllByOrderByMembername()
    }

    override fun getUserNames(): List<String> {
        return repository.findAllByOrderByMembername().map { it.membername }.filterNotNull()
    }
}