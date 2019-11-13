package com.datvexe.model;

import java.util.Date;
import java.util.List;

public class TuyenXeModel extends AbstractModel<TuyenXeModel> {
	private Long tuyenXeID;
	private String tenTuyen;
	private String diemDen;
	private String diemDi;
	private Date thoiGianDiChuyen;
	
	public Long getTuyenXeID() {
		return tuyenXeID;
	}
	public void setTuyenXeID(Long tuyenXeID) {
		this.tuyenXeID = tuyenXeID;
	}
	public String getTenTuyen() {
		return tenTuyen;
	}
	public void setTenTuyen(String tenTuyen) {
		this.tenTuyen = tenTuyen;
	}
	public String getDiemDen() {
		return diemDen;
	}
	public void setDiemDen(String diemDen) {
		this.diemDen = diemDen;
	}
	public String getDiemDi() {
		return diemDi;
	}
	public void setDiemDi(String diemDi) {
		this.diemDi = diemDi;
	}
	public Date getThoiGianDiChuyen() {
		return thoiGianDiChuyen;
	}
	public void setThoiGianDiChuyen(Date thoiGianDiChuyen) {
		this.thoiGianDiChuyen = thoiGianDiChuyen;
	}
	
}
