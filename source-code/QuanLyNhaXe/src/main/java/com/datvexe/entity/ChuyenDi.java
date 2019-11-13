package com.datvexe.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ChuyenDi")
public class ChuyenDi extends BaseEntity {
	@Column(name = "tenChuyen")
	private String tenTuyen;

	@Column(name = "ngayDi")
	private Date ngayDi;

	@Column(name = "thoiGian")
	private Time thoiGian;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tuyenXeId")
	private TuyenXe tuyenxe;

	public String getTenTuyen() {
		return tenTuyen;
	}

	public void setTenTuyen(String tenTuyen) {
		this.tenTuyen = tenTuyen;
	}

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

}
