package com.datvexe.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// @Entity nó sẽ ánh xạ (mapping) table TuyenXe trong tg mysql
@Entity

 // Với @table nó sẽ tự tạo 1 bảng có name = "TuyenXe" trong cdsl tương ý 
@Table(name = "TuyenXe") 
public class TuyenXe extends BaseEntity {
	
//  Với @id thực hiện định nghĩa id là khóa chính và not null	
//	@Id
// 	@GeneratedValue định nghĩa giá trị , với  GenerationType định nghĩa thuộc tính
//	@GeneratedValue (strategy= GenerationType.IDENTITY)
//	private Long id;
	
//  @colum đại diện cho 1 cột trong bảng @table có tên là maTuyenXe
//  name = "tenTuyenXe" định nghĩa cho cái tên cột thực tế trong table
	
	@Column(name="tuyenXeId")
	private String tuyenXeId;
	
	
	@Column(name = "tenTuyen")
	private String tenTuyen;
	
	@Column(name = "diemDen", columnDefinition = "TEXT")
	private String diemDen;
	
	@Column(name = "diemDi", columnDefinition = "TEXT")
	private String diemDi;

	@ManyToMany(fetch = FetchType.LAZY)
	// Tự động tạo bảng trung gian có tên là ViTri_TuyenXe
	// 1 tuyến xe có nhiều vị trí đón trả và 1 vị trí đón trả chỉ tương ứng với 1 tuyến xe 
	@JoinTable(name ="vitridontra_tuyenxe",	joinColumns = @JoinColumn(name="viTriId"), 
							inverseJoinColumns = @JoinColumn(name = "tuyenXeId"))
	private List<ViTriDonTra> vitri = new ArrayList<>();

	@OneToMany(mappedBy = "tuyenxe")
	private List<ChuyenDi> chuyendi = new ArrayList<ChuyenDi>();
	
	public String getTenTuyen() {
		return tenTuyen;
	}


	public void setTenTuyen(String tenTuyen) {
		this.tenTuyen = tenTuyen;
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
