package com.example.springdatardbmsmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.springdatardbmsmysql.repository")
@SpringBootApplication
public class SpringDataMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataMysqlApplication.class, args);
    }

}
