package com.datvexe.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.datvexe.dto.LichTrinhDTO;
import com.datvexe.entity.ViTriDonTra;
import com.datvexe.service.ILichTrinhService;
import com.datvexe.service.ITuyenXeService;
import com.datvexe.service.IViTriDonTra;

@Controller(value = "datveWebController")
public class DatVeController {
	@Autowired
	private ITuyenXeService ituyenXeService;
	@Autowired
	private ILichTrinhService lichTrinhService;
	@Autowired
	private IViTriDonTra viTriDonTra;
	
	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public ModelAndView data(@RequestParam(value = "idLichTrinh", required = false) Long id){
		ModelAndView mav = new ModelAndView("web/dat-ve");
		LichTrinhDTO model = new LichTrinhDTO();
		if (id != null) {
			model = lichTrinhService.findById(id);
		}
//		System.out.println(model.getBienSoXe() + model.getDiemDen() + model.getDiemDi() + model.getDonGia());
	//	model.setListResult(lichTrinhService.DanhSachKetQuaTimKiem(model));
		
		mav.addObject("noiDon", viTriDonTra.finalAllMapNoiDon(model));
		mav.addObject("noiTra", viTriDonTra.finalAllMapNoiTra(model));
		mav.addObject("model", model);
		return mav;
	}
}
