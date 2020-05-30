package com.qcopeland45.github.movie.Services

import com.qcopeland45.github.movie.model.entity.UsersEntity
import com.qcopeland45.github.movie.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.*


@Service
class UserService(private val userRepository: UserRepository) {


    fun getUserByFirstName(firstName: String): Optional<UsersEntity> {
        return userRepository.findUsersEntityByFirstName(firstName)
    }
}

