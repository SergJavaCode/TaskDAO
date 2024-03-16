package ru.sergjava.dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootApplication
public class DaoApplication {

    private DataSource dataSource;

    public DaoApplication(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(DaoApplication.class, args);

    }

}
