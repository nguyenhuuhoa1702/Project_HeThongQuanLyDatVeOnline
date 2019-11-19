package com.datvexe.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.datvexe.dto.LichTrinhDTO;
import com.datvexe.service.ILichTrinhService;
import com.datvexe.service.ITuyenXeService;
import com.datvexe.service.impl.TuyenXeService;

@Controller(value = "quanlylichtrinhControllerOfAdmin")
public class QuanLyLichTrinhController {
	
	@Autowired
	private ILichTrinhService ilichTrinhService;
	@Autowired
	private ITuyenXeService ituyenXeService;
	
	@RequestMapping(value = "/admin/quan-ly-lich-trinh/danh-sach", method = RequestMethod.GET)
	public ModelAndView danhSachTuyenXePage(@ModelAttribute("model") LichTrinhDTO model) {
		ModelAndView mav = new ModelAndView("admin/QuanLyLichTrinh/danh-sach");
		model.setListResult(ilichTrinhService.finalAll());
		mav.addObject("model",model);
		return mav;
	}
	
	
	@RequestMapping(value = "/admin/quan-ly-lich-trinh/chinh-sua", method = RequestMethod.GET)
	public ModelAndView chinhSuaTuyenXePage(@RequestParam(value="id", required = false) Long id) {
		ModelAndView mav = new ModelAndView("admin/QuanLyLichTrinh/chinh-sua");
		LichTrinhDTO model = new LichTrinhDTO();
		
		if (id != null )
		{
			model = ilichTrinhService.findById(id);
		}
		//Cần 1 model chứa id
		mav.addObject("tuyenXe", ituyenXeService.finalAllMap());
//		mav.addObject(attributeName, attributeValue)
		mav.addObject("model", model );
		return mav;
	}

}
