package de.maurer.pr_dallmayr.service

import de.maurer.pr_dallmayr.web.dto.UsersDTO

interface UsersService {

    fun getTableData(): List<UsersDTO>
    fun getUserNames(): List<String>
}