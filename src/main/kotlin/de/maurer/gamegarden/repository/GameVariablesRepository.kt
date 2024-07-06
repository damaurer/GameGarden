package de.maurer.gamegarden.repository


import de.maurer.gamegarden.model.GameVariables
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface GameVariablesRepository: PagingAndSortingRepository<GameVariables, Long>, JpaSpecificationExecutor<GameVariables> {

}