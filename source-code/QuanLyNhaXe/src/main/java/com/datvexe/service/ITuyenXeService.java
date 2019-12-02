package com.datvexe.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Pageable;

import com.datvexe.dto.TuyenXeDTO;

public interface ITuyenXeService {
	List<TuyenXeDTO> finalAll();

	List<TuyenXeDTO> finaAll(Pageable pageable);
	
		
	Map<String, String> finalAllMap();
	int getTotalItem();

	TuyenXeDTO findById(Long id);
	
	TuyenXeDTO save(TuyenXeDTO dto);
	
	void delete(long[] ids);
}
