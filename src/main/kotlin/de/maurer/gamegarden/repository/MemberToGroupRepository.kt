package de.maurer.gamegarden.repository

import de.maurer.gamegarden.model.*
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface MemberToGroupRepository: JpaRepository<MemberToGroup, MemberToGroupKey>, JpaSpecificationExecutor<MemberToGroup> {

}