package com.example.springdatardbmssqlserver.repository;

import com.example.springdatardbmssqlserver.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findCustomerByLastName(String lastName);
}
