package com.datvexe.entity;

import java.sql.Date;
import java.sql.Time;


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
	private Date ngayDi;

	@Column(name = "thoiGian")
	private Time thoiGian;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tuyenXeId")
	private TuyenXe tuyenxe;

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
