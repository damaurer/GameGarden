package de.maurer.pr_dallmayr.repository

import de.maurer.pr_dallmayr.entities.Users
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsersRepository: JpaRepository<Users, Long>{

    fun findAllByOrderByUsername(): List<Users>
}