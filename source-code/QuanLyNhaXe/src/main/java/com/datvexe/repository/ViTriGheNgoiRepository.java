package com.datvexe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datvexe.entity.LichTrinh;
import com.datvexe.entity.ViTriGheNgoi;

public  interface ViTriGheNgoiRepository extends JpaRepository<ViTriGheNgoi, Long> {
	@Query("select u from ViTriGheNgoi u where u.idLichTrinh = ?1")
	List<ViTriGheNgoi> findAllByIdLichTrinh(LichTrinh idLichTrinh);
}
