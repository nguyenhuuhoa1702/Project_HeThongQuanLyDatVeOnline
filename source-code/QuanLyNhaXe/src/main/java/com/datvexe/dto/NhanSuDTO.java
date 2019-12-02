package com.datvexe.dto;

import com.datvexe.entity.TaiKhoan;

public class NhanSuDTO extends AbstractDTO<NhanSuDTO>{
	private Long idNhanSu;
 	private TaiKhoan idTaiKhoan;
 	private String HoTen;
 	private int namSinh;
 	private String email;
 	private int soDienThoai;
 	
 	
	public Long getIdNhanSu() {
		return idNhanSu;
	}
	public void setIdNhanSu(Long idNhanSu) {
		this.idNhanSu = idNhanSu;
	}
	public TaiKhoan getIdTaiKhoan() {
		return idTaiKhoan;
	}
	public void setIdTaiKhoan(TaiKhoan idTaiKhoan) {
		this.idTaiKhoan = idTaiKhoan;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(int soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

 	
}
