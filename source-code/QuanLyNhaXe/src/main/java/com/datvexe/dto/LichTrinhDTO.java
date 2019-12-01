package com.datvexe.dto;

public class LichTrinhDTO extends AbstractDTO<LichTrinhDTO>{
	private Long idLichTrinh;
	private String maTuyenXe;
	private String tenTuyenXe;
	private String thoiGian;
	private String ngayDi;
	private String diemDi;
	private String diemDen;
	private String bienSoXe;
	
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
