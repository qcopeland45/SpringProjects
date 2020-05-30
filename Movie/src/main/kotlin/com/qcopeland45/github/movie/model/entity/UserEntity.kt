package com.qcopeland45.github.movie.model.entity

import java.util.*
import javax.persistence.*


@Entity
@Table(name = "users")
class UsersEntity(

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    val user_id: UUID,

    @Column(name = "first_name")
    val firstName: String,

    @Column(name = "last_name")
    val lastName: String?
)