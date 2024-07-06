package de.maurer.gamegarden.controller

import de.maurer.gamegarden.base.RequestCriteria
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController("api/member")
class MemberController {

    @GetMapping("/list")
    fun getAllMembers(@RequestBody requestBody: RequestCriteria) {

    }
}