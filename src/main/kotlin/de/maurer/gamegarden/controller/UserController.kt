package de.maurer.gamegarden.controller

import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("api/user")
class UserController {

    @GetMapping("/login")
    fun login(): String {
        return "Login!"
    }

    @GetMapping("/admin")
    fun admin(): String {
        return "Admin!"
    }

    @GetMapping("/user")
    fun user(): String {
        return "User!"
    }

    @GetMapping("/all")
    fun allRoles(): String {
        return "All Roles!"
    }

    @DeleteMapping("/delete")
    fun delete(@RequestBody s: String): String {
        return "I am deleting $s"
    }
}