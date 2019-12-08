package com.datvexe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="KhachHang")
public class KhachHang {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private Long idKhachHang;
	
	@Column(name = "TenKhachHang")
	private String tenKhachHang;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="SoDienThoai")
	private int soDienThoai;
	
	@Column(name = "TinhTrangVe")
	private String tinhTrangVe;
	
	// Tạo khóa ngoại
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idVe")
	private Ve idVe;
	
	
	
	
	public String getTinhTrangVe() {
		return tinhTrangVe;
	}

	public void setTinhTrangVe(String tinhTrangVe) {
		this.tinhTrangVe = tinhTrangVe;
	}

	public Long getIdKhachHang() {
		return idKhachHang;
	}

	public void setIdKhachHang(Long idKhachHang) {
		this.idKhachHang = idKhachHang;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(int soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public Ve getIdVe() {
		return idVe;
	}

	public void setIdVe(Ve idVe) {
		this.idVe = idVe;
	}
	
	
	
}
