package com.example.springdatardbmsmysql.repository;

import com.example.springdatardbmsmysql.AbstractContainerBaseTest;
import com.example.springdatardbmsmysql.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerRepositoryTest extends AbstractContainerBaseTest {

    @Autowired
    private CustomerRepository repository;

    @Test
    public void shouldReturnListOfCustomers() {
        List<Customer> customers = repository.findAll();
        assertEquals(2, customers.size());
    }

    @Test
    public void shouldReturnCustomersByLastName() {
        List<Customer> customers = repository.findCustomerByLastName("TestLastName");
        assertEquals(1, customers.size());
    }
}
