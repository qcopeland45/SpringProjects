package com.github.qcopeland45.salarydata.examplecontroller


import com.github.qcopeland45.salarydata.dao.UserDao
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
class Service(
        private val repository: UserDao,
        private val jdbcTemplate: JdbcTemplate
) {


    //just used as an example
    data class MyResponse(val message: String)

    fun getEndPointValue() = MyResponse("This is Service endpoint!")


    fun createTable() {
        repository.createUserTable()
    }


    //fix
    fun insertUser(fn: String, ln: String) {
        //TODO Implement
        val query = "INSERT INTO Users(firstName,lastName) VALUES (?,?), fn, ln"
        jdbcTemplate.update(query)

    }
}