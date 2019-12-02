package com.datvexe.dto;

public class KhachHangDTO extends AbstractDTO<KhachHangDTO> {
	private Long idKhachHang;
	private String tenKhachHang;
	private String email;
	private int soDienThoai;
	private Long idVe;
	
	public Long getIdKhachHang() {
		return idKhachHang;
	}
	public void setIdKhachHang(Long idKhachHang) {
		this.idKhachHang = idKhachHang;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
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
	public Long getIdVe() {
		return idVe;
	}
	public void setIdVe(Long idVe) {
		this.idVe = idVe;
	}
	
	
	
	
	
}
