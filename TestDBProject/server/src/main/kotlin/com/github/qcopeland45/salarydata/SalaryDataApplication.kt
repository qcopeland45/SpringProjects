package com.github.qcopeland45.salarydata

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SalaryDataApplication

fun main(args: Array<String>) {
	runApplication<SalaryDataApplication>(*args)
	println("APPLICATION RUNNING")
}
