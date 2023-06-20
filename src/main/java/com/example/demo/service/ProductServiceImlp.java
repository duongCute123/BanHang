package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;
import com.example.demo.reponsetori.ProductReponsetory;

@Repository
public class ProductServiceImlp implements ProductService {
	ProductReponsetory productReponsetory;

	@Autowired
	public ProductServiceImlp(ProductReponsetory theProductReponsetory) {
		// TODO Auto-generated constructor stub
		productReponsetory = theProductReponsetory;
	}

	@Override
	public List<Product> findAllproduct() {
		List<Product> products = new ArrayList<>();
		products = productReponsetory.findAll();
		return products;
	}

	@Override
	public Product getById(int id) {
		Optional<Product> optional = productReponsetory.findById(id);
		Product product = null;
		if (optional.isPresent()) {
			product = optional.get();
		} else {
			throw new RuntimeException("Lỗi tìm sản phẩm này nhứ");
		}
		return product;
	}

	@Override
	public void saveProduct(Product product) {
		productReponsetory.save(product);

	}

	@Override
	public void xoaProduct(int id) {
		productReponsetory.deleteById(id);

	}
	// Tim san pham theo ten nhe
	@Override
	public List<Product> findBytenProduct(String tenProduct) {
		List<Product> products=productReponsetory.findByName(tenProduct);
		
		return products;
	}

}
