package de.maurer.gamegarden.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/member")
class MemberController {

    @GetMapping("/list")
    fun getAllMembers() {

    }
}