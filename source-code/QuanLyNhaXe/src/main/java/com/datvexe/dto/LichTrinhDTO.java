package com.datvexe.dto;

import java.sql.Date;
import java.sql.Time;

public class LichTrinhDTO extends AbstractDTO<LichTrinhDTO>{
	private Long id;
	private Long tuyenXeId;
	private String tenTuyenXe;
	private Time thoiGian;
	private Date ngayDi;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getTuyenXeId() {
		return tuyenXeId;
	}
	public void setTuyenXeId(Long tuyenXeId) {
		this.tuyenXeId = tuyenXeId;
	}
	public String getTenTuyenXe() {
		return tenTuyenXe;
	}
	public void setTenTuyenXe(String tenTuyenXe) {
		this.tenTuyenXe = tenTuyenXe;
	}
	public Time getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(Time thoiGian) {
		this.thoiGian = thoiGian;
	}
	public Date getNgayDi() {
		return ngayDi;
	}
	public void setNgayDi(Date ngayDi) {
		this.ngayDi = ngayDi;
	}

	

	
	

	
	
	

}
