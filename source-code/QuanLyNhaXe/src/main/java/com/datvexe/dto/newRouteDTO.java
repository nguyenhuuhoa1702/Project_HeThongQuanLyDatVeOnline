package com.datvexe.dto;

public class newRouteDTO extends AbstractDTO<newRouteDTO> {
	private String tenTuyen;
	private String diemDen;
	private String diemDi;
	private Long id;
	
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
