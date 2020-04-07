package com.mentorshe.matchme.api

import com.mentorshe.matchme.domain.entity.ResponseStatus
import com.mentorshe.matchme.domain.entity.User
import com.mentorshe.matchme.domain.repository.UserRepository
import com.mentorshe.matchme.domain.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
class LoginController{

    @PostMapping(
            value = ["/register"],
            consumes = [ MediaType.APPLICATION_JSON_VALUE],
            produces = [ MediaType.APPLICATION_JSON_VALUE]
    )
    fun register(@RequestBody user : User): ResponseStatus{
        return ResponseStatus("200", "OK")
    }

    @PostMapping(
            value = ["/login"],
            consumes = [ MediaType.APPLICATION_JSON_VALUE],
            produces = [ MediaType.APPLICATION_JSON_VALUE]
    )
    fun login(@RequestBody user : User): ResponseStatus{
        return ResponseStatus("200", "OK")
    }
}