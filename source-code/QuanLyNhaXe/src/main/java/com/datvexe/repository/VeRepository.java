package com.datvexe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datvexe.entity.LichTrinh;
import com.datvexe.entity.Ve;
import com.datvexe.entity.Xe;

public interface VeRepository extends JpaRepository<Ve, Long>{
	// Ve findOneByVeId(Long idVe);
//	List<Ve> findByIdLichTrinh(LichTrinh id);
	
	 @Query("select u from Ve u where u.idLichTrinh = ?1")
	 List<Ve> findByIdLichTrinh(LichTrinh idLichTrinh);
}
