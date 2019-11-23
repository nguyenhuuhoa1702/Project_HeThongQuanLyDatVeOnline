package com.datvexe.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.datvexe.dto.LichTrinhDTO;
import com.datvexe.dto.TuyenXeDTO;
import com.datvexe.entity.LichTrinh;
import com.datvexe.model.TuyenXeModel;

public interface ILichTrinhService {
	// Lấy danh sách
	List<LichTrinhDTO> finalAll();

	// lấy giá trị id
	LichTrinhDTO findById(long id);

	
	LichTrinhDTO save(LichTrinhDTO dto);
	
}
