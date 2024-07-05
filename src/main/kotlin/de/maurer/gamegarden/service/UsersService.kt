package de.maurer.gamegarden.service

import de.maurer.gamegarden.web.dto.UsersDTO

interface UsersService {

    fun getTableData(): List<UsersDTO>
    fun getUserNames(): List<String>
}