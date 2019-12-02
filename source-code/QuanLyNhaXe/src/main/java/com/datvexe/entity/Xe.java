package com.datvexe.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Xe")
public class Xe {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY )	
	@Column(name= "BienSoXe")
	private String BienSoXe;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idNhanSu")
	private NhanSu idNhanSu;
	
	@Column(name="TongGhe")
	private int TongGhe;
	
	@Column(name ="HinhAnh")
	private String HinhAnh;
	
	
	
	@OneToMany(mappedBy = "BienSoXe")
	private List<LichTrinh> lichTrinh = new ArrayList<LichTrinh>();
	
	public NhanSu getIdNhanSu() {
		return idNhanSu;
	}

	public void setIdNhanSu(NhanSu idNhanSu) {
		this.idNhanSu = idNhanSu;
	}

	public int getTongGhe() {
		return TongGhe;
	}

	public void setTongGhe(int tongGhe) {
		TongGhe = tongGhe;
	}

	public List<LichTrinh> getLichTrinh() {
		return lichTrinh;
	}

	public void setLichTrinh(List<LichTrinh> lichTrinh) {
		this.lichTrinh = lichTrinh;
	}

	public String getBienSoXe() {
		return BienSoXe;
	}

	public void setBienSoXe(String bienSoXe) {
		BienSoXe = bienSoXe;
	}

	public String getHinhAnh() {
		return HinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		HinhAnh = hinhAnh;
	}

	

}
