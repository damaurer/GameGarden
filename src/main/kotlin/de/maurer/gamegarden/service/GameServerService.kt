package de.maurer.gamegarden.service

import de.maurer.gamegarden.model.Game
import de.maurer.gamegarden.model.GameServer
import de.maurer.gamegarden.model.Groups
import de.maurer.gamegarden.model.enums.GameServerCommand

interface GameServerService {

    fun getAllGameServers(): List<GameServer>

    fun getGameServer(id: Long): GameServer?

    fun createGameServer(game: Game, group: Groups): GameServer
    fun command(id: Long, command: GameServerCommand): GameServer?
}

