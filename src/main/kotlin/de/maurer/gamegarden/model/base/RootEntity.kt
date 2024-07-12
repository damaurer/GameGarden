package de.maurer.gamegarden.model.base

import de.maurer.gamegarden.model.Users
import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class RootEntity {

    @Column(name = "deleted", nullable = false)
    val deleted: Boolean = false

    @ManyToOne
    @JoinColumn(name = "created_by", nullable = false)
    @LastModifiedBy
    val createdBy: Users? = null

    @CreatedDate
    @Column(name = "created_date", nullable = false, updatable = false, columnDefinition = "TIMESTAMP")
    var createdDate: LocalDateTime? = null

    @ManyToOne
    @JoinColumn(name = "changed_by", nullable = false)
    @LastModifiedBy
    val changedBy: Users? = null

    @Column(name = "last_modified", nullable = false, columnDefinition = "TIMESTAMP")
    @LastModifiedDate
    val lastModified: LocalDateTime? = null
}