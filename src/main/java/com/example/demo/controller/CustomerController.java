package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@GetMapping("/customer")
	public List<Customer> getAllCustomer() {
		return customerService.findAllCustomer();
	}

	@GetMapping("/customer/{id}")
	public Customer findByIdCustomer(@PathVariable int id) {
		return customerService.findByIdCustomer(id);
	}

	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
		return customer;
	}

	@PostMapping("/customer/{id}")
	public String xoaCustomer(@PathVariable int id) {
		customerService.xoaCustomer(id);
		return "Xoa thanh cong nhe " + id;
	}
}
