package de.maurer.gamegarden.repository

import de.maurer.gamegarden.entities.Users
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsersRepository: JpaRepository<Users, Long>{

    fun findAllByOrderByUsername(): List<Users>
}