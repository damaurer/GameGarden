package de.maurer.gamegarden.dto.base

import de.maurer.gamegarden.model.base.RootEntity

data class ReferenceDTO(

    val id: Long?,

    val referenceText: String?
)

fun RootEntity.toReferenceDTO(id: Long?, referenceText: String?): ReferenceDTO {
    return ReferenceDTO(
        id,
        referenceText
    )
}