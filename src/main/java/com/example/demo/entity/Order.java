package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name ="Orders" )
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orderId")
	int id;
	Date ngayDat;
	String soDthoai;
	String diaChi;
	String tranThai;
	String thongTin;
	@OneToMany(mappedBy = "order")
	List<OrderDetail> orderDetails;
	@ManyToOne
	@JoinColumn(name = "customerId")
	Customer customer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getNgayDat() {
		return ngayDat;
	}
	public void setNgayDat(Date ngayDat) {
		this.ngayDat = ngayDat;
	}
	public String getSoDthoai() {
		return soDthoai;
	}
	public void setSoDthoai(String soDthoai) {
		this.soDthoai = soDthoai;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getTranThai() {
		return tranThai;
	}
	public void setTranThai(String tranThai) {
		this.tranThai = tranThai;
	}
	public String getThongTin() {
		return thongTin;
	}
	public void setThongTin(String thongTin) {
		this.thongTin = thongTin;
	}
	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
