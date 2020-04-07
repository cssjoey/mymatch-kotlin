package com.mentorshe.matchme.domain.service

import com.mentorshe.matchme.domain.entity.User
import com.mentorshe.matchme.domain.repository.UserRepository
import org.bson.types.ObjectId
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService @Autowired constructor(private val userRepository : UserRepository) {


   fun findUserById(id : ObjectId) : Optional<User> =
        userRepository.findById(id)

    fun findAllUsers() : Collection<User> =
            userRepository.findAll()
}
