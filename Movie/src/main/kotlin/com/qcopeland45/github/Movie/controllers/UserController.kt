package com.qcopeland45.github.Movie.controllers

import com.qcopeland45.github.Movie.Services.UserService
import org.springframework.context.annotation.Bean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController(private val userService: UserService){

    @GetMapping("/test1/api")
    fun getTest1() : String {
        return userService.test1()
    }

    //THIS IS VERY HACKY AND VERY BAD, NEEDS TO BE UPDATED FOR BEST PRACTICE
    @Bean
    fun generate() {
        userService.createTable()
    }

    @GetMapping("insert/api")
    fun createBasicData() : String {
        val result = userService.initialData()
        if (result) {
            return "Data was successfully inserted"
        }
        return "Data was not inserted into table"
    }




}