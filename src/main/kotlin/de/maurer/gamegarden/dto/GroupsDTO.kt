package de.maurer.gamegarden.dto


import de.maurer.gamegarden.model.Groups
import java.time.LocalDateTime


data class GroupsDTO(

    val id: Long?,

    val groupName: String?,

    val deleted: Boolean = false,

    val changedBy: UsersDTO?,

    val lastModified: LocalDateTime?

)

fun Groups.toDTO(): GroupsDTO {
    val groupDTO = GroupsDTO(
        id, groupName, deleted, changedBy = changedBy?.toDTO(), lastModified
    )
    return groupDTO
}