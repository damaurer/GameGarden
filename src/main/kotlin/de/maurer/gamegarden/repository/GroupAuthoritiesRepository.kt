package de.maurer.gamegarden.repository

import de.maurer.gamegarden.model.GroupAuthorities
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface GroupAuthoritiesRepository : JpaRepository<GroupAuthorities, Long>, JpaSpecificationExecutor<GroupAuthorities>