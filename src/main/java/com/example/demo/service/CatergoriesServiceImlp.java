package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Catergori;
import com.example.demo.reponsetori.CatergoriReponsetory;

@Repository
public class CatergoriesServiceImlp implements CatergoriesService{
	CatergoriReponsetory catergoriReponsetory;
	@Autowired
	public CatergoriesServiceImlp(CatergoriReponsetory theCatergoriReponsetory) {
		// TODO Auto-generated constructor stub
		catergoriReponsetory=theCatergoriReponsetory;
	}
	@Override
	public List<Catergori> findAllCategory() {
		// TODO Auto-generated method stub
		List<Catergori> catergoris=new ArrayList<>();
		catergoris=catergoriReponsetory.findAll();
		return catergoris;
	}
	@Override
	public Catergori catergori(int id) {
		Optional<Catergori> optional=catergoriReponsetory.findById(id);
		Catergori catergori=null;
		if (optional.isPresent()) {
			catergori=optional.get();
		}else {
			throw new RuntimeException("Khong co id can tim"+id);
		}
		return catergori;
	}
	@Override
	public void saveCatergorie(Catergori catergori) {
		catergoriReponsetory.save(catergori);
		
	}
	@Override
	public void xoaCatergories(int id) {
		catergoriReponsetory.deleteById(id);
		
	}
	
}
