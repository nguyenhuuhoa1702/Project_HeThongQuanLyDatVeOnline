package com.datvexe.converter;

import org.springframework.stereotype.Component;

import com.datvexe.dto.TuyenXeDTO;
import com.datvexe.dto.VeDTO;
import com.datvexe.entity.TuyenXe;
import com.datvexe.entity.Ve;

@Component
public class VeConverter {
	public VeDTO toDTO(Ve entity)
	{
		VeDTO result = new VeDTO();
		result.setIdVe(entity.getIdVe());
		result.setNoiDon(entity.getNoiDon());
		result.setNoiTra(entity.getNoiTra());
		result.setNgayDatVe(entity.getNgayDatVe());
		result.setSoVeDat(entity.getSoVeDat());
		result.setIdLichTrinh(entity.getIdLichTrinh().getIdLichTrinh());
		return result;
	}
	public Ve toEntity(VeDTO dto)
	{
		Ve result = new Ve();
		result.setNoiDon(dto.getNoiDon());
		result.setNoiTra(dto.getNoiTra());
		result.setNgayDatVe(dto.getNgayDatVe());
		result.setSoVeDat(dto.getSoVeDat());
		return result;
	}
	
	public Ve toEntity(Ve result, VeDTO dto)
	{	
		result.setNoiDon(dto.getNoiDon());
		result.setNoiTra(dto.getNoiTra());
		result.setNgayDatVe(dto.getNgayDatVe());
		result.setSoVeDat(dto.getSoVeDat());
		return result;
	}
}
