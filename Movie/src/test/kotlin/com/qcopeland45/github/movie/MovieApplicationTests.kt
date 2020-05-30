package com.qcopeland45.github.movie

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class MovieApplicationTests(val jdbcTemplate: JdbcTemplate) {


	@Test
	fun uniqueTest() {
		//TODO implement some tests
	}

}
