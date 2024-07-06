package de.maurer.gamegarden.dto


import de.maurer.gamegarden.model.Member
import java.sql.Timestamp


data class MemberDTO(

    val id: Long,

    val membername: String,

    val email: String,

    val deleted: Boolean = false,

    val changedBy: MemberDTO?,

    val lastModified: Timestamp

)

fun Member.toDTO(): MemberDTO {
    val memberDTO = MemberDTO(
        id, membername, email, deleted, changedBy = changedBy?.toDTO(), lastModified
    )
    return memberDTO
}