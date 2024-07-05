package de.maurer.gamegarden.service.impl

import com.github.dockerjava.api.DockerClient
import de.maurer.gamegarden.service.DockerService
import org.springframework.stereotype.Service

@Service
class DockerServiceImp(val dockerCLient: DockerClient): DockerService{


    override fun startGameServer() {
        TODO("Not yet implemented")
    }

    override fun stopGameServer() {
        TODO("Not yet implemented")
    }

    override fun isGameServerRunning(): Boolean{
        TODO("Not yet implemented")
    }

    override fun restartGameServer() {
        TODO("Not yet implemented")
    }

    override fun deployGameServer() {
        TODO("Not yet implemented")
    }

    override fun checkGameServerStatus(): String {
        TODO("Not yet implemented")
    }

    override fun updateGameServer() {
        TODO("Not yet implemented")
    }

    override fun backupGameServer() {
        TODO("Not yet implemented")
    }

    override fun deleteGameServer() {
        TODO("Not yet implemented")
    }
}