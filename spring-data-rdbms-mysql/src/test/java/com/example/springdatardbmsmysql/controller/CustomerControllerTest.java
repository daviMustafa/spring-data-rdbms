package com.example.springdatardbmsmysql.controller;

import com.example.springdatardbmsmysql.AbstractContainerBaseTest;
import com.example.springdatardbmsmysql.entity.Customer;
import com.example.springdatardbmsmysql.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerControllerTest extends AbstractContainerBaseTest {

    @Autowired
    private CustomerRepository repository;

    @Test
    public void getAllCustomers_Success() {

        final HttpEntity<String> request = new HttpEntity<>(null, new HttpHeaders());
        final ResponseEntity<List<Customer>> response = restTemplate.exchange(
                "/customer", HttpMethod.GET, request, new ParameterizedTypeReference<>() {
                });

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(2, response.getBody().size());
    }

    @Test
    public void saveCustomer_Success() {
        Customer customer = new Customer("TestPost", "TestPost");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.valueOf(MediaType.APPLICATION_JSON_VALUE));

        HttpEntity<Customer> request = new HttpEntity<>(customer, headers);

        final ResponseEntity<Customer> response = restTemplate.exchange(
                "/customer", HttpMethod.POST, request, new ParameterizedTypeReference<>() {
                });

        assertEquals(HttpStatus.OK, response.getStatusCode());
        repository.deleteById(response.getBody().getId());
        assertEquals(2, repository.findAll().size());
    }
}
