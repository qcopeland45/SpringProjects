package com.qcopeland45.github.Movie.Repositories

import com.qcopeland45.github.Movie.Entities.Users
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<Users, String>
