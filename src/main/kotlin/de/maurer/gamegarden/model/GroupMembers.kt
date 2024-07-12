package de.maurer.gamegarden.model

import de.maurer.gamegarden.model.base.RootEntity
import jakarta.persistence.*


@Entity
@Table(name = "group_members")
class GroupMembers : RootEntity() {

    @Id
    @SequenceGenerator(name = "group_authorities_id_seq", sequenceName = "group_authorities_id_seq")
    val id: Long? = null


    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    val user: Users? = null

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    val groups: Groups? = null
}

