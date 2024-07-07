package de.maurer.gamegarden.model

import de.maurer.gamegarden.model.base.RootEntity
import jakarta.persistence.*
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.sql.Timestamp

@Entity
@Table(name = "game")
class Game: RootEntity() {

    @Id
    @SequenceGenerator(name = "game_id_seq", sequenceName = "game_id_seq")
    val id: Long? = null

    @Column(name = "name", nullable = false)
    var name: String? = null

    @Column(name = "image", nullable = false)
    var image: String? = null

    @Column(name = "registry_url", nullable = false)
    var registryUrl: String? = null


}

