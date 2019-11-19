package com.datvexe.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datvexe.converter.LichTrinhConverter;
import com.datvexe.dto.LichTrinhDTO;
import com.datvexe.entity.LichTrinh;
import com.datvexe.repository.LichTrinhRepository;
import com.datvexe.service.ILichTrinhService;

@Service
public class LichTrinhService implements ILichTrinhService {
	
	@Autowired
	private LichTrinhRepository LichTrinhRepository;
	@Autowired
	private LichTrinhConverter lichTrinhConverter;
	// Nơi lấy danh sách lịch trình chuyến đi
	@Override
	public List<LichTrinhDTO> finalAll() {
		// convert data từ DTO sang entity và entity -> DTO
		// chuyển List LichTrinh sang List DTO
		List<LichTrinhDTO> models = new ArrayList<>();
		List<LichTrinh> entity = LichTrinhRepository.findAll();
		for(LichTrinh item: entity)
		{
			LichTrinhDTO lichTrinhDTO =  lichTrinhConverter.toDTO(item);
			models.add(lichTrinhDTO);
		}
		return models;	}

	// nơi xử lý lấy id
	@Override
	public LichTrinhDTO findById(long id) {
		LichTrinh entity  = LichTrinhRepository.findOne(id); 
		return lichTrinhConverter.toDTO(entity);
	}

	

}
