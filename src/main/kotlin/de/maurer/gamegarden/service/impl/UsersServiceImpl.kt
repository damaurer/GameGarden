package de.maurer.gamegarden.service.impl

import de.maurer.gamegarden.mapper.UsersMapper
import de.maurer.gamegarden.repository.UsersRepository
import de.maurer.gamegarden.service.UsersService
import de.maurer.gamegarden.web.dto.UsersDTO
import org.springframework.stereotype.Service

@Service
class UsersServiceImpl(val mapper: UsersMapper, val repository: UsersRepository) : UsersService {


    override fun getTableData(): List<UsersDTO> {
        return repository.findAllByOrderByUsername().map { mapper.mapEntityToDto(it) }
    }

    override fun getUserNames(): List<String> {
        return repository.findAllByOrderByUsername().map { it.username }.filterNotNull()
    }
}