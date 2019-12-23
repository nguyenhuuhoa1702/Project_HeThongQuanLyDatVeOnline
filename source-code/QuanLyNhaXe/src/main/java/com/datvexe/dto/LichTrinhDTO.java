package com.datvexe.dto;

import java.sql.Date;
import java.sql.Time;

public class LichTrinhDTO extends AbstractDTO<LichTrinhDTO>{
	private Long idLichTrinh;
	private String maTuyenXe;
	private String tenTuyenXe;
	private Time thoiGian;
	private Date ngayDi;
	private String diemDi;
	private String diemDen;
	private String bienSoXe;
	private int donGia;
	private Time thoiGianDen;
	private int gheTrong;
	private int trangThai;
	
	
	public int getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}
	public int getGheTrong() {
		return gheTrong;
	}
	public void setGheTrong(int gheTrong) {
		this.gheTrong = gheTrong;
	}
	public Time getThoiGianDen() {
		return thoiGianDen;
	}
	public void setThoiGianDen(Time thoiGianDen) {
		this.thoiGianDen = thoiGianDen;
	}
	public String getBienSoXe() {
		return bienSoXe;
	}
	public void setBienSoXe(String bienSoXe) {
		this.bienSoXe = bienSoXe;
	}
	public String getMaTuyenXe() {
		return maTuyenXe;
	}
	public void setMaTuyenXe(String maTuyenXe) {
		this.maTuyenXe = maTuyenXe;
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
	public Long getIdLichTrinh() {
		return idLichTrinh;
	}
	public void setIdLichTrinh(Long idLichTrinh) {
		this.idLichTrinh = idLichTrinh;
	}
	public String getTenTuyenXe() {
		return tenTuyenXe;
	
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
	public void setTenTuyenXe(String tenTuyenXe) {
		this.tenTuyenXe = tenTuyenXe;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	
}
