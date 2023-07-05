package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;
import com.example.demo.reponsetori.OrderReponsetory;

@Service
public class OrderServiceImlp implements OrderService {
	OrderReponsetory orderReponsetory;

	@Autowired
	public OrderServiceImlp(OrderReponsetory theOrderReponsetory) {
		orderReponsetory = theOrderReponsetory;
	}

	@Override
	public List<Order> findAllOrder() {
		List<Order> list = new ArrayList<>();
		list = orderReponsetory.findAll();
		return list;
	}

	@Override
	public Order finByOneOrder(int id) {
		Optional<Order> optional = orderReponsetory.findById(id);
		Order order = null;
		if (optional.isPresent()) {
			order = optional.get();
		} else {
			new RuntimeException("Khog tim thay don hang" + id);
		}
		return order;
	}

	@Override
	public void addOrder(Order order) {
		orderReponsetory.save(order);

	}

	@Override
	public void xoaOrder(int id) {

		orderReponsetory.deleteById(id);
	}

}
