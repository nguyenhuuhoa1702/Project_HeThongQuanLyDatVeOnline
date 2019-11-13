package com.datvexe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datvexe.entity.TaiKhoan;

public interface UserRepository  extends JpaRepository<TaiKhoan, Long> {
	// findOne quy định khi bạn trả về 1 kết quả duy nhất
	TaiKhoan findOneByTenTaiKhoanAndActive(String name,int active);
	
}
