package com.example.springdatardbmsmysql.repository;

import com.example.springdatardbmsmysql.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findCustomerByLastName(String lastName);
}
