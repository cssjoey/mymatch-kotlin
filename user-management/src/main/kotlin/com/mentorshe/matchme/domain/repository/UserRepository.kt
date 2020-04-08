package com.mentorshe.matchme.domain.repository

import com.mentorshe.matchme.domain.entity.User
import org.springframework.data.repository.CrudRepository
import java.util.*


interface UserRepository : CrudRepository<User, Int> {
    fun findByFirstName(firstName :String ): Iterable<User>
    fun findByLastName(LastName :String ): Iterable<User>
}
