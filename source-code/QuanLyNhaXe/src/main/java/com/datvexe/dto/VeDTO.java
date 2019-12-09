package com.datvexe.dto;

import java.util.Date;

public class VeDTO extends AbstractDTO<VeDTO> {
	private Long idVe;
	private Long idLichTrinh;
	private int soVeDat;
	private Date ngayDatVe;
	private String noiDon;
	private String noiTra;
	
	
	public String getNoiDon() {
		return noiDon;
	}
	public void setNoiDon(String noiDon) {
		this.noiDon = noiDon;
	}
	public String getNoiTra() {
		return noiTra;
	}
	public void setNoiTra(String noiTra) {
		this.noiTra = noiTra;
	}
	public Date getNgayDatVe() {
		return ngayDatVe;
	}
	public void setNgayDatVe(Date ngayDatVe) {
		this.ngayDatVe = ngayDatVe;
	}
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
}
