package com.datvexe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datvexe.entity.Ve;

public interface VeRepository extends JpaRepository<Ve, Long>{
	// Ve findOneByVeId(Long idVe);
	List<Ve> findByIdLichTrinh(Long idLichTrinh);
}
