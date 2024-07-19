package de.maurer.gamegarden.service.impl

import de.maurer.gamegarden.dto.UsersDTO
import de.maurer.gamegarden.dto.toDTO
import de.maurer.gamegarden.model.Users
import de.maurer.gamegarden.repository.UsersRepository
import de.maurer.gamegarden.service.UsersService
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class UsersServiceImpl(val repository: UsersRepository) : UsersService {
    override fun getAllUsersData(): Set<UsersDTO> {
        return repository.findAll().stream().map(Users::toDTO).collect(Collectors.toSet())
    }
}