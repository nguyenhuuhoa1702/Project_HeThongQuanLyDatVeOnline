package com.datvexe.entity;

import java.sql.Date;
import java.sql.Time;
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
@Table(name = "LichTrinh")
public class LichTrinh {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private Long idLichTrinh;

	@Column(name="DiemDi")
	private String diemDi;
	
	@Column(name="DiemDen")
	private String diemDen;
	
	@Column(name = "ngayDi", columnDefinition="Date")
	private Date ngayDi;

	@Column(name = "thoiGianDi", columnDefinition="Time")
	private Time thoiGian;
	
	@Column(name = "thoiGianDen" , columnDefinition = "Time")
	private Time thoiGianDen;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BienSoXe")
	private Xe BienSoXe;
	
	@Column(name="DonVe")
	private int donGia;
	
	// Nơi lưu vào mapping với idVe
	@OneToMany(mappedBy = "idLichTrinh")
	private List<Ve> ve = new ArrayList<Ve>();

	
	public Date getNgayDi() {
		return ngayDi;
	}

	public void setNgayDi(Date ngayDi) {
		this.ngayDi = ngayDi;
	}

	public Time getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(Time thoiGian) {
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

	public Time getThoiGianDen() {
		return thoiGianDen;
	}

	public void setThoiGianDen(Time thoiGianDen) {
		this.thoiGianDen = thoiGianDen;
	}	
}
