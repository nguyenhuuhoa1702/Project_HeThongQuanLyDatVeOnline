package com.datvexe.dto;

import java.util.Map;

public class TuyenXeDTO extends AbstractDTO<TuyenXeDTO> {
	
	private String tenTuyenXe;
	private String maTuyenXe;
	private Long tuyenXeId;
	private String thongBao;
	
	public String getThongBao() {
		return thongBao;
	}
	public void setThongBao(String thongBao) {
		this.thongBao = thongBao;
	}
	public String getTenTuyenXe() {
		return tenTuyenXe;
	}
	public void setTenTuyenXe(String tenTuyenXe) {
		this.tenTuyenXe = tenTuyenXe;
	}
	
	public String getMaTuyenXe() {
		return maTuyenXe;
	}
	public void setMaTuyenXe(String maTuyenXe) {
		this.maTuyenXe = maTuyenXe;
	}
	public Long getTuyenXeId() {
		return tuyenXeId;
	}
	public void setTuyenXeId(Long tuyenXeId) {
		this.tuyenXeId = tuyenXeId;
	}
	public void setListResult(Map<String, String> finalAll) {
		// TODO Auto-generated method stub
		
	}
	

	
}
