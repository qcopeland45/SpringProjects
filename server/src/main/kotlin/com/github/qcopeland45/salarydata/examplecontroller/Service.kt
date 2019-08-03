package com.github.qcopeland45.salarydata.examplecontroller


import com.github.qcopeland45.salarydata.dao.UserDao
import org.springframework.stereotype.Service

@Service
class Service(private val repository: UserDao) {

    data class MyResponse(val message: String)

    fun getEndPointValue() = MyResponse("This is Service endpoint!")


    fun createTable() {
        repository.createUserTable()
    }
}