package de.maurer.gamegarden.repository

import de.maurer.gamegarden.model.*
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberToGroupRepository: PagingAndSortingRepository<MemberToGroup, MemberToGroupKey>, JpaSpecificationExecutor<MemberToGroup> {

}