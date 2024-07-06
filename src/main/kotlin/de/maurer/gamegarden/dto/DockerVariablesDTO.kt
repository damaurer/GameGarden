package de.maurer.gamegarden.dto

import de.maurer.gamegarden.model.DockerVariables
import de.maurer.gamegarden.model.enums.DockerVariablesTyp
import java.sql.Timestamp

data class DockerVariablesDTO(
    val id: Long,

    val game: GameDTO,

    val variable: String,

    val value: String,

    val typ: DockerVariablesTyp,

    val isEnv: Boolean = false,

    val deleted: Boolean = false,

    val changedBy: MemberDTO?,

    val lastModified: Timestamp
)

fun DockerVariables.toDTO(): DockerVariablesDTO {
    val dockerVariablesDTO = DockerVariablesDTO(
        id, game = game.toDTO(), variable, value, typ, isEnv, deleted, changedBy = changedBy.toDTO(), lastModified
    )
    return dockerVariablesDTO
}
