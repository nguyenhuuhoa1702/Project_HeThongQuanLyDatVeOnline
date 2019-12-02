package com.datvexe.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "NhanSu")
public class NhanSu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idNhanSu;
	
 	@ManyToOne(fetch = FetchType.LAZY)
 	@JoinColumn(name ="idTenTaiKhoan")
 	private TaiKhoan idTaiKhoan;
 	
 	@Column(name= "HoTen")
 	private String HoTen;

	@Column(name = "NamSinh")
 	private int namSinh;
 	
 	@Column(name="Email")
 	private String email;
 	
 	@Column(name="SoDienThoai")
 	private int soDienThoai;

 	@OneToMany(mappedBy ="idNhanSu")
 	private List<Xe> xe = new ArrayList<Xe>();
 	
 	
	public Long getIdNhanSu() {
		return idNhanSu;
	}

	public void setIdNhanSu(Long idNhanSu) {
		this.idNhanSu = idNhanSu;
	}


	public TaiKhoan getIdTaiKhoan() {
		return idTaiKhoan;
	}

	public void setIdTaiKhoan(TaiKhoan idTaiKhoan) {
		this.idTaiKhoan = idTaiKhoan;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
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
 	public List<Xe> getXe() {
		return xe;
	}

	public void setXe(List<Xe> xe) {
		this.xe = xe;
	}
}
