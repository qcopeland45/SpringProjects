package com.github.qcopeland45.salarydata.examplecontroller

import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RequestParam


@RestController
class Controller(private val service: Service) {

    @GetMapping("/api/test", produces = ["application/json"])
    fun example() = service.getEndPointValue()

    @GetMapping
    fun testTable() {
        service.createTable()
    }

    @GetMapping("/api/map")
    fun createUser(@RequestParam(required = true) fullName: List<String>): String {
        var name = ""
        fullName.forEach {name += "$it "}
        var first = fullName[0]; val last = fullName[1]

        service.insertUser(first,last)

        return "User Name: $name"
    }




//********************************************************************************//
    //learning purposes
    @RequestMapping("/test1")
    fun test1(@RequestParam(defaultValue = "no input") name: String) : String {
        return("this is the name of the user $name")
    }

    @RequestMapping("/test2")
    fun test2(@RequestParam(required = true) name: String) : String {
        return "The name you entered is $name"
    }

    @RequestMapping("/test3")
    fun test3(@RequestParam("param1") name: String) : String {
        return "param1 you entered was: $name"
    }

    @GetMapping("/test4/{age}")
    fun test4(@PathVariable age: String) : String {
        return "Path variable param: $age"
    }

    @GetMapping("/test5/optional", "/test5/optional/{schoolName}")
    fun test5(@PathVariable(required = false) schoolName: String?) : String {
        return "The name of the school you entered is $schoolName"
    }
}