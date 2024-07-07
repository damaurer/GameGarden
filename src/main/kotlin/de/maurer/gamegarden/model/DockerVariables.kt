package de.maurer.gamegarden.model

import de.maurer.gamegarden.model.base.RootEntity
import de.maurer.gamegarden.model.enums.DockerVariablesTyp
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
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.sql.Timestamp

@Entity
@Table(name = "docker_variables")
class DockerVariables: RootEntity() {

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

    @Enumerated(EnumType.STRING)
    @Column(name = "typ", nullable = false)
    var typ: DockerVariablesTyp? = null

    @Column(name = "is_env", nullable = false)
    var isEnv: Boolean = false


}

