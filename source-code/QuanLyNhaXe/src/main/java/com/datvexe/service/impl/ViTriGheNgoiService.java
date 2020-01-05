package com.datvexe.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.datvexe.converter.ViTriGheNgoiConverter;
import com.datvexe.dto.ViTriGheNgoiDTO;
import com.datvexe.entity.LichTrinh;
import com.datvexe.entity.Ve;
import com.datvexe.entity.ViTriGheNgoi;
import com.datvexe.repository.LichTrinhRepository;
import com.datvexe.repository.VeRepository;
import com.datvexe.repository.ViTriGheNgoiRepository;
import com.datvexe.service.IViTriGheNgoi;

@Service
public class ViTriGheNgoiService implements IViTriGheNgoi {
	@Autowired
	private ViTriGheNgoiRepository viTriGheNgoiRepository;
	@Autowired
	private ViTriGheNgoiConverter viTriGheNgoiConverter;
	@Autowired
	private LichTrinhRepository lichTrinhRepository;
	@Autowired
	private VeRepository veRepository;
	@Override
	public List<ViTriGheNgoiDTO> finalAll(Long idLichTrinh) {
		LichTrinh idlt = lichTrinhRepository.findAllById(idLichTrinh);
		List<ViTriGheNgoiDTO> models = new ArrayList<>();
		List<ViTriGheNgoi> entity = viTriGheNgoiRepository.findAllByIdLichTrinh(idlt);
		for (ViTriGheNgoi item : entity) {
			ViTriGheNgoiDTO vitrighengoiDTO = viTriGheNgoiConverter.toDTO(item);
			models.add(vitrighengoiDTO);
		}
		return models;
	}
	@Override
	@Transactional
	public ViTriGheNgoiDTO save(Long idLichTrinh, Long idVe, String viTriGheNgoi) {
		Ve ve =  veRepository.findOne(idVe);
		LichTrinh lichTrinh = lichTrinhRepository.findOne(idLichTrinh);
		ViTriGheNgoi viTriGheNgoiEntity = new ViTriGheNgoi();
		viTriGheNgoiEntity.setIdVe(ve);
		viTriGheNgoiEntity.setIdLichTrinh(lichTrinh);
		viTriGheNgoiEntity.setViTriGheNgoi(viTriGheNgoi);
		return viTriGheNgoiConverter.toDTO(viTriGheNgoiRepository.save(viTriGheNgoiEntity));

	}

}
