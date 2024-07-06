package de.maurer.gamegarden.repository


import de.maurer.gamegarden.model.GameServer
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface GameServerRepository: PagingAndSortingRepository<GameServer, Long>, JpaSpecificationExecutor<GameServer> {

}