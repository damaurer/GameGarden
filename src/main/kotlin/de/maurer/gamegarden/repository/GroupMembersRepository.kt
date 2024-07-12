package de.maurer.gamegarden.repository

import de.maurer.gamegarden.model.GroupMembers
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface GroupMembersRepository : JpaRepository<GroupMembers, Long>,
    JpaSpecificationExecutor<GroupMembers>