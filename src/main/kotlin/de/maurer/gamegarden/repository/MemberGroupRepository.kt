package de.maurer.gamegarden.repository

import de.maurer.gamegarden.model.MemberGroup
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface MemberGroupRepository: JpaRepository<MemberGroup, Long>, JpaSpecificationExecutor<MemberGroup>{

}