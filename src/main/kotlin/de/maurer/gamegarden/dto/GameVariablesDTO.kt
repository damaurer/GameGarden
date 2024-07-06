package de.maurer.gamegarden.dto

import de.maurer.gamegarden.model.GameVariables
import java.sql.Timestamp


data class GameVariablesDTO(

    val id: Long,

    val game: GameDTO,

    val variable: String,

    val value: String,

    val deleted: Boolean = false,

    val changedBy: MemberDTO,

    val lastModified: Timestamp

    )

fun GameVariables.toDTO(): GameVariablesDTO {
    val gameVariablesDTO = GameVariablesDTO(
        id, game = game.toDTO(), variable, value, deleted, changedBy = changedBy.toDTO(), lastModified
    )
    return gameVariablesDTO
}