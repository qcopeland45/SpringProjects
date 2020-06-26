package com.qcopeland45.github.movie.controllers

import com.qcopeland45.github.movie.Services.UserService
import org.springframework.web.bind.annotation.*


@RestController
class UserController(private val userService: UserService){

    @GetMapping("/test/user/{firstName}")
    fun getUserName(@PathVariable firstName: String) =
            userService.getUserByFirstName(firstName)


    @GetMapping("test/character")
    @ResponseBody
    fun getUserThatContains(@RequestParam(required = true) lastName: String) =
            userService.findUserByLastName(lastName.toLowerCase())

}