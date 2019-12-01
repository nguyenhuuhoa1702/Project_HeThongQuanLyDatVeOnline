package com.datvexe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datvexe.entity.Xe;

public interface XeRepository  extends JpaRepository<Xe, String> {
	// findOne quy định khi bạn trả về 1 kết quả duy nhất
	 @Query("select u from Xe u where u.BienSoXe = ?1")
	 Xe findOneByXe(String BienSoXe);
}