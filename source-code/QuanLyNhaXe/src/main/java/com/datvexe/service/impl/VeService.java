package com.datvexe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.datvexe.converter.VeConverter;
import com.datvexe.dto.VeDTO;
import com.datvexe.entity.LichTrinh;
import com.datvexe.entity.Ve;
import com.datvexe.repository.LichTrinhRepository;
import com.datvexe.repository.VeRepository;
import com.datvexe.service.IVeService;

@Service
public class VeService implements IVeService {
	
	@Autowired
	private IVeService veService;
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

}
