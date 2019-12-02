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
		result.setMaTuyenXe(entity.getMaTuyenXe());
		result.setTenTuyenXe(entity.getTenTuyenXe());
		return result;
	}
	public TuyenXe toEntity(TuyenXeDTO dto)
	{
		TuyenXe result = new TuyenXe();
		result.setMaTuyenXe(dto.getMaTuyenXe());
		result.setTenTuyenXe(dto.getTenTuyenXe());
		return result;
	}
	
	public TuyenXe toEntity(TuyenXe result, TuyenXeDTO dto)
	{	
		result.setMaTuyenXe(dto.getMaTuyenXe());
		result.setTenTuyenXe(dto.getTenTuyenXe());
		return result;
	}
}
