package com.datvexe.dto;

import com.datvexe.entity.NhanSu;

public class XeDTO extends AbstractDTO<XeDTO> {
	private String BienSoXe;
	private Long idNhanSu;
	private int TongGhe;
	private String HinhAnh;
	
	
	public String getBienSoXe() {
		return BienSoXe;
	}
	public void setBienSoXe(String bienSoXe) {
		BienSoXe = bienSoXe;
	}

	public Long getIdNhanSu() {
		return idNhanSu;
	}
	public void setIdNhanSu(Long idNhanSu) {
		this.idNhanSu = idNhanSu;
	}
	public int getTongGhe() {
		return TongGhe;
	}
	public void setTongGhe(int tongGhe) {
		TongGhe = tongGhe;
	}
	public String getHinhAnh() {
		return HinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		HinhAnh = hinhAnh;
	}
	
	

}
