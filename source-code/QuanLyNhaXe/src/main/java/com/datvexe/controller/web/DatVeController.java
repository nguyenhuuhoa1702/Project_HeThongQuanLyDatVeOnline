package com.datvexe.controller.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.datvexe.dto.KhachHangDTO;
import com.datvexe.dto.LichTrinhDTO;
import com.datvexe.dto.VeDTO;
import com.datvexe.service.IKhachHangService;
import com.datvexe.service.ILichTrinhService;
import com.datvexe.service.ITuyenXeService;
import com.datvexe.service.IVeService;
import com.datvexe.service.IViTriDonTra;
import com.datvexe.service.impl.VeService;

@Controller(value = "datveWebController")
public class DatVeController {
	@Autowired
	private IKhachHangService khachHangService;
	@Autowired
	private ILichTrinhService lichTrinhService;
	@Autowired
	private IViTriDonTra viTriDonTra;
	@Autowired
	private IVeService veService;
	
	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public ModelAndView data(@RequestParam(value = "idLichTrinh", required = false) Long id){
		ModelAndView mav = new ModelAndView("web/dat-ve");
		LichTrinhDTO model = new LichTrinhDTO();
		if (id != null) {
			model = lichTrinhService.findById(id);
		}
		VeDTO vedto = new VeDTO();
		KhachHangDTO khdto = new KhachHangDTO();
		mav.addObject("noiDon", viTriDonTra.finalAllMapNoiDon(model));
		mav.addObject("noiTra", viTriDonTra.finalAllMapNoiTra(model));
		mav.addObject("model", model);
		mav.addObject("modelkh", khdto);
		mav.addObject("modelve", vedto);
		return mav;
	}
	
	@RequestMapping(value = "/thanh-toan", method = RequestMethod.GET)
	public ModelAndView thanhtoanPage(@RequestParam(value = "idLichTrinh", required = false) Long id,@ModelAttribute("modelve") VeDTO vedto,HttpServletRequest request){
		ModelAndView mav = new ModelAndView("web/thanh-toan");
		String user = request.getParameter("hoten");
		int phone = Integer.parseInt(request.getParameter("phone"));
		String email = request.getParameter("email");
		KhachHangDTO dtoKH = new KhachHangDTO();
		dtoKH.setTenKhachHang(user);
		dtoKH.setSoDienThoai(phone);
		dtoKH.setEmail(email);
		Long id1 = Long.parseLong("1");
		khachHangService.save(dtoKH, id1);
		veService.save(vedto, id1 );
		mav.addObject("modelve", vedto);
		mav.addObject("dto", dtoKH);
		return mav;
	}
}
