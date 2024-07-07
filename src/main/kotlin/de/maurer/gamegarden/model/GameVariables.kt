package de.maurer.gamegarden.model

import de.maurer.gamegarden.model.base.RootEntity
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
class GameVariables: RootEntity() {

    @Id
    @SequenceGenerator(name = "game_variables_id_seq", sequenceName = "game_variables_id_seq")
    val id: Long? = null

    @ManyToOne
    @JoinColumn(name = "game_id", nullable = false)
    var game: Game? = null

    @Column(name = "variable", nullable = false)
    var variable: String? = null

    @Column(name = "value", nullable = false)
    var value: String? = null
}