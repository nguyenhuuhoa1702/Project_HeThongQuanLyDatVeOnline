package com.datvexe.service;

import com.datvexe.dto.LichTrinhDTO;
import com.datvexe.dto.VeDTO;
import com.datvexe.entity.KhachHang;
import com.datvexe.entity.Ve;

public interface IVeService {

	VeDTO save(VeDTO dto,Long idLichTrinh);

	Long getTotalItem();
	
	int getTongVeDat(LichTrinhDTO dto);
	
	VeDTO findAllcheck(Long idVe);
	
	
	Boolean findAllcheckId(Long idVe);
}
