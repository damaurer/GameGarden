package de.maurer.gamegarden.model

import de.maurer.gamegarden.model.base.RootEntity
import jakarta.persistence.*

@Entity
@Table(name = "authorities")
class Authorities : RootEntity() {

    @Id
    @SequenceGenerator(name = "authorities_id_seq", sequenceName = "authorities_id_seq")
    val id: Long? = null

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    var users: Users? = null

    @Column(name = "authority", nullable = false)
    var authority: String? = null


}
