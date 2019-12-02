package com.datvexe.dto;

public class VeDTO extends AbstractDTO<VeDTO> {
	private Long idVe;
	private Long idLichTrinh;
	private int soVeDat;
	private int donGia;
	
	
	public Long getIdVe() {
		return idVe;
	}
	public void setIdVe(Long idVe) {
		this.idVe = idVe;
	}
	public Long getIdLichTrinh() {
		return idLichTrinh;
	}
	public void setIdLichTrinh(Long idLichTrinh) {
		this.idLichTrinh = idLichTrinh;
	}
	public int getSoVeDat() {
		return soVeDat;
	}
	public void setSoVeDat(int soVeDat) {
		this.soVeDat = soVeDat;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	
	
}
