package com.datvexe.service;

import java.util.List;

import com.datvexe.dto.KhachHangDTO;
import com.datvexe.dto.LichTrinhDTO;

public interface IKhachHangService {
	List<KhachHangDTO> finalALl();
	
	KhachHangDTO save(KhachHangDTO dto,Long idVe);
}
