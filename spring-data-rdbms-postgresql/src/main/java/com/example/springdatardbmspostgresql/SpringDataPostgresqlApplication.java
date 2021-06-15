package com.example.springdatardbmspostgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.springdatardbmspostgresql.repository")
@SpringBootApplication
public class SpringDataPostgresqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataPostgresqlApplication.class, args);
    }

}
