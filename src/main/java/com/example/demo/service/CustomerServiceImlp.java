package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.reponsetori.CustomerReponsetory;

@Service
public class CustomerServiceImlp implements CustomerService {
	CustomerReponsetory customerReponsetory;

	@Autowired
	public CustomerServiceImlp(CustomerReponsetory theCustomerReponsetory) {
		customerReponsetory = theCustomerReponsetory;
	}

	@Override
	public List<Customer> findAllCustomer() {
		// Lay danh sach khach hang
		List<Customer> customers = new ArrayList<>();
		customers = customerReponsetory.findAll();
		return customers;
	}

	@Override
	public Customer findByIdCustomer(int id) {
		Optional<Customer> optional = customerReponsetory.findById(id);
		Customer customer = null;
		if (optional.isPresent()) {
			customer = optional.get();
		} else {
			throw new RuntimeException("Khong co id can tim nhe" + id);
		}
		return customer;
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerReponsetory.save(customer);

	}

	@Override
	public void xoaCustomer(int id) {
		customerReponsetory.deleteById(id);

	}

}
