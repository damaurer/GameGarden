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
@Table(name = "game_variables")
@EntityListeners(AuditingEntityListener::class)
class GameVariables(

    @Id
    @SequenceGenerator(name = "game_variables_id_seq", sequenceName = "game_variables_id_seq")
    val id: Int,

    @ManyToOne
    @JoinColumn(name = "game_id", nullable = false)
    val game: Game,

    @Column(name = "variable" , nullable = false)
    val variable: String,

    @Column(name = "value" , nullable = false)
    val value: String,

    @Column(name = "deleted" , nullable = false)
    val deleted: Boolean = false,

    @ManyToOne
    @JoinColumn(name = "changed_by", nullable = false)
    val changedBy: Member,

    @Column(name = "last_modified", nullable = false)
    @LastModifiedDate
    val lastModified: Timestamp

    )

