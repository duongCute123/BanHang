package com.example.demo.reponsetori;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Order;

public interface OrderReponsetory extends JpaRepository<Order, Integer> {

}
