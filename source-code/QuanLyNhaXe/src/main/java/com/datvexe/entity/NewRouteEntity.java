package com.datvexe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// @Entity nó sẽ ánh xạ (mapping) table TuyenXe trong tg mysql
@Entity

 // Với @table nó sẽ tự tạo 1 bảng có name = "TuyenXe" trong cdsl tương ý 
@Table(name = "TuyenXe") 
public class NewRouteEntity {
	
//  Với @id thực hiện định nghĩa id là khóa chính và not null	
	@Id
// 	@GeneratedValue định nghĩa giá trị , với  GenerationType định nghĩa thuộc tính
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private Long id;
	
//  @colum đại diện cho 1 cột trong bảng @table có tên là maTuyenXe
//  name = "maTuyenXe" định nghĩa cho cái tên cột thực tế trong table	
	@Column(name = "maTuyenXe")
	private String maTuyenXe;
	
	@Column(name = "diemDen")
	private String diemDen;
	
	@Column(name = "diemDi")
	private String diemDi;

	public Long getId() {
		return id;
	}

	public String getMaTuyenXe() {
		return maTuyenXe;
	}

	public void setMaTuyenXe(String maTuyenXe) {
		this.maTuyenXe = maTuyenXe;
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
	
}
