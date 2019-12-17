package com.datvexe.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.datvexe.converter.KhachHangConverter;
import com.datvexe.converter.LichTrinhConverter;
import com.datvexe.converter.VeConverter;
import com.datvexe.dto.KhachHangDTO;
import com.datvexe.dto.VeDTO;
import com.datvexe.entity.KhachHang;
import com.datvexe.entity.LichTrinh;
import com.datvexe.entity.TuyenXe;
import com.datvexe.entity.Ve;
import com.datvexe.entity.Xe;
import com.datvexe.repository.KhachHangRepository;
import com.datvexe.repository.VeRepository;
import com.datvexe.service.IKhachHangService;

@Service
public class KhachHangService implements IKhachHangService {

	@Autowired
	private KhachHangRepository khachHangRepository;
	@Autowired
	private KhachHangConverter khachHangConverter;
	@Autowired
	private VeRepository veRepository;
	
	
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
	
	@Override
	@Transactional
	public KhachHangDTO save(KhachHangDTO dto,Long idVe) 
	{	
		Ve ve =  veRepository.findOne(idVe);
		KhachHang khachHangEntity = new KhachHang();
		khachHangEntity.setIdVe(ve);
		khachHangEntity = new KhachHangConverter().toEntity(khachHangEntity, dto);
		return khachHangConverter.toDTO(khachHangRepository.save(khachHangEntity));
	}

	@Override
	public Long getTotalItem() {
			return (Long) khachHangRepository.count();
	}

	@Override
	public KhachHangDTO findAllcheck(Long idVe) {
		//Xe biensoxe = xeRepository.findOneByXe(dto.getBienSoXe());
		Ve ve = veRepository.findOne(idVe);
		KhachHang models = khachHangRepository.findAllcheck(ve);
		KhachHangDTO dto = khachHangConverter.toDTO(models);
		return dto;
	}

	@Override
	public Boolean findAllcheck(int SoDienThoai, Long idVe) {
		Ve ve = veRepository.findOne(idVe);
		KhachHang models = khachHangRepository.findAllcheck(ve);
		if(models.getSoDienThoai()==SoDienThoai)
		{
			return true;
		}
		return false;
	}
}
