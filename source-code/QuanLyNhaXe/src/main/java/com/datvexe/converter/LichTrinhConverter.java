package com.datvexe.converter;

import org.springframework.stereotype.Component;

import com.datvexe.dto.LichTrinhDTO;
import com.datvexe.entity.LichTrinh;

@Component
public class LichTrinhConverter {
	
	public LichTrinhDTO toDTO(LichTrinh entity)
	{
		LichTrinhDTO result = new LichTrinhDTO();
		// lấy dữ liệu từ entity ở cột id truyền vào cột id trong dto
		result.setBienSoXe(entity.getBienSoXe().getBienSoXe());
		result.setIdLichTrinh(entity.getIdLichTrinh());
		result.setNgayDi(entity.getNgayDi());
		result.setThoiGian(entity.getThoiGian());
		result.setDiemDen(entity.getDiemDen());
		result.setDiemDi(entity.getDiemDi());
		return result;		    
	}
	
	public LichTrinh toEntity(LichTrinhDTO dto)
	{
		LichTrinh result = new LichTrinh();
		result.setDiemDen(dto.getDiemDen());
		result.setDiemDi(dto.getDiemDi());
		result.setNgayDi(dto.getNgayDi());
		result.setThoiGian(dto.getThoiGian());
		return result;
	}
	
	public LichTrinh toEntity(LichTrinh result, LichTrinhDTO dto)
	{	
		result.setDiemDen(dto.getDiemDen());
		result.setDiemDi(dto.getDiemDi());
		result.setNgayDi(dto.getNgayDi());
		result.setThoiGian(dto.getThoiGian());
		return result;
	}
	
	
}
