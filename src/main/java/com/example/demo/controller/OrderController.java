package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Order;
import com.example.demo.entity.OrderDetail;
import com.example.demo.service.OrderDetailService;
import com.example.demo.service.OrderService;

@RestController
@RequestMapping("/api/v1")
public class OrderController {
	@Autowired
	OrderService orderService;
	@Autowired
	OrderDetailService orderDetailService;

	@GetMapping("/order")
	public List<Order> getAllDonHang() {
		List<Order> list = new ArrayList<>();
		list = orderService.findAllOrder();
		return list;
	}

	@GetMapping("/orderdetail")
	public List<OrderDetail> getAllChiTietDonHang() {
		List<OrderDetail> details = new ArrayList<>();
		details = orderDetailService.findAllOrder();
		return details;
	}

	/* Lấy thông tin của 1 chi tiết đơn hàng nhé */
	@GetMapping("/orderdetail/{id}")
	public OrderDetail getOneChiTietDonHang(@PathVariable int id) {
		return orderDetailService.findByOne(id);
	}

//	Lấy thông tin của 1 đơn hàng
	@GetMapping("/order/{id}")
	public Order findOneDonHang(@PathVariable int id) {
		return orderService.finByOneOrder(id);
	}

	/* Thêm 1 đơn hàng nhé */
	@PostMapping("/order")
	public Order themDonHang(@RequestBody Order order) {
		orderService.addOrder(order);
		return order;
	}

//	Thêm 1 thông tin chi tiết đơn hàng nhé
	@PostMapping("/orderdetail")
	public OrderDetail themChiTietDonHang(@RequestBody OrderDetail orderDetail) {
		orderDetailService.addOrderDetail(orderDetail);
		return orderDetail;
	}

//	Xoá 1 đơn hàng nhé
	@PostMapping("/order/{id}")
	public String xoaDonHang(@PathVariable int id) {
		orderService.xoaOrder(id);
		return "Xoá thành công nhé" + id;
	}

//	Xoá 1 chi tiết đơn hàng nhé các bạn
	@PostMapping("/orderdetail/{id}")
	public String xoaChiTietDonHanh(@PathVariable int id) {
		orderDetailService.xoaOrderDetail(id);
		return "Xoá thành công đơn hàng nhé bạn" + id;
	}

}