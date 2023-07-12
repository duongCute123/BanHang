package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	@Autowired
	ProductService productService;

	@GetMapping("")
	public String getHello() {
		return "Hello product";
	}

	@GetMapping("/product")
	public List<Product> getAllProduct() {
		List<Product> list = productService.findAllproduct();
		return list;
	}

	@GetMapping("/product/{id}")
	public Product getById(@PathVariable int id) {
		return productService.getById(id);

	}

	@PostMapping("/product")
	public Product themProduct(@RequestBody Product product) {
		productService.saveProduct(product);
		return product;
	}

	@DeleteMapping("/product/{id}")
	public String xoaProduct(@PathVariable int id) {
		productService.xoaProduct(id);
		return "Xoá tahnffh công product"+id;
	}

//	@RequestMapping(method = RequestMethod.GET)
//	public List<Product> findByName(@RequestParam(value = "ten") String ten) {
//		List<Product> products = productService.findBytenProduct(ten);
//		return products;
//	}
}
