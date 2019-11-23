package com.datvexe.dto;

import java.sql.Date;
import java.sql.Time;

public class LichTrinhDTO extends AbstractDTO<LichTrinhDTO>{
	private Long id;
	private Long tuyenXeId;
	private String tenTuyenXe;
	private String thoiGian;
	private String ngayDi;
	
	
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
	public String getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(String thoiGian) {
		this.thoiGian = thoiGian;
	}
	public String getNgayDi() {
		return ngayDi;
	}
	public void setNgayDi(String ngayDi) {
		this.ngayDi = ngayDi;
	}
	public void setTenTuyenXe(String tenTuyenXe) {
		this.tenTuyenXe = tenTuyenXe;
	}


	

	
	

	
	
	

}
