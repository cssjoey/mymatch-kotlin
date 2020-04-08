package com.mentorshe.matchme.domain.entity

import com.fasterxml.jackson.annotation.JsonCreator
import javax.persistence.*


@Entity
@Table(name="user", schema="matchme")
data class User @JsonCreator constructor(
        @Id val id: Long,
        val firstName: String,
        val lastName: String,
        val email: String,
        val mobile: String,
        val address: String,
        val type: String
)