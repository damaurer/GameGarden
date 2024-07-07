package de.maurer.gamegarden.model

import de.maurer.gamegarden.model.base.RootEntity
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
class GameServer: RootEntity() {

    @Id
    @SequenceGenerator(name = "game_server_id_seq", sequenceName = "game_server_id_seq")
    val id: Long? = null

    @ManyToOne
    @JoinColumn(name = "game_id", nullable = false)
    var game: Game? = null

    @ManyToOne
    @JoinColumn(name = "member_group_id", nullable = false)
    var memberGroup: MemberGroup? = null

    @Column(name = "container_id", nullable = false)
    var containerId: String? = null

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    var status: GameServerState? = null
}
