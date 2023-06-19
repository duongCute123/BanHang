package com.example.demo.reponsetori;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Customer;

public interface CustomerReponsetory extends JpaRepository<Customer, Integer>{

}
