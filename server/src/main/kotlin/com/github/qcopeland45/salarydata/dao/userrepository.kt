package com.github.qcopeland45.salarydata.dao

import org.springframework.context.annotation.Bean
import org.springframework.dao.DataAccessException
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class UserDao(val jdbcTemplate: JdbcTemplate) {

    //should probably be moved to a config package
    //and configured to create table on application startup
    @Bean
    fun createUserTable() {
        val sql = "CREATE TABLE IF NOT EXISTS Users " +
                "(id INT NOT NULL, " +
                " first_name VARCHAR(255), " +
                " last_name VARCHAR(255), " +
                " PRIMARY KEY (id)" +
                ")"
        try{
            jdbcTemplate.execute(sql)
        } catch (d: DataAccessException) {
            println(d.message)
        }
    }
}