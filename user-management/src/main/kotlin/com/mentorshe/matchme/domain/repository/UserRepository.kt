package com.mentorshe.matchme.domain.repository

import com.mentorshe.matchme.domain.entity.User
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*


interface UserRepository : MongoRepository<User, Int> {
    override fun findAll(): MutableList<User>{
        return findAll()
    }
    override fun findById(id: Int): Optional<User>{
        return findById(id)
    }


/*
    override fun <User : User?> insert(user: User): User {
        return user
    }*/
}

/* Hellooooooooooooo Srujana.
Need to use CRUD Repository instead of binding to the MongoRepository
 */
