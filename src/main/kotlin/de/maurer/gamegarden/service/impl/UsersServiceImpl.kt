package de.maurer.gamegarden.service.impl

import de.maurer.gamegarden.repository.UsersRepository
import de.maurer.gamegarden.service.UsersService
import org.springframework.stereotype.Service

@Service
class UsersServiceImpl(val repository: UsersRepository) : UsersService