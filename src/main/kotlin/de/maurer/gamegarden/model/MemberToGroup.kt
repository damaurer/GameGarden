package de.maurer.gamegarden.model

import de.maurer.gamegarden.model.base.RootEntity
import jakarta.persistence.Column
import jakarta.persistence.EmbeddedId
import jakarta.persistence.Entity
import jakarta.persistence.EntityListeners
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.sql.Timestamp


@Entity
@Table(name = "member_to_group")
class MemberToGroup: RootEntity(){
    @EmbeddedId
    val id: MemberToGroupKey? = null
}

