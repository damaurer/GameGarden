package de.maurer.gamegarden.dto

import de.maurer.gamegarden.model.MemberGroup
import java.sql.Timestamp
import java.time.LocalDateTime

class MemberGroupDTO(

    val id: Long?,

    val groupName: String?,

    val deleted: Boolean = false,

    val changedBy: MemberDTO?,


    val lastModified: LocalDateTime?

    )

fun MemberGroup.toDTO(): MemberGroupDTO {
    val memberGroupDTO = MemberGroupDTO(
        id,groupName,deleted, changedBy = changedBy?.toDTO(), lastModified
    )
    return memberGroupDTO
}