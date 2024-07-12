package de.maurer.gamegarden.dto

import de.maurer.gamegarden.model.Game
import de.maurer.gamegarden.model.Users
import java.time.LocalDateTime


data class GameDTO(

    val id: Long?,

    val name: String?,

    val image: String?,

    val registryUrl: String?,

    val deleted: Boolean = false,

    val changedBy: Users?,

    val lastModified: LocalDateTime?

)


fun Game.toDTO(): GameDTO {
    val gameDTO = GameDTO(
        id, name, image, registryUrl, deleted, changedBy, lastModified
    )
    return gameDTO
}
