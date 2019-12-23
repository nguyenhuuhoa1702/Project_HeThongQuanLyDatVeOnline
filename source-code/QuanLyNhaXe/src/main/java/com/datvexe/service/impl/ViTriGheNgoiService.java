package com.datvexe.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datvexe.converter.ViTriGheNgoiConverter;
import com.datvexe.dto.ViTriGheNgoiDTO;
import com.datvexe.entity.ViTriGheNgoi;
import com.datvexe.repository.ViTriGheNgoiRepository;
import com.datvexe.service.IViTriGheNgoi;

@Service
public class ViTriGheNgoiService implements IViTriGheNgoi {
	@Autowired
	private ViTriGheNgoiRepository viTriGheNgoiRepository;
	@Autowired
	private ViTriGheNgoiConverter viTriGheNgoiConverter;
	@Override
	public List<ViTriGheNgoiDTO> finalAll() {
		List<ViTriGheNgoiDTO> models = new ArrayList<>();
		List<ViTriGheNgoi> entity = viTriGheNgoiRepository.findAll();
		for (ViTriGheNgoi item : entity) {
			ViTriGheNgoiDTO vitrighengoiDTO = viTriGheNgoiConverter.toDTO(item);
			models.add(vitrighengoiDTO);
		}
		return models;
	}
	

}
