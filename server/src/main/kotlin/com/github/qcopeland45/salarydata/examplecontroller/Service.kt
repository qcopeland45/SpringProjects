package com.github.qcopeland45.salarydata.examplecontroller


import com.github.qcopeland45.salarydata.dao.UserDao
import org.springframework.dao.DataAccessException
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


    //This function is terrible for various reason and needs to be updated.
    //But the goal was to get one person into the DB today and that was accomplished
    //Also only able to input user when hitting end point "/api/map": see Controller.kt file for more details
    fun insertUser(firstN: String, lastN: String) {
        //TODO Implementation in progress
        val query = "INSERT INTO Users(id,first_name,last_name) VALUES (?,?,?)"
        try{
            jdbcTemplate.update(query,99,firstN,lastN)
        } catch (dae: DataAccessException) {
            print("Data Access Exception Caught: ${dae.message}")
        }


    }
}