package com.qcopeland45.github.movie.repository

import com.qcopeland45.github.movie.model.entity.UsersEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository : CrudRepository<UsersEntity, UUID> {

    fun findUsersEntityByFirstName(firstName: String): Optional<UsersEntity>
}
