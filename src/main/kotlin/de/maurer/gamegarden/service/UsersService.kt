package de.maurer.gamegarden.service

import de.maurer.gamegarden.dto.UsersDTO

interface UsersService {
    fun getAllUsersData(): Set<UsersDTO>
}