package de.maurer.gamegarden.model

import jakarta.persistence.*
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.sql.Timestamp

@Entity
@Table(name = "game")
@EntityListeners(AuditingEntityListener::class)
class Game(

    @Id
    @SequenceGenerator(name = "game_id_seq", sequenceName = "game_id_seq")
    val id: Int,

    @Column(name = "name" , nullable = false)
    val name: String,

    @Column(name = "registry_url" , nullable = false)
    val registryUrl: String,

    @Column(name = "deleted" , nullable = false)
    val deleted: Boolean = false,

    @ManyToOne
    @JoinColumn(name = "changed_by", nullable = false)
    val changedBy: Member,

    @Column(name = "last_modified", nullable = false)
    @LastModifiedDate
    val lastModified: Timestamp

)

