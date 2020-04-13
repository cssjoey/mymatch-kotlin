package com.mentorshe.matchme.domain.service

import com.mentorshe.matchme.domain.entity.ResponseStatus
import com.mentorshe.matchme.domain.entity.User
import com.mentorshe.matchme.domain.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService @Autowired constructor(private var userRepository : UserRepository) {


    fun findAllUsers() : Iterable<User> =
            userRepository.findAll()

    fun findUserByFirstName(firstName : String) : Iterable<User> =
            userRepository.findByFirstName(firstName)

    fun findUserByLastName(lastName : String) : Iterable<User> =
            userRepository.findByLastName(lastName)

    fun registerUser(user : User) : User =
      /*  if (userRepository.existsById(user.id))
            return ResponseStatus("100", "User already exists")
            */
        userRepository.save(user)


/*    fun modifyUser(user : User) : User {

        userRepository.save(user)

    }*/


}
