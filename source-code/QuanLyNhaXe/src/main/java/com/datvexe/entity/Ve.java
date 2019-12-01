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
@Table(name = "Ve")
public class Ve {
	
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	@Column(name="idVe")
	private Long idVe;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idLichTrinh")
	private LichTrinh idLichTrinh;
	
	@Column(name ="SoVeDat")
	private int soVeDat;
	
	@Column(name="DonVe")
	private int donGia;
	
	@OneToMany(mappedBy = "idVe")
	private List<KhachHang> khachHang = new ArrayList<KhachHang>();

	public Long getIdVe() {
		return idVe;
	}

	public void setIdVe(Long idVe) {
		this.idVe = idVe;
	}

	public LichTrinh getIdLichTrinh() {
		return idLichTrinh;
	}

	public void setIdLichTrinh(LichTrinh idLichTrinh) {
		this.idLichTrinh = idLichTrinh;
	}

	public int getSoVeDat() {
		return soVeDat;
	}

	public void setSoVeDat(int soVeDat) {
		this.soVeDat = soVeDat;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	public List<KhachHang> getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(List<KhachHang> khachHang) {
		this.khachHang = khachHang;
	}
	
	
}

