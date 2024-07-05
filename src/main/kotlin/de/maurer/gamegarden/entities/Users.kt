package de.maurer.gamegarden.entities

import de.maurer.gamegarden.base.RootEntity
import jakarta.persistence.*

@Entity
@Table(name = "users")
class Users: RootEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    override var id: Long? = null

    @Column(name = "username")
    var username: String? = null

    @Column(name = "email")
    var email: String? = null
}