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
		result.setId(entity.getId());
		result.setTuyenXeId(entity.getTuyenxe().getTuyenXeId());
		result.setTenTuyenXe(entity.getTuyenxe().getTenTuyenXe());
		result.setNgayDi(entity.getNgayDi());
		result.setThoiGian(entity.getThoiGian());
		return result;		    
	}
	
	public LichTrinh toEntity(LichTrinhDTO dto)
	{
		LichTrinh result = new LichTrinh();
		
		result.setNgayDi(dto.getNgayDi());
		result.setThoiGian(dto.getThoiGian());
		return result;
	}
}
