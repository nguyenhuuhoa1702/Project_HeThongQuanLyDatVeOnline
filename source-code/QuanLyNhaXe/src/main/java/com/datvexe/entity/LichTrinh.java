package com.datvexe.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LichTrinh")
public class LichTrinh {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private Long idLichTrinh;

	@Column(name="DiemDi")
	private String diemDi;
	
	@Column(name="DiemDen")
	private String diemDen;
	
	@Column(name = "ngayDi")
	private String ngayDi;

	@Column(name = "thoiGian")
	private String thoiGian;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BienSoXe")
	private Xe BienSoXe;
	
	@Column(name="DonVe")
	private int donGia;
	
	// Nơi lưu vào mapping với idVe
	@OneToMany(mappedBy = "idLichTrinh")
	private List<Ve> ve = new ArrayList<Ve>();

	public String getNgayDi() {
		return ngayDi;
	}

	public void setNgayDi(String ngayDi) {
		this.ngayDi = ngayDi;
	}

	public String getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(String thoiGian) {
		this.thoiGian = thoiGian;
	}

	public Long getIdLichTrinh() {
		return idLichTrinh;
	}

	public void setIdLichTrinh(Long idLichTrinh) {
		this.idLichTrinh = idLichTrinh;
	}

	public String getDiemDi() {
		return diemDi;
	}

	public void setDiemDi(String diemDi) {
		this.diemDi = diemDi;
	}

	public String getDiemDen() {
		return diemDen;
	}

	public void setDiemDen(String diemDen) {
		this.diemDen = diemDen;
	}

	public List<Ve> getVe() {
		return ve;
	}

	public void setVe(List<Ve> ve) {
		this.ve = ve;
	}

	public Xe getBienSoXe() {
		return BienSoXe;
	}

	public void setBienSoXe(Xe bienSoXe) {
		BienSoXe = bienSoXe;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}




}
