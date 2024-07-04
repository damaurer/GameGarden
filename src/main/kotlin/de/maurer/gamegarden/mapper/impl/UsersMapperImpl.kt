package de.maurer.pr_dallmayr.mapper.impl

import de.maurer.pr_dallmayr.entities.Users
import de.maurer.pr_dallmayr.mapper.UsersMapper
import de.maurer.pr_dallmayr.web.dto.UsersDTO
import org.springframework.stereotype.Service

@Service
class UsersMapperImpl:UsersMapper {

    override fun mapEntityToDto(entity: Users): UsersDTO {
        val dto = UsersDTO()
        dto.id = entity.id
        dto.userName = entity.username
        dto.email = entity.email
        return dto
    }

    override fun mapDtoToEntity(dto: UsersDTO): Users {
        val entity = Users()
        entity.id = dto.id
        entity.username = dto.userName
        entity.email = dto.email
        return entity
    }
}