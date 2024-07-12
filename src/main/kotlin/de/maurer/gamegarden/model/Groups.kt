package de.maurer.gamegarden.model

import de.maurer.gamegarden.model.base.RootEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.SequenceGenerator
import jakarta.persistence.Table

@Entity
@Table(name = "groups")
class Groups: RootEntity() {

    @Id
    @SequenceGenerator(name = "groups_id_seq", sequenceName = "groups_id_seq")
    val id: Long? = null

    @Column(name = "group_name" , nullable = false)
    var groupName: String? = null


}

