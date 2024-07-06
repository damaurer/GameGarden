package de.maurer.gamegarden.repository

import de.maurer.gamegarden.model.DockerVariables
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface DockerVariablesRepository: JpaRepository<DockerVariables, Long>, JpaSpecificationExecutor<DockerVariables> {

}