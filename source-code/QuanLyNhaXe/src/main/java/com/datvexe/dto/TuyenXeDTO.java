package com.datvexe.dto;

import java.util.Map;

public class TuyenXeDTO extends AbstractDTO<TuyenXeDTO> {
	
	private String tenTuyenXe;
	private Long id;
	private Long tuyenXeId;
	
	public String getTenTuyenXe() {
		return tenTuyenXe;
	}
	public void setTenTuyenXe(String tenTuyenXe) {
		this.tenTuyenXe = tenTuyenXe;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
