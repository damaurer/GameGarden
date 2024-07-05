package de.maurer.gamegarden.service

interface DockerService {

    fun startGameServer()

    fun stopGameServer()

    fun isGameServerRunning(): Boolean

    fun restartGameServer()

    fun deployGameServer()

    fun checkGameServerStatus(): String

    fun updateGameServer()

    fun backupGameServer()

    fun deleteGameServer()


}