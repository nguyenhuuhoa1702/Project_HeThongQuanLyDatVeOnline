package com.datvexe.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datvexe.dto.LichTrinhDTO;
import com.datvexe.entity.ViTriDonTra;
import com.datvexe.repository.ViTriDonTraRepository;
import com.datvexe.service.IViTriDonTra;

@Service
public class ViTriDonTraService implements IViTriDonTra {
	@Autowired
	private ViTriDonTraRepository viTriRepository;

	@Override
	public Map<String, String> finalAllMapNoiDon(LichTrinhDTO dto) {
		Map<String, String> result = new HashMap<>();
		List<ViTriDonTra> entity = viTriRepository.findByTenTuyenXe(dto.getDiemDi());
		for (ViTriDonTra item : entity) {
			result.put(item.getDiaChi(), item.getDiaChi());
			// result.put(key, value)
		}
		return result;
	}
	@Override
	public Map<String, String> finalAllMapNoiTra(LichTrinhDTO dto) {
		Map<String, String> result = new HashMap<>();
		List<ViTriDonTra> entity = viTriRepository.findByTenTuyenXe(dto.getDiemDen());
		for (ViTriDonTra item : entity) {
			result.put(item.getDiaChi(), item.getDiaChi());
			// result.put(key, value)
		}
		return result;
	}
}
