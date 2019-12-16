package com.datvexe.service;

import java.util.List;

import com.datvexe.dto.KhachHangDTO;
import com.datvexe.dto.VeDTO;
import com.datvexe.entity.Ve;

public interface IKhachHangService {
	List<KhachHangDTO> finalALl();
	
	KhachHangDTO save(KhachHangDTO dto,Long idVe);
	
	Long getTotalItem();
	

	KhachHangDTO findAllcheck(Long idVe);
}
