package com.datvexe.dto;

public class ViTriDonTraDTO extends AbstractDTO<ViTriDonTraDTO> {
	private Long idViTri;
	private String diaChi;
	private String tenTuyenXe;
	
	
	
	public String getTenTuyenXe() {
		return tenTuyenXe;
	}
	public void setTenTuyenXe(String tenTuyenXe) {
		this.tenTuyenXe = tenTuyenXe;
	}
	public Long getIdViTri() {
		return idViTri;
	}
	public void setIdViTri(Long idViTri) {
		this.idViTri = idViTri;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	


}
