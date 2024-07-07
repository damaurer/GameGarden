package de.maurer.gamegarden.model

import jakarta.persistence.Column
import jakarta.persistence.Embeddable
import java.io.Serializable

@Embeddable
class MemberToGroupKey (
    @Column(name = "member_id" , nullable = false)
    var memberId: Long,
    @Column(name = "group_id" , nullable = false)
    var groupId: Long
): Serializable