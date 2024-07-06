package de.maurer.gamegarden.model.enums

enum class GameServerState {
    STARTED, STOPPED, REMOVED, RUNNING
}

enum class GameServerCommand {
    START, STOP, REMOVE, DELETE, DEPLOY
}