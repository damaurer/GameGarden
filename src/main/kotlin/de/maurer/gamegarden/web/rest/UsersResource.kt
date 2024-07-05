package de.maurer.gamegarden.web.rest

import de.maurer.gamegarden.service.UsersService
import de.maurer.gamegarden.web.dto.UsersDTO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * The `UsersResource` class is a REST controller that handles requests related to users.
 *
 * @property usersService The service responsible for retrieving users' data.
 */
@RestController("api/users/")
class UsersResource {

    @Autowired
    private lateinit var usersService: UsersService


    @GetMapping("/all")
    @PreAuthorize("hasRole('admin')")
    fun getAllUsers(): List<UsersDTO> {
        return usersService.getTableData()
    }

    @GetMapping()
    fun getAllUserNames(): List<String> {
        return usersService.getUserNames()
    }
}