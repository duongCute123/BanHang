package com.example.demo.reponsetori;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Product;

public interface ProductReponsetory extends JpaRepository<Product, Integer> {

}
