package com.example.demo.service;

import com.example.demo.entity.Order;

public interface OrderService {
	public Order findAllOrder();
	public Order finByOneOrder(int id);
	public void addOrder(Order order);
	public Order xoaOrder(int id);
}
