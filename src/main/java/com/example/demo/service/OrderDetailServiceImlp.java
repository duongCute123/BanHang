package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.OrderDetail;
import com.example.demo.reponsetori.OrderDetailReponsetory;

@Service
public class OrderDetailServiceImlp implements OrderDetailService {
	OrderDetailReponsetory orderDetailReponsetory;

	@Autowired
	public OrderDetailServiceImlp(OrderDetailReponsetory theOrderDetailReponsetory) {
		orderDetailReponsetory = theOrderDetailReponsetory;
	}

	@Override
	public List<OrderDetail> findAllOrder() {
		List<OrderDetail> details=new ArrayList<>();
		details=orderDetailReponsetory.findAll();
		return details;
	}

	@Override
	public OrderDetail findByOne(int id) {
		Optional<OrderDetail>  optional=orderDetailReponsetory.findById(id);
		OrderDetail orderDetail=null;
		if (optional.isPresent()) {
			orderDetail=optional.get();
		}else {
			new RuntimeException("Khong co id can tim"+id);
		}
		return orderDetail;
	}

	@Override
	public void addOrderDetail(OrderDetail orderDetail) {
		orderDetailReponsetory.save(orderDetail);

	}

	@Override
	public void xoaOrderDetail(int id) {
		orderDetailReponsetory.deleteById(id);

	}

}
