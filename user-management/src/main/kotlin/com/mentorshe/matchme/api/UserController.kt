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


    @GetMapping("/listByFirstName")
    fun viewByFirstName(@RequestParam(value = "firstName", defaultValue = "Srujana") fname: String) :Iterable<User> {
        return userService.findUserByFirstName(fname)
    }

    @GetMapping("/listByLastName")
    fun viewByLastName(@RequestParam(value = "lastName", defaultValue = "Cherukuri") lname: String) =
            userService.findUserByLastName(lname)

    @GetMapping("/listAll")
    fun listAllUsers() : Iterable<User> =
        userService.findAllUsers();


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