package de.maurer.gamegarden.repository


import de.maurer.gamegarden.model.GameVariables
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface GameVariablesRepository: JpaRepository<GameVariables, Long>, JpaSpecificationExecutor<GameVariables> {

}