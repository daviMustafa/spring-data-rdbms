package com.example.springdatardbmsmysql.repository;

import com.example.springdatardbmsmysql.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
