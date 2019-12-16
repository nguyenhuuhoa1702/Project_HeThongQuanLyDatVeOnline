package com.datvexe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datvexe.entity.KhachHang;
import com.datvexe.entity.Ve;

public interface KhachHangRepository extends JpaRepository<KhachHang, Long> {
	@Query("select u from KhachHang u where u.idVe = ?1")
	KhachHang findAllcheck(Long idVe);

}
