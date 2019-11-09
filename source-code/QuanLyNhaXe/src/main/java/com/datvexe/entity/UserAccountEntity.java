package com.datvexe.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TaiKhoan")
public class UserAccountEntity extends BaseEntity{
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
	private List<UserRoleEntity> roles = new ArrayList<>();
	
	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}

	public List<UserRoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(List<UserRoleEntity> roles) {
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