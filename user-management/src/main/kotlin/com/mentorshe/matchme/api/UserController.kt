package com.mentorshe.matchme.api

import com.mentorshe.matchme.domain.entity.Greeting
import com.mentorshe.matchme.domain.entity.ResponseStatus
import com.mentorshe.matchme.domain.entity.User
import com.mentorshe.matchme.domain.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
class UserController  @Autowired constructor(private val userService: UserService) {


    @GetMapping("/view")
    fun view(@RequestParam(value = "firstName", defaultValue = "Srujana") name: String) =
            ResponseStatus("200", "OK,  $name")
    // userService.findUserByFirstName(firstName)



  /* @GetMapping("/viewById")
    fun view(@RequestParam(value = "id", defaultValue = "1") id: Int) =
            userService.findUserById(id)
           // User(1, "Sajal", "Cherukuri", "t@t.com", "04000", "AUS", "Mentee")
*/
    @GetMapping("/list")
    fun listAllUsers() : Collection<User> {
        /*val user1 = User(1, "Sajal", "Cherukuri", "t@t.com", "04000", "AUS", "Mentee")
        val user2 = User(2, "Srujana", "Cherukuri", "s@h.com", "040001", "AUS", "Mentor")

        val users = listOf(user1, user2)
        return users*/
        return userService.findAllUsers();

    }


    @PutMapping(
            value = ["/modify"],
            consumes = [ MediaType.APPLICATION_JSON_VALUE],
            produces = [ MediaType.APPLICATION_JSON_VALUE]
    )
    fun modify(@RequestBody user : User): ResponseStatus{
        val responseStatus = ResponseStatus("200", "OK")
        return responseStatus
    }


}