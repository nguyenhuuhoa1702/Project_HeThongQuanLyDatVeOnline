package com.datvexe.service;

import com.datvexe.dto.LichTrinhDTO;
import com.datvexe.dto.VeDTO;

public interface IVeService {

	VeDTO save(VeDTO dto,Long idLichTrinh);

	Long getTotalItem();
	
	int getTongVeDat(LichTrinhDTO dto);
	
}
