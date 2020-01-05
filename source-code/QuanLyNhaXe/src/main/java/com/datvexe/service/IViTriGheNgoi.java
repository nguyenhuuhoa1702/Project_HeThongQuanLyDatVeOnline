package com.datvexe.service;

import java.util.List;

import com.datvexe.dto.ViTriGheNgoiDTO;

public interface IViTriGheNgoi {

	List<ViTriGheNgoiDTO> finalAll(Long idLichTrinh);
	
	ViTriGheNgoiDTO save(Long idLichTrinh,Long idVe,String viTriGheNgoi);

	
}