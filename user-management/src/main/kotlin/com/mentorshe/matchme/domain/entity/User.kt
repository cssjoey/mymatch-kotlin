package com.mentorshe.matchme.domain.entity

import com.fasterxml.jackson.annotation.JsonCreator
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.math.BigInteger


@Document
data class User @JsonCreator constructor(
       @Id val id : ObjectId,
     //   @Field val userId: Int,
        @Field val firstName: String, @Field val secondName: String,
        @Field val email: String, @Field val mobile: String,
        @Field val address: String, @Field val userType: String
                )