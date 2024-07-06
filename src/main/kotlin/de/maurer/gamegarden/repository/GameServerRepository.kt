package de.maurer.gamegarden.repository


import de.maurer.gamegarden.model.GameServer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface GameServerRepository: JpaRepository<GameServer, Long>, JpaSpecificationExecutor<GameServer> {

}