package com.datvexe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datvexe.entity.ViTriDonTra;

public interface ViTriDonTraRepository extends JpaRepository<ViTriDonTra, Long> {
	
	//@Query("select u from vitridontra u where u.tenTuyenXe= ?1")
	List<ViTriDonTra> findByTenTuyenXe(String tenTuyenXe);
	//ViTriDonTra findByTuyenXeId(Long idTuyenXe);
}
