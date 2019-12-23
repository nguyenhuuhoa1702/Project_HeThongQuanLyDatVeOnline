package com.datvexe.converter;

import org.springframework.stereotype.Component;

import com.datvexe.dto.ViTriGheNgoiDTO;
import com.datvexe.entity.ViTriGheNgoi;
import com.datvexe.entity.ViTriGheNgoi;

@Component
public class ViTriGheNgoiConverter {
	public ViTriGheNgoiDTO toDTO(ViTriGheNgoi entity)
	{
		ViTriGheNgoiDTO dto = new ViTriGheNgoiDTO();
		dto.setIdVe(entity.getIdVe().getIdVe());
		dto.setIdGheNgoi(entity.getIdGheNgoi());
		dto.setViTriGheNgoi(entity.getViTriGheNgoi());
		return dto;
	}
	
	public ViTriGheNgoi toEntity(ViTriGheNgoiDTO dto)
	{
		ViTriGheNgoi entity = new ViTriGheNgoi();
		entity.setViTriGheNgoi(dto.getViTriGheNgoi());
		return entity;
	}
	
	public ViTriGheNgoi toEntity(ViTriGheNgoi result, ViTriGheNgoiDTO dto)
	{	
//		result.setTenViTriGheNgoi(dto.getTenViTriGheNgoi());
//		result.setEmail(dto.getEmail());
//		result.setSoDienThoai(dto.getSoDienThoai());
//		result.setTinhTrangVe("Đã thanh toán");
		return result;
	}
}
