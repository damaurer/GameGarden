package de.maurer.gamegarden.controller

import de.maurer.gamegarden.service.UsersService
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/user")
class UserController(val usersService: UsersService) {

    @GetMapping("/login")
    fun login(): String {
        return "Login!"
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    fun admin(): String {
        return "Admin!"
    }

    @GetMapping("/user")
    fun user(): String {
        return usersService.getAllUsersData().toString()
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