package com.datvexe.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

import com.datvexe.dto.KhachHangDTO;
import com.datvexe.dto.LichTrinhDTO;
import com.datvexe.dto.VeDTO;

@Component
public class SessionUtil {
	public void SaveSeesionLichTrinh(HttpServletRequest request,LichTrinhDTO dto) 
	{
		HttpSession session = request.getSession();
		session.setAttribute("biensoxe", dto.getBienSoXe());
		session.setAttribute("diemdi", dto.getDiemDi());
		session.setAttribute("diemden", dto.getDiemDen());
		session.setAttribute("ngaydi", dto.getNgayDi());
		session.setAttribute("thoigiandi", dto.getThoiGian());
		session.setAttribute("thoigianden", dto.getThoiGianDen());
		session.setAttribute("dongia",dto.getDonGia());
	}
	public void SaveSessionKhachHang(HttpServletRequest request,KhachHangDTO dto)
	{
		HttpSession session = request.getSession();
		session.setAttribute("phone", dto.getSoDienThoai());
		session.setAttribute("name", dto.getTenKhachHang());
		session.setAttribute("email", dto.getEmail());
	}
	public void SaveSessionVe(HttpServletRequest request, VeDTO dto)
	{
		HttpSession session = request.getSession();
		session.setAttribute("noidon", dto.getNoiDon());
		session.setAttribute("noitra", dto.getNoiTra());
		session.setAttribute("sovedat", dto.getSoVeDat());
	}
	
	
	
}
