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
@Table(name = "ViTriDonTra")
public class ViTriDonTra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idViTri;

	@Column( name = "tenTuyenXe")
	private String tenTuyenXe;
	
	@Column(name = "diaChi")
	private String diaChi;

	public Long getIdViTri() {
		return idViTri;
	}

	public void setIdViTri(Long idViTri) {
		this.idViTri = idViTri;
	}


	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getTenTuyenXe() {
		return tenTuyenXe;
	}

	public void setTenTuyenXe(String tenTuyenXe) {
		this.tenTuyenXe = tenTuyenXe;
	}

	
	
}
