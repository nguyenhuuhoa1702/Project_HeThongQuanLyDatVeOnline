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
@Table(name = "LichTrinh")
public class LichTrinh {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ngayDi")
	private String ngayDi;

	@Column(name = "thoiGian")
	private String thoiGian;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tuyenXeId")
	private TuyenXe tuyenxe;

	
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

	public TuyenXe getTuyenxe() {
		return tuyenxe;
	}

	public void setTuyenxe(TuyenXe tuyenxe) {
		this.tuyenxe = tuyenxe;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


}
