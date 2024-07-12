package de.maurer.gamegarden.model

import de.maurer.gamegarden.model.base.RootEntity
import de.maurer.gamegarden.model.enums.GameServerState
import jakarta.persistence.*

@Entity
@Table(name = "game_server")
class GameServer : RootEntity() {

    @Id
    @SequenceGenerator(name = "game_server_id_seq", sequenceName = "game_server_id_seq")
    val id: Long? = null

    @ManyToOne
    @JoinColumn(name = "game_id", nullable = false)
    var game: Game? = null

    @ManyToOne
    @JoinColumn(name = "member_group_id", nullable = false)
    var groupMembers: GroupMembers? = null

    @Column(name = "container_id", nullable = false)
    var containerId: String? = null

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    var status: GameServerState? = null
}
