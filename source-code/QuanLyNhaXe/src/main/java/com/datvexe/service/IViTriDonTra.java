package com.datvexe.service;

import java.util.Map;

import com.datvexe.dto.LichTrinhDTO;

public interface IViTriDonTra {
	Map<String, String> finalAllMapNoiDon(LichTrinhDTO dto);
	Map<String, String> finalAllMapNoiTra(LichTrinhDTO dto);
}
