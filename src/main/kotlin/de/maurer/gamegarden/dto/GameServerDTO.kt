package de.maurer.gamegarden.dto

import de.maurer.gamegarden.model.GameServer
import de.maurer.gamegarden.model.enums.GameServerState
import java.sql.Timestamp

data class GameServerDTO(

    val id: Long,

    val game: GameDTO,

    val memberGroup: MemberGroupDTO,

    val containerId: String,

    val status: GameServerState,

    val deleted: Boolean = false,

    val changedBy: MemberDTO,

    val lastModified: Timestamp

    )

fun GameServer.toDTO(): GameServerDTO {
    val gameServerDTO = GameServerDTO(
        id, game = game.toDTO(), memberGroup = memberGroup.toDTO(), containerId, status, deleted, changedBy = changedBy.toDTO(), lastModified
    )
    return gameServerDTO
}