package com.datvexe.service;

import java.util.Map;

import com.datvexe.dto.XeDTO;

public interface IXeService {
	Map<String, String> finalAllMap();
		
	XeDTO findById(String BienSoXe);
	
	int TongGhe(String BienSoXe);
}
