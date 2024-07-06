package de.maurer.gamegarden.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EntityListeners
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.SequenceGenerator
import jakarta.persistence.Table
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.sql.Timestamp

@Entity
@Table(name = "member_group")
@EntityListeners(AuditingEntityListener::class)
class MemberGroup(

    @Id
    @SequenceGenerator(name = "member_group_id_seq", sequenceName = "member_group_id_seq")
    val id: Int,

    @Column(name = "group_name" , nullable = false)
    val groupName: String,

    @Column(name = "deleted" , nullable = false)
    val deleted: Boolean = false,

    @ManyToOne
    @JoinColumn(name = "changed_by", nullable = false)
    val changedBy: Member,

    @Column(name = "last_modified", nullable = false)
    @LastModifiedDate
    val lastModified: Timestamp

    )

