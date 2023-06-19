package com.example.demo.reponsetori;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.OrderDetail;

public interface OrderDetailReponsetory extends JpaRepository<OrderDetail, Integer> {

}
