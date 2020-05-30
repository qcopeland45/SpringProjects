package com.qcopeland45.github.movie.controllers

import com.qcopeland45.github.movie.Services.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController(private val userService: UserService){

    @GetMapping("/test/user/{firstName}")
    fun getUserName(@PathVariable firstName: String) = userService.getUserByFirstName(firstName)




}