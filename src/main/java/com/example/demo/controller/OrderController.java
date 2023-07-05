package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Order;
import com.example.demo.entity.OrderDetail;
import com.example.demo.service.OrderService;

@RequestMapping("/api/v1")
public class OrderController {

	@Autowired
	OrderService orderService;
	@Autowired
	OrderDetail orderDetail;

	@GetMapping("/order")
	public List<Order> getALlOrder() {
		return orderService.findAllOrder();
	}
	
	public Order getOneOrder() {
		
	}
}
