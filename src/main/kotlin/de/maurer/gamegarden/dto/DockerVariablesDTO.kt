package de.maurer.gamegarden.dto

import de.maurer.gamegarden.model.DockerVariables
import de.maurer.gamegarden.model.enums.DockerVariablesTyp
import java.time.LocalDateTime

data class DockerVariablesDTO(
    val id: Long?,

    val game: GameDTO?,

    val variable: String?,

    val value: String?,

    val typ: DockerVariablesTyp?,

    val isEnv: Boolean = false,

    val deleted: Boolean = false,

    val changedBy: UsersDTO?,

    val lastModified: LocalDateTime?
)

fun DockerVariables.toDTO(): DockerVariablesDTO {
    val dockerVariablesDTO = DockerVariablesDTO(
        id, game = game?.toDTO(), variable, value, typ, isEnv, deleted, changedBy = changedBy?.toDTO(), lastModified
    )
    return dockerVariablesDTO
}
