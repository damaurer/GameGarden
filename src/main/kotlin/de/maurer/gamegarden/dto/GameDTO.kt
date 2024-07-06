package de.maurer.gamegarden.dto

import de.maurer.gamegarden.model.Game
import de.maurer.gamegarden.model.Member
import java.sql.Timestamp


data class GameDTO(

    val id: Long,

    val name: String,

    val image: String,

    val registryUrl: String,

    val deleted: Boolean = false,

    val changedBy: Member,

    val lastModified: Timestamp

)


fun Game.toDTO(): GameDTO{
    val gameDTO = GameDTO(
            id,name, image, registryUrl, deleted, changedBy, lastModified
    )
    return gameDTO
}
