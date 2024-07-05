package de.maurer.gamegarden.mapper.impl

import de.maurer.gamegarden.entities.Users
import de.maurer.gamegarden.mapper.UsersMapper
import de.maurer.gamegarden.web.dto.UsersDTO
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