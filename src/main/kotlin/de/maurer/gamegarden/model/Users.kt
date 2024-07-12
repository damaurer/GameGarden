package de.maurer.gamegarden.model

import de.maurer.gamegarden.model.base.RootEntity
import jakarta.persistence.*

@Entity
@Table(name = "users")
class Users : RootEntity() {

    @Id
    @SequenceGenerator(name = "users_id_seq", sequenceName = "users_id_seq")
    val id: Long? = null

    @Column(name = "username", nullable = false)
    var username: String? = null

    @Column(name = "password", nullable = false)
    var password: String? = null

    @Column(name = "enabled", nullable = false)
    var enabled: Boolean = false


}
