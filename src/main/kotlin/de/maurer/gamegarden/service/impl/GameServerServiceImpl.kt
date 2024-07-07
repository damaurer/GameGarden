package de.maurer.gamegarden.service.impl

import de.maurer.gamegarden.model.Game
import de.maurer.gamegarden.model.GameServer
import de.maurer.gamegarden.model.MemberGroup
import de.maurer.gamegarden.model.enums.GameServerCommand
import de.maurer.gamegarden.model.enums.GameServerCommand.*
import de.maurer.gamegarden.model.enums.GameServerState
import de.maurer.gamegarden.repository.GameServerRepository
import de.maurer.gamegarden.service.DockerService
import de.maurer.gamegarden.service.GameServerService
import jakarta.persistence.EntityNotFoundException
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class GameServerServiceImpl(
    val gameServerRepository: GameServerRepository,
    val dockerService: DockerService
) : GameServerService {
    override fun getAllGameServers(): List<GameServer> {
        return gameServerRepository.findAll(Sort.by(Sort.Direction.ASC)).toList()
    }

    override fun getGameServer(id: Long): GameServer? {
        return gameServerRepository.findById(id).orElse(null)
    }

    override fun createGameServer(game: Game, group: MemberGroup): GameServer {
//        val containerId = dockerService.deployGameServer(game)


//        return gameServerRepository.save(gameServer)
        return GameServer()
    }

    override fun command(id: Long, command: GameServerCommand): GameServer? {
        val gameServer: GameServer? = getGameServer(id)
        if (gameServer != null) {

            when (command) {
                START -> {
                    if ( gameServer.status == GameServerState.STOPPED) {
                        dockerService.startGameServer()
                        gameServer.status = GameServerState.STARTED
                        gameServerRepository.save(gameServer)
                    }
                }

                STOP -> {
                    if (gameServer.status == GameServerState.STARTED) {
                        dockerService.stopGameServer()
                        gameServer.status = GameServerState.STOPPED
                        gameServerRepository.save(gameServer)
                    }
                }

                REMOVE -> {
                    if ( gameServer.status == GameServerState.STOPPED) {
                        dockerService.deployGameServer()
                        gameServer.status = GameServerState.REMOVED
                        gameServerRepository.save(gameServer)
                    }
                }

                DELETE -> {
                    if ( gameServer.status != GameServerState.STOPPED && gameServer.status == GameServerState.REMOVED) {
                        throw IllegalArgumentException("Es kann kein Server gelöscht werden, der nicht gestoppt wurde!")
                    }

                    // TODO: Sever löschen
                }

                else -> throw IllegalArgumentException("Die Operation konnte nicht ausgeführt werden.")
            }

        } else {
            throw EntityNotFoundException("Es konnte kein Game Server mit der ID: $id gefunden werden!")
        }
        return gameServer
    }
}