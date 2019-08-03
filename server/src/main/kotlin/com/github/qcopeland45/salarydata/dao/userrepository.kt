package com.github.qcopeland45.salarydata.dao

import org.springframework.context.annotation.Bean
import org.springframework.dao.DataAccessException
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class UserDao(
    val jdbcTemplate: JdbcTemplate

) {

    @Bean //should probably be moved to a config package
    fun createUserTable() {
        val sql = "CREATE TABLE Users " +
                "(id int not NULL, " +
                " firstName VARCHAR(255), " +
                " lastName VARCHAR(255), " +
                " PRIMARY KEY (id)" +
                ")"
        try{
            jdbcTemplate.execute(sql)
        } catch (d: DataAccessException) {
            println(d.message)
        }
    }


    fun insertUser() {

    }



}// end of class