package com.datvexe.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

// định nghĩa parent Entity
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="ngayTao")
	@CreatedDate
	private Date ngayTao;
	
	@Column(name ="modifieddate")
	@LastModifiedDate
	private Date modifiedDate;
	
	public Date getNgayTao() {
		return ngayTao;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public Long getId() {
		return id;
	}
}
