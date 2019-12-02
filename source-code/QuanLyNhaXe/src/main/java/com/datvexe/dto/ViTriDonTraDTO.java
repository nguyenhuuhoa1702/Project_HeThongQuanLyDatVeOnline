package com.datvexe.dto;

public class ViTriDonTraDTO extends AbstractDTO<ViTriDonTraDTO> {
	private Long idViTri;
	private Long idTuyenXe;
	private String diaChi;
	
	
	public Long getIdViTri() {
		return idViTri;
	}
	public void setIdViTri(Long idViTri) {
		this.idViTri = idViTri;
	}
	public Long getIdTuyenXe() {
		return idTuyenXe;
	}
	public void setIdTuyenXe(Long idTuyenXe) {
		this.idTuyenXe = idTuyenXe;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	


}
