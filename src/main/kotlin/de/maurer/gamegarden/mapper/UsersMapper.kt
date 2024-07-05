package de.maurer.gamegarden.mapper

import de.maurer.gamegarden.base.BaseMapper
import de.maurer.gamegarden.entities.Users
import de.maurer.gamegarden.web.dto.UsersDTO

interface UsersMapper: BaseMapper<UsersDTO, Users> {

    override fun mapEntityToDto(entity: Users): UsersDTO

    override fun mapDtoToEntity(dto: UsersDTO): Users
}