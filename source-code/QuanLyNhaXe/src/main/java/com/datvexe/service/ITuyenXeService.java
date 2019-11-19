package com.datvexe.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Pageable;

import com.datvexe.dto.LichTrinhDTO;
import com.datvexe.dto.TuyenXeDTO;

public interface ITuyenXeService {
	List<TuyenXeDTO> finalAll();

	List<TuyenXeDTO> finaAll(Pageable pageable);
	
		
	Map<String, String> finalAllMap();
	int getTotalItem();
}
