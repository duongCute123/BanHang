package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Customer;

public interface CustomerService {
//	Lấy danh sách khách hàng;
	List<Customer> findAllCustomer();

//	Lấy 1 khách hàng khi biết id;
	public Customer findByIdCustomer(int id);

//	Thêm hoặc cập nhật thông tin khách hàng;
	public void saveCustomer(Customer customer);

//	Xoá một khách hàng ra khỏi cớ sở dữ liệu;
	public void xoaCustomer(int id);
	
}
