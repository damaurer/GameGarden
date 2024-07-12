package de.maurer.gamegarden.dto

import de.maurer.gamegarden.model.GroupMembers
import java.time.LocalDateTime

class GroupMembersDTO(

    val id: Long?,

    val users: UsersDTO?,

    val groups: GroupsDTO?,

    val deleted: Boolean = false,

    val changedBy: UsersDTO?,


    val lastModified: LocalDateTime?

)

fun GroupMembers.toDTO(): GroupMembersDTO {
    val groupMemebersDTO = GroupMembersDTO(
        id, users = user?.toDTO(), groups = groups?.toDTO(), deleted, changedBy = changedBy?.toDTO(), lastModified
    )
    return groupMemebersDTO
}