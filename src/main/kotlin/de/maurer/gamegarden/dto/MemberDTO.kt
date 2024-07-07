package de.maurer.gamegarden.dto


import de.maurer.gamegarden.model.Member
import java.sql.Timestamp
import java.time.LocalDateTime


data class MemberDTO(

    val id: Long?,

    val membername: String?,

    val email: String?,

    val deleted: Boolean = false,

    val changedBy: MemberDTO?,

    val lastModified: LocalDateTime?

)

fun Member.toDTO(): MemberDTO {
    val memberDTO = MemberDTO(
        id, membername, email, deleted, changedBy = changedBy?.toDTO(), lastModified
    )
    return memberDTO
}