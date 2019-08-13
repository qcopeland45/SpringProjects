package com.qcopeland45.github.Movie.Services

import com.qcopeland45.github.Movie.Repositories.UserRepository
import org.springframework.dao.DataAccessException
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service


@Service
class UserService(
    private val jdbcTemplate: JdbcTemplate,
    private val usersRepo: UserRepository
) {

    //testing to make sure project was set up correctly
    fun test1() : String {
        return "You have hit test1 end point: Congratulations"
    }

    fun createUser(firstN: String, lastN: String) : Boolean{
        //TODO finish implementing
        val insertQuery = "INSERT INTO Users(first_name, last_name) VALUES(quincy,copeland)"
        try {
            jdbcTemplate.update(insertQuery)
        } catch (dae: DataAccessException) {
            print("DataAccessException Caught: ${dae.message}")
        }
        return false //this needs to be changed
    }

    //TODO implement
    fun findUserb(id: Long) : String {
        return "NOT IMPLEMENTED"
    }


    //THIS IS A HUGE NO NO BUT UNTIL I CAN CONFIGURE
    //SPRING TO RUN MY SCHEMA.SQL FILE AT APPLICATION STARTUP THIS WILL DO
    fun createTable () {

        val sqlStatement = " CREATE TABLE if not exists MovieUsers (\n" +
                "  ID BIGINT NOT NULL,\n" +
                "  First_Name VARCHAR(50) NOT NULL,\n" +
                "  Last_Name VARCHAR(50),\n" +
                "  Movie_Name VARCHAR(255) UNIQUE NOT NULL,\n" +
                "  Year_Watched DATE,\n" +
                "  PRIMARY KEY (ID)\n" +
                ");"
        try {
            jdbcTemplate.execute(sqlStatement)
        } catch (dae: DataAccessException) {
            print("There was an error when creating tables: ${dae.cause.toString()}")
        }
    }

    fun initialData() : Boolean{
        val insertStmt = "INSERT INTO MovieUsers(id ,first_name, last_name, movie_name, year_watched)\n" +
                "VALUES\n" +
                "(1, 'Quincy', 'Copeland','Crazy Rich Asians', '12/30/2018'),\n" +
                "(2, 'Michele', 'Wolfenbarger','Oceans 8', '1/13/2019'),\n" +
                "(3, 'Lily', 'Wolfenbarger','Man with clocks on the wall', '1/20/2019'),\n" +
                "(4, 'Todd', 'Wolfenbarger','The Natural', '1/27/2019'),\n" +
                "(5, 'Will', 'Wolfenbarger','Creed 2', '2/3/2019'),\n" +
                "(6, 'Taylor', 'Wolfenbarger','Green Book', '2/10/2019'),\n" +
                "(7, 'Quincy', 'Copeland','Rocky 4', '2/17/2019'),\n" +
                "(8, 'Michele', 'Wolfenbarger','Free Solo', '3/31/2019'),\n" +
                "(9, 'Todd', 'Wolfenbarger','The Hate U Give', '4/7/2019'),\n" +
                "(10, 'Carlie', 'Wolfenbarger','Five Feet Away', '4/14/2019'),\n" +
                "(11, 'Taylor', 'Wolfenbarger','Fighting with Family', '6/28/2019'),\n" +
                "(12, 'Quincy', 'Wolfenbarger','Little', '7/4/2019'),\n" +
                "(13, 'Michele', 'Wolfenbarger','The White lion', '7/4/2019'),\n" +
                "(14, 'Todd', 'Wolfenbarger','The Imitation Game', '7/11/2019');"
        try {
            jdbcTemplate.execute(insertStmt)
        } catch (dae: DataAccessException) {
            print("Error occured trying to insert data in table: ${dae.cause.toString()}")
            return false
        }
        return true
    }


}