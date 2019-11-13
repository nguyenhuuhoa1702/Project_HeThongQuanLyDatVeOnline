package com.datvexe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ViTriDonTra")
public class ViTriDonTra extends BaseEntity {
	
	@Column(name="noiDon")
	private String noiDon;
	
	@Column(name ="noiTra")
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
	
	
}
