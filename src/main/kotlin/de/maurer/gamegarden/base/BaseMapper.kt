package de.maurer.gamegarden.base

interface BaseMapper<DTO: RootDTO, ENTITY: RootEntity> {

    fun mapDtoToEntity(dto: DTO): ENTITY

    fun mapEntityToDto(entity: ENTITY): DTO

}