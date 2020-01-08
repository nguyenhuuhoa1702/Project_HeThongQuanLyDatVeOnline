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
@Table(name = "TinTuc")
public class TinTuc {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private Long idTinTuc;
	
	@Column(name="tenTinTuc")
	private  String tenTinTuc;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idLoaiTin")
	private LoaiTin idLoaiTin;
	
	@Column(name="TieuDe")
	private String tieuDe;
	
	@Column(name="NoiDung")
	private String noiDung;
	
	@Column(name="HinhAnh")
	private String hinhAnh;

	public Long getIdTinTuc() {
		return idTinTuc;
	}

	public void setIdTinTuc(Long idTinTuc) {
		this.idTinTuc = idTinTuc;
	}

	public String getTenTinTuc() {
		return tenTinTuc;
	}

	public void setTenTinTuc(String tenTinTuc) {
		this.tenTinTuc = tenTinTuc;
	}

	public LoaiTin getIdLoaiTin() {
		return idLoaiTin;
	}

	public void setIdLoaiTin(LoaiTin idLoaiTin) {
		this.idLoaiTin = idLoaiTin;
	}

	public String getTieuDe() {
		return tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	
	
}
