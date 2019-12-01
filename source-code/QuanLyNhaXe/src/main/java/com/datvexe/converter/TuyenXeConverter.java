package com.datvexe.converter;

import org.springframework.stereotype.Component;

import com.datvexe.dto.TuyenXeDTO;
import com.datvexe.entity.TuyenXe;

@Component
public class TuyenXeConverter {
	public TuyenXeDTO toDTO(TuyenXe entity)
	{
		TuyenXeDTO result = new TuyenXeDTO();
		result.setTuyenXeId(entity.getTuyenXeId());	
		result.setTenTuyenXe(entity.getTenTuyenXe());
		return result;
	}
	public TuyenXe toEntity(TuyenXeDTO dto)
	{
		TuyenXe result = new TuyenXe();
		result.setTuyenXeId(dto.getId());
		result.setTenTuyenXe(dto.getTenTuyenXe());
		return result;
	}
}
