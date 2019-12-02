package com.datvexe.dto;

public class ViTriGheNgoiDTO  extends AbstractDTO<ViTriGheNgoiDTO>{

	private Long idGheNgoi;
	private Long idVe;
	private String viTriGheNgoi;
	
	
	public Long getIdGheNgoi() {
		return idGheNgoi;
	}
	public void setIdGheNgoi(Long idGheNgoi) {
		this.idGheNgoi = idGheNgoi;
	}
	public Long getIdVe() {
		return idVe;
	}
	public void setIdVe(Long idVe) {
		this.idVe = idVe;
	}
	public String getViTriGheNgoi() {
		return viTriGheNgoi;
	}
	public void setViTriGheNgoi(String viTriGheNgoi) {
		this.viTriGheNgoi = viTriGheNgoi;
	}
	
	
}
