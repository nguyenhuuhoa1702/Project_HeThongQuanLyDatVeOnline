package com.datvexe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datvexe.entity.UserAccountEntity;

public interface UserRepository  extends JpaRepository<UserAccountEntity, Long> {
	// findOne quy định khi bạn trả về 1 kết quả duy nhất
	UserAccountEntity findOneByTenTaiKhoanAndActive(String name,int active);
	
}
