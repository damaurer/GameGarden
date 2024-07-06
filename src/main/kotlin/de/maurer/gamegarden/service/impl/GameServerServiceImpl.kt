package de.maurer.gamegarden.service.impl

import de.maurer.gamegarden.model.GameServer
import de.maurer.gamegarden.model.enums.GameServerCommand
import de.maurer.gamegarden.model.enums.GameServerState
import de.maurer.gamegarden.repository.GameServerRepository
import de.maurer.gamegarden.service.DockerService
import de.maurer.gamegarden.service.GameServerService
import jakarta.persistence.EntityNotFoundException
import org.apache.commons.lang3.StringUtils
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class GameServerServiceImpl(
    val gameServerRepository: GameServerRepository,
    val dockerService: DockerService
): GameServerService {
    override fun getAllGameServers(): List<GameServer> {
        return gameServerRepository.findAll(Sort.by(Sort.Direction.ASC)).toList()
    }

    override fun command(id: Long, command: GameServerCommand): GameServer? {
        val gameServer = gameServerRepository.findById(id).orElse(null)
        if (gameServer != null) {
            when (command) {
                GameServerCommand.DEPLOY -> {

                }

                GameServerCommand.START -> {
                    if (gameServer.status == GameServerState.STOPPED) {
                        dockerService.startGameServer()
                        gameServer.status = GameServerState.STARTED
                        gameServerRepository.save(gameServer)
                    }
                }

                GameServerCommand.STOP -> {
                    if (gameServer.status == GameServerState.STARTED) {
                        dockerService.stopGameServer()
                        gameServer.status = GameServerState.STOPPED
                        gameServerRepository.save(gameServer)
                    }
                }

                GameServerCommand.REMOVE -> {
                    if (gameServer.status == GameServerState.STOPPED) {
                        dockerService.deployGameServer()
                        gameServer.status = GameServerState.REMOVED
                        gameServerRepository.save(gameServer)
                    }
                }

                GameServerCommand.DELETE -> {
                    if(gameServer.status != GameServerState.STOPPED && gameServer.status == GameServerState.REMOVED) {
                        throw IllegalArgumentException("Es kann kein Server gelöscht werden, der nicht gestoppt wurde!")
                    }

                    // TODO: Sever löschen
                }
            }
            return gameServer
        } else {
            throw EntityNotFoundException("Es konnte kein Game Server mit der ID: "+ id + " gefunden werden!")
        }
    }
}