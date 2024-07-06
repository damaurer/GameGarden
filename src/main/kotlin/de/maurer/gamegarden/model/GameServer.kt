package de.maurer.gamegarden.model

import de.maurer.gamegarden.model.enums.GameServerState
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EntityListeners
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.SequenceGenerator
import jakarta.persistence.Table
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.sql.Timestamp

@Entity
@Table(name = "game_server")
@EntityListeners(AuditingEntityListener::class)
class GameServer(

    @Id
    @SequenceGenerator(name = "game_server_id_seq", sequenceName = "game_server_id_seq")
    val id: Long,

    @ManyToOne
    @JoinColumn(name = "game_id", nullable = false)
    val game: Game,

    @ManyToOne
    @JoinColumn(name = "member_group_id", nullable = false)
    val memberGroup: MemberGroup,

    @Column(name = "container_id" , nullable = false)
    val containerId: String,

    @Enumerated(EnumType.STRING)
    @Column(name = "status" , nullable = false)
    var status: GameServerState,

    @Column(name = "deleted" , nullable = false)
    val deleted: Boolean = false,

    @ManyToOne
    @JoinColumn(name = "changed_by", nullable = false)
    val changedBy: Member,

    @Column(name = "last_modified", nullable = false)
    @LastModifiedDate
    val lastModified: Timestamp

    )

