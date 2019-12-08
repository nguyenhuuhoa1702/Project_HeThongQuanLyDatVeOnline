package com.datvexe.converter;

import org.springframework.stereotype.Component;

import com.datvexe.dto.KhachHangDTO;
import com.datvexe.entity.KhachHang;

@Component
public class KhachHangConverter {
	public KhachHangDTO toDTO(KhachHang entity)
	{
		KhachHangDTO dto = new KhachHangDTO();
		dto.setIdKhachHang(entity.getIdKhachHang());
		dto.setTenKhachHang(entity.getTenKhachHang());
		dto.setEmail(entity.getEmail());
		dto.setSoDienThoai(entity.getSoDienThoai());
		dto.setIdVe(entity.getIdVe().getIdVe());
		return dto;
	}
	
	public KhachHang toEntity(KhachHangDTO dto)
	{
		KhachHang entity = new KhachHang();
		
		return entity;
	}
}