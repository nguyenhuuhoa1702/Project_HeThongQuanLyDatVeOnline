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
	
	@Column(name ="viTriGheNgoi")
	private String viTriGheNgoi;

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
	
	
	
}
