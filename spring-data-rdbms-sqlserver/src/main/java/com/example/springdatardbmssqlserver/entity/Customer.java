package com.example.springdatardbmssqlserver.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "customer", schema = "dbo")
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotNull
    @Column(name = "firstName", columnDefinition = "varchar(20)", unique = true)
    public String firstName;

    @NotNull
    @Column(name = "lastName", columnDefinition = "varchar(20)", unique = true)
    public String lastName;

    protected Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
