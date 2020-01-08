package com.datvexe.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name ="LoaiTin")
public class LoaiTin {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private Long idLoaiTin;
	
	@Column(name="loaiTin")
	private String loaiTin;
	
	@Column(name="tenLoaiTin")
	private String tenLoaiTin;
	
	@OneToMany(mappedBy ="idLoaiTin")
 	private List<TinTuc> tinTuc = new ArrayList<>();
 	

	public List<TinTuc> getTinTuc() {
		return tinTuc;
	}

	public void setTinTuc(List<TinTuc> tinTuc) {
		this.tinTuc = tinTuc;
	}

	public Long getIdLoaiTin() {
		return idLoaiTin;
	}

	public void setIdLoaiTin(Long idLoaiTin) {
		this.idLoaiTin = idLoaiTin;
	}

	public String getLoaiTin() {
		return loaiTin;
	}

	public void setLoaiTin(String loaiTin) {
		this.loaiTin = loaiTin;
	}

	public String getTenLoaiTin() {
		return tenLoaiTin;
	}

	public void setTenLoaiTin(String tenLoaiTin) {
		this.tenLoaiTin = tenLoaiTin;
	}
	
	
}
