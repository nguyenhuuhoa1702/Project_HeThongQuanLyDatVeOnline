package com.datvexe.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.datvexe.converter.VeConverter;
import com.datvexe.dto.LichTrinhDTO;
import com.datvexe.dto.VeDTO;
import com.datvexe.entity.KhachHang;
import com.datvexe.entity.LichTrinh;
import com.datvexe.entity.Ve;
import com.datvexe.repository.LichTrinhRepository;
import com.datvexe.repository.VeRepository;
import com.datvexe.service.IVeService;

@Service
public class VeService implements IVeService {
	
	@Autowired
	private VeConverter veConverter;
	@Autowired
	private VeRepository veRepository;
	@Autowired
	private LichTrinhRepository lichTrinhRepository;

	@Override
	@Transactional
	public VeDTO save(VeDTO dto,Long idLichTrinh) {
		LichTrinh lichTrinh = lichTrinhRepository.findOne(idLichTrinh);
		Ve Entity = new Ve();
		Entity.setIdLichTrinh(lichTrinh);
		Entity = new VeConverter().toEntity(Entity, dto);
		return veConverter.toDTO(veRepository.save(Entity));
	}

	@Override
	public Long getTotalItem() {
			return (Long) veRepository.count();
	}

	@Override
	public int getTongVeDat(LichTrinhDTO dto) {
		LichTrinh idLichTrinh = lichTrinhRepository.findOne(dto.getIdLichTrinh());
		List<Ve> entity = veRepository.findByIdLichTrinh(idLichTrinh);
		int Tong = 1;
		for (Ve item : entity) {
			Tong = item.getSoVeDat() + Tong;
		}
		return Tong;
	}

	@Override
	public VeDTO findAllcheck(Long idVe) {
		Ve models = veRepository.findOne(idVe);
		VeDTO vedto = veConverter.toDTO(models);
		return vedto;
	}
	@Override
	public Boolean findAllcheckId(Long idVe) {
		Ve ve = veRepository.findByIdVe(idVe);
		if(ve != null)
		{
			return true;
		}
		return false;
	}
}
