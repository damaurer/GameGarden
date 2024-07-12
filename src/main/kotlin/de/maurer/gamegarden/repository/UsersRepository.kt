package de.maurer.gamegarden.repository

import de.maurer.gamegarden.model.Users
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface UsersRepository : JpaRepository<Users, Long>, JpaSpecificationExecutor<Users>