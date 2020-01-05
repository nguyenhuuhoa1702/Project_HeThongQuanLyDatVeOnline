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
		
//		long millis=System.currentTimeMillis();  
//		java.sql.Date date = new java.sql.Date(millis); 
//		if(entity.getNgayDi().equals(""))
//			result.setNgayDi(date);
//		else
		result.setNgayDi(entity.getNgayDi());
		result.setThoiGianDen(entity.getThoiGianDen());
		result.setThoiGian(entity.getThoiGian());
		result.setDiemDen(entity.getDiemDen());
		result.setDiemDi(entity.getDiemDi());
		result.setDonGia(entity.getDonGia());
		result.setGheTrong(entity.getGheTrong());
		return result;		    
	}
	
	public LichTrinh toEntity(LichTrinhDTO dto)
	{
		LichTrinh result = new LichTrinh();
		result.setDiemDen(dto.getDiemDen());
		result.setDiemDi(dto.getDiemDi());
		result.setNgayDi(dto.getNgayDi());
		result.setThoiGian(dto.getThoiGian());
		result.setDonGia(dto.getDonGia());
		result.setThoiGianDen(dto.getThoiGianDen());
//		result.setGheTrong(dto.getGheTrong());
		return result;
	}
	
	public LichTrinh toEntity(LichTrinh result, LichTrinhDTO dto)
	{	
		result.setDiemDen(dto.getDiemDen());
		result.setDiemDi(dto.getDiemDi());
		result.setNgayDi(dto.getNgayDi());
		result.setThoiGian(dto.getThoiGian());
		result.setDonGia(dto.getDonGia());
		result.setThoiGianDen(dto.getThoiGianDen());
		return result;
	}
	
	
}
