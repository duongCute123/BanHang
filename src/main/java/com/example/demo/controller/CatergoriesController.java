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

import com.example.demo.entity.Catergori;
import com.example.demo.service.CatergoriesService;

@RestController
@RequestMapping("/api/catergories")
public class CatergoriesController {
	@Autowired
	CatergoriesService catergoriesService;

	@GetMapping("")
	public String getHello() {
		return "hello Catergory";
	}

	@GetMapping("/list")
	public List<Catergori> getAllCategori() {
		List<Catergori> catergoris = catergoriesService.findAllCategory();
		return catergoris;
	}

	@GetMapping("/list/{id}")
	public Catergori getById(@PathVariable int id) {
		return catergoriesService.catergori(id);
	}

	@PostMapping("/list")
	public Catergori themCategory(@RequestBody Catergori catergori) {
		catergoriesService.saveCatergorie(catergori);
		return catergori;
	}
	@DeleteMapping("/list")
	public String xoaCatergori(@PathVariable int id) {
		catergoriesService.xoaCatergories(id);
		return "Xoa thanh cong nhe" + id;
	}

}
