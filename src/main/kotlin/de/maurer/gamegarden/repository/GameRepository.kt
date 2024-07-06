package de.maurer.gamegarden.repository

import de.maurer.gamegarden.model.Game
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface GameRepository: JpaRepository<Game, Long>, JpaSpecificationExecutor<Game> {

}