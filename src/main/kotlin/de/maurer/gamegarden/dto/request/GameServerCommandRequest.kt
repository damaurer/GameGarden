package de.maurer.gamegarden.dto.request

import de.maurer.gamegarden.model.enums.GameServerCommand

data class GameServerCommandRequest(
    val id: Long,
    val command: GameServerCommand
)
