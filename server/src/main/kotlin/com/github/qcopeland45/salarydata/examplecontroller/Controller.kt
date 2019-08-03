package com.github.qcopeland45.salarydata.examplecontroller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(private val testService: Service) {

    @GetMapping("/api/test", produces = ["application/json"])
    fun example() = testService.getEndPointValue()

    @GetMapping("/test")
    fun testTable() {
        testService.createTable()
    }


}