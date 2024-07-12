package de.maurer.gamegarden.dto


import de.maurer.gamegarden.model.Users
import java.time.LocalDateTime


data class UsersDTO(

    val id: Long?,

    val username: String?,


    val enabled: Boolean = false,

    val deleted: Boolean = false,

    val changedBy: UsersDTO?,

    val lastModified: LocalDateTime?

)

fun Users.toDTO(): UsersDTO {
    val usersDTO = UsersDTO(
        id, username, enabled, deleted, changedBy = changedBy?.toDTO(), lastModified
    )
    return usersDTO
}