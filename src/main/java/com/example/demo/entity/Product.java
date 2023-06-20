package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productId")
	int id;
	String tenProduct;
	String moTa;
	String thongTin;
	int soLuong;
	double gia;
	Date ngayNhap;
	String anh;
	@ManyToOne
	@JoinColumn(name = "catergoriId")
	@JsonIgnore
	Catergori catergori;
	@OneToMany(mappedBy = "product")
	@JsonIgnore
	List<OrderDetail> details;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenProduct() {
		return tenProduct;
	}
	public void setTenProduct(String tenProduct) {
		this.tenProduct = tenProduct;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getThongTin() {
		return thongTin;
	}
	public void setThongTin(String thongTin) {
		this.thongTin = thongTin;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public Date getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public Catergori getCatergori() {
		return catergori;
	}
	public void setCatergori(Catergori catergori) {
		this.catergori = catergori;
	}
	public List<OrderDetail> getDetails() {
		return details;
	}
	public void setDetails(List<OrderDetail> details) {
		this.details = details;
	}
	
	
}
