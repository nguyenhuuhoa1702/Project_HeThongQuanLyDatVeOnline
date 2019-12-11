package com.datvexe.converter;

import org.springframework.stereotype.Component;

import com.datvexe.dto.TuyenXeDTO;
import com.datvexe.dto.XeDTO;
import com.datvexe.entity.TuyenXe;
import com.datvexe.entity.Xe;

@Component
public class XeConverter {
	public XeDTO toDTO(Xe entity)
	{
		XeDTO result = new XeDTO();
		result.setBienSoXe(entity.getBienSoXe());
		result.setIdNhanSu(entity.getIdNhanSu().getIdNhanSu());
		result.setTongGhe(entity.getTongGhe());
		return result;
	}
	public Xe toEntity(XeDTO dto)
	{
		Xe result = new Xe();
		result.setBienSoXe(dto.getBienSoXe());
		result.setTongGhe(dto.getTongGhe());
		return result;
	}
	
	public Xe toEntity(Xe result, XeDTO dto)
	
	{	result.setBienSoXe(dto.getBienSoXe());
		result.setTongGhe(dto.getTongGhe());;
		return result;
	}
}
