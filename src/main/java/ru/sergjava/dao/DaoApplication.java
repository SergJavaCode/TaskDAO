package ru.sergjava.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootApplication
public class DaoApplication {
    @Autowired
    private DataSource dataSource;

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(DaoApplication.class, args);

    }

}
