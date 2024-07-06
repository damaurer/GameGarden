package de.maurer.gamegarden.repository

import de.maurer.gamegarden.model.DockerVariables
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface DockerVariablesRepository: PagingAndSortingRepository<DockerVariables, Long>, JpaSpecificationExecutor<DockerVariables> {

}