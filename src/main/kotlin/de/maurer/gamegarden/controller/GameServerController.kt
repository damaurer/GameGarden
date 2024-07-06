package de.maurer.gamegarden.controller

import de.maurer.gamegarden.dto.GameServerDTO
import de.maurer.gamegarden.dto.request.GameServerCommandRequest
import de.maurer.gamegarden.dto.toDTO
import de.maurer.gamegarden.service.GameServerService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController("api/game/server")
class GameServerController(val gameServerService: GameServerService) {

    @PostMapping("/command")
    fun commandServer(@RequestBody commandRequest: GameServerCommandRequest): ResponseEntity<GameServerDTO> {
        val gameServer = gameServerService.command(commandRequest.id, commandRequest.command)
        return ResponseEntity.ok(gameServer?.toDTO())
    }

    @GetMapping("/list")
    fun getGameServers(): ResponseEntity<List<GameServerDTO>> {
        val gameServers = gameServerService.getAllGameServers()
        return ResponseEntity.ok(gameServers.map { it.toDTO() })
    }
}