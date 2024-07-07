package de.maurer.gamegarden.model

import de.maurer.gamegarden.model.base.RootEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EntityListeners
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.SequenceGenerator
import jakarta.persistence.Table
import org.hibernate.annotations.DialectOverride.Wheres
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.sql.Timestamp

@Entity
@Table(name = "member_group")
class MemberGroup: RootEntity() {

    @Id
    @SequenceGenerator(name = "member_group_id_seq", sequenceName = "member_group_id_seq")
    val id: Long? = null

    @Column(name = "group_name" , nullable = false)
    var groupName: String? = null


}

