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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TaiKhoan")
public class TaiKhoan {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private Long idTaiKhoan;
	
	@Column(name ="tenTaiKhoan")
	private String tenTaiKhoan;
	
	@Column(name ="matKhau")
	private String matKhau;
	
	@Column(name ="Active")
	private Integer active;
	
	@ManyToMany(fetch = FetchType.LAZY)
	// Tự động tạo bảng trung gian có tên là user_role với 2 khóa chính là userId và roleId
	@JoinTable(name ="user_role",	joinColumns = @JoinColumn(name="userId"), 
							inverseJoinColumns = @JoinColumn(name = "roleId"))
	private List<PhanQuyenNguoiDung> roles = new ArrayList<>();
	
	@OneToMany(mappedBy = "idTaiKhoan")
 	private List<NhanSu> nhanSu = new ArrayList<NhanSu>();

	
	
	public Long getIdTaiKhoan() {
		return idTaiKhoan;
	}

	public void setIdTaiKhoan(Long idTaiKhoan) {
		this.idTaiKhoan = idTaiKhoan;
	}

	public List<NhanSu> getNhanSu() {
		return nhanSu;
	}

	public void setNhanSu(List<NhanSu> nhanSu) {
		this.nhanSu = nhanSu;
	}

	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}

	public List<PhanQuyenNguoiDung> getRoles() {
		return roles;
	}

	public void setRoles(List<PhanQuyenNguoiDung> roles) {
		this.roles = roles;
	}

	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public Integer getActive() {
		return active;
	}
	public void setActive(Integer active) {
		this.active = active;
	}	
	
}