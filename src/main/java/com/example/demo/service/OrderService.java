package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Order;

public interface OrderService {
	public List<Order> findAllOrder();
	public Order finByOneOrder(int id);
	public void addOrder(Order order);
	public void xoaOrder(int id);
}
