package com.qcopeland45.github.Movie.Entities

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "MoveiesTable")
data class Users(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // change to auto
    val id: Long,

    @Column
    val firstName: String,

    @Column
    val lastName: String?,

    @Column
    val movieName: String,

    @Column
    val yearWatched: Date
)