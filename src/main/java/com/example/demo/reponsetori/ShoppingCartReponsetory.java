package com.example.demo.reponsetori;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ShoppingCart;

public interface ShoppingCartReponsetory extends JpaRepository<ShoppingCart,Integer> {

}
