package com.datvexe.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datvexe.converter.KhachHangConverter;
import com.datvexe.dto.KhachHangDTO;
import com.datvexe.entity.KhachHang;
import com.datvexe.repository.KhachHangRepository;
import com.datvexe.service.IKhachHangService;

@Service
public class KhachHangService implements IKhachHangService {

	@Autowired
	private KhachHangRepository khachHangRepository;
	@Autowired
	private KhachHangConverter khachHangConverter;
	
	@Override
	public List<KhachHangDTO> finalALl() {
		List<KhachHangDTO> models = new ArrayList<>();
		List<KhachHang> entity =  khachHangRepository.findAll();
		for (KhachHang item: entity) {
			KhachHangDTO khachHangDTO = khachHangConverter.toDTO(item);
			models.add(khachHangDTO);
		}
		return models;
	}

}
