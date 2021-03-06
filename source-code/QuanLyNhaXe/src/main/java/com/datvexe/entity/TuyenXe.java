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
public class TuyenXe {
	
//  Với @id thực hiện định nghĩa id là khóa chính và not null	
//	@Id
// 	@GeneratedValue định nghĩa giá trị , với  GenerationType định nghĩa thuộc tính
//	@GeneratedValue (strategy= GenerationType.IDENTITY)
//	private Long id;
	
//  @colum đại diện cho 1 cột trong bảng @table có tên là maTuyenXe
//  name = "tenTuyenXe" định nghĩa cho cái tên cột thực tế trong table

	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	@Column(name="tuyenXeId")
	private Long tuyenXeId;
	
	@Column(name = "maTuyenXe")
	private String maTuyenXe;
	
	@Column(name = "tenTuyenXe")
	private String tenTuyenXe;
	
	@Column(name = "Status")
	private int trangThai;
//	@ManyToMany(fetch = FetchType.LAZY)
//	// Tự động tạo bảng trung gian có tên là ViTri_TuyenXe
//	// 1 tuyến xe có nhiều vị trí đón trả và 1 vị trí đón trả chỉ tương ứng với 1 tuyến xe 
//	@JoinTable(name ="vitridontra_tuyenxe",	joinColumns = @JoinColumn(name="viTriId"), 
//							inverseJoinColumns = @JoinColumn(name = "tuyenXeId"))
//	private List<ViTriDonTra> vitri = new ArrayList<>();

	public Long getTuyenXeId() {
		return tuyenXeId;
	}

	public void setTuyenXeId(Long tuyenXeId) {
		this.tuyenXeId = tuyenXeId;
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

	public int getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}
	
	
}
