//package config
//
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.dao.DataAccessException
//import org.springframework.jdbc.core.JdbcTemplate
//
//@Configuration
//class config(private val jdbcTemplate: JdbcTemplate) {
//
//    @Bean
//    fun createUserTable() {
//        val sql = "CREATE TABLE Users " +
//                "(id int not NULL, " +
//                " firstName VARCHAR(255), " +
//                " lastName VARCHAR(255), " +
//                " PRIMARY KEY (id)" +
//                ")"
//        try {
//            jdbcTemplate.execute(sql)
//        } catch (d: DataAccessException) {
//            println(d.message)
//        }
//    }
//}
