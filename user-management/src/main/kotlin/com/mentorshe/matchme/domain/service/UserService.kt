package com.mentorshe.matchme.domain.service

import com.mentorshe.matchme.domain.entity.User
import com.mentorshe.matchme.domain.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService @Autowired constructor(private val userRepository : UserRepository) {


    fun findAllUsers() : Iterable<User> =
            userRepository.findAll()

    fun findUserByFirstName(firstName : String) : Iterable<User> =
            userRepository.findByFirstName(firstName)

    fun findUserByLastName(lastName : String) : Iterable<User> =
            userRepository.findByLastName(lastName)

}
