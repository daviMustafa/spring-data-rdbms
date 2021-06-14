package com.example.springdatardbmssqlserver;

import org.junit.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MSSQLServerContainer;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;


/**
 * https://www.testcontainers.org/test_framework_integration/manual_lifecycle_control/#singleton-containers
 */
@ActiveProfiles("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Testcontainers
public class AbstractContainerBaseTest {

    @Autowired
    protected TestRestTemplate restTemplate;

    private static final DockerImageName myImage = DockerImageName.parse("microsoft/mssql-server-linux:2017-latest")
            .asCompatibleSubstituteFor("mcr.microsoft.com/mssql/server");

    private static final MSSQLServerContainer<?> msSQLContainer = new MSSQLServerContainer<>(myImage)
            .withPassword("P@ssw0rd")
            .acceptLicense();

    static {
        msSQLContainer.start();
    }

    @After
    public void after(){
        msSQLContainer.close();
    }

    @DynamicPropertySource
    static void databaseProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", msSQLContainer::getJdbcUrl);
        registry.add("spring.datasource.username", msSQLContainer::getUsername);
        registry.add("spring.datasource.password", msSQLContainer::getPassword);
    }
}
