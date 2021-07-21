package com.example.springdatardbmspostgresql.controller;

import com.example.springdatardbmspostgresql.entity.Customer;
import com.example.springdatardbmspostgresql.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/customer", produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerController {

    private final CustomerRepository repository;

    @Autowired
    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Customer> listAll(){
        log.info("Listing all customers.");
        return repository.findAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Customer save(@RequestBody Customer usuario){
        log.info("Saving customer.");
        return repository.save(usuario);
    }
}
