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
@Table(name = "member")
@EntityListeners(AuditingEntityListener::class)
class Member(

    @Id
    @SequenceGenerator(name = "member_id_seq", sequenceName = "member_id_seq")
    val id: Long,

    @Column(name = "membername" , nullable = false)
    val membername: String,

    @Column(name = "email" , nullable = false)
    val email: String,

    @Column(name = "deleted" , nullable = false)
    val deleted: Boolean = false,

    @ManyToOne
    @JoinColumn(name = "changed_by", nullable = false)
    val changedBy: Member?,

    @Column(name = "last_modified", nullable = false)
    @LastModifiedDate
    val lastModified: Timestamp

    )

