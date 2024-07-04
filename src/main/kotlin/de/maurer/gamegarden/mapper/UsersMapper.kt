package de.maurer.pr_dallmayr.mapper

import de.maurer.pr_dallmayr.base.BaseMapper
import de.maurer.pr_dallmayr.entities.Users
import de.maurer.pr_dallmayr.web.dto.UsersDTO

interface UsersMapper: BaseMapper<UsersDTO, Users> {

    override fun mapEntityToDto(entity: Users): UsersDTO

    override fun mapDtoToEntity(dto: UsersDTO): Users
}