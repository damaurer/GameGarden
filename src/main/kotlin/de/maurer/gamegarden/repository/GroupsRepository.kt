package de.maurer.gamegarden.repository

import de.maurer.gamegarden.model.Groups
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface GroupsRepository : JpaRepository<Groups, Long>, JpaSpecificationExecutor<Groups>