package com.example.demo.reponsetori;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Product;

public interface ProductReponsetory extends JpaRepository<Product, Integer> {
	@Query(value = "SELECT e FROM Products e WHERE e.ten_product = ?1",nativeQuery = true)
	List<Product> findByName(String name);
}
