package de.maurer.pr_dallmayr.service.impl

import de.maurer.pr_dallmayr.mapper.UsersMapper
import de.maurer.pr_dallmayr.repository.UsersRepository
import de.maurer.pr_dallmayr.service.UsersService
import de.maurer.pr_dallmayr.web.dto.UsersDTO
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