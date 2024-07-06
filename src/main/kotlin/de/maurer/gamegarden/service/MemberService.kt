package de.maurer.gamegarden.service

import de.maurer.gamegarden.model.Member

interface MemberService {

    fun getTableData(): List<Member>
    fun getUserNames(): List<String>
}