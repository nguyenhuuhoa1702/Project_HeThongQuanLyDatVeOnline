package com.datvexe.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "phanQuyen")
public class UserRoleEntity extends BaseEntity {
	
	@Column(name = "tenQuyen")
	private String tenQuyen;
	
	@Column(name="code")
	private String code;

	@ManyToMany(mappedBy = "roles")
    private List<UserAccountEntity> user = new ArrayList<>();


	public String getTenQuyen() {
		return tenQuyen;
	}

	public void setTenQuyen(String tenQuyen) {
		this.tenQuyen = tenQuyen;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public List<UserAccountEntity> getUser() {
		return user;
	}

	public void setUser(List<UserAccountEntity> user) {
		this.user = user;
	}
	
}

