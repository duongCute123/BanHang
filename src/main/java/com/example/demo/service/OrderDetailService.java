package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.OrderDetail;

public interface OrderDetailService {
	public List<OrderDetail> findAllOrder();

	public OrderDetail findByOne(int id);

	public void addOrderDetail(OrderDetail orderDetail);

	public void xoaOrderDetail(int id);
}
