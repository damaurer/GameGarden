package de.maurer.gamegarden.model

import jakarta.persistence.Column
import jakarta.persistence.Embeddable
import java.io.Serializable

@Embeddable
class MemberToGroupKey (
    @Column(name = "member_id" , nullable = false)
    val memberId: Int,
    @Column(name = "group_id" , nullable = false)
    val groupId: Int
): Serializable