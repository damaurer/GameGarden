package de.maurer.gamegarden.repository

import de.maurer.gamegarden.model.Authorities
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface AuthoritiesRepository : JpaRepository<Authorities, Long>, JpaSpecificationExecutor<Authorities>