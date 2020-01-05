package com.datvexe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "ViTriGheNgoi")
public class ViTriGheNgoi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGheNgoi;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="idVe")
	private Ve idVe;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idLichTrinh")
	private LichTrinh idLichTrinh;
	
	
	@Column(name ="viTriGheNgoi")
	private String viTriGheNgoi;

	
	
	
	public LichTrinh getIdLichTrinh() {
		return idLichTrinh;
	}

	public void setIdLichTrinh(LichTrinh idLichTrinh) {
		this.idLichTrinh = idLichTrinh;
	}

	public Long getIdGheNgoi() {
		return idGheNgoi;
	}

	public void setIdGheNgoi(Long idGheNgoi) {
		this.idGheNgoi = idGheNgoi;
	}

	public String getViTriGheNgoi() {
		return viTriGheNgoi;
	}

	public void setViTriGheNgoi(String viTriGheNgoi) {
		this.viTriGheNgoi = viTriGheNgoi;
	}

	public Ve getIdVe() {
		return idVe;
	}

	public void setIdVe(Ve idVe) {
		this.idVe = idVe;
	}
	
	
	
}
