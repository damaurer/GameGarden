package de.maurer.gamegarden.model

import de.maurer.gamegarden.model.base.RootEntity
import jakarta.persistence.*

@Entity
@Table(name = "group_authorities")
class GroupAuthorities : RootEntity() {

    @Id
    @SequenceGenerator(name = "group_authorities_id_seq", sequenceName = "group_authorities_id_seq")
    val id: Long? = null

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    var groups: Groups? = null

    @Column(name = "authority", nullable = false)
    var authority: String? = null


}

