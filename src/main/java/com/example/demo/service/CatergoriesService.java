package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Catergori;

public interface CatergoriesService {
	List<Catergori> findAllCategory();

	Catergori catergori(int id);

	public void saveCatergorie(Catergori catergori);

	public void xoaCatergories(int id);
}
