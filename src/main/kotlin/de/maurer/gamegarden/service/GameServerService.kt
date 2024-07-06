package de.maurer.gamegarden.service

import de.maurer.gamegarden.dto.GameServerDTO
import de.maurer.gamegarden.model.GameServer
import de.maurer.gamegarden.model.enums.GameServerCommand

interface GameServerService {

    fun getAllGameServers(): List<GameServer>
    fun command(id: Long, command: GameServerCommand): GameServer?
}

