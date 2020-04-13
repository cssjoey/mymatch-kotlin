package com.mentorshe.matchme.domain.entity

import com.fasterxml.jackson.annotation.JsonCreator
import javax.persistence.*


@Entity
@Table(name="user", schema="matchme")
data class User @JsonCreator constructor(
        @Id val id: Long,
        var firstName: String,
        var lastName: String,
        var email: String,
        var mobile: String,
        var address: String,
        var type: String
)