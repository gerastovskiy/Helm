package ru.cource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.SQLException;

@SpringBootApplication(scanBasePackages = "ru.cource")
public class Main {
    public static void main(String[] args) throws SQLException {
        SpringApplication.run(Main.class,args);
    }
}