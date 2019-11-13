package com.datvexe.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.datvexe.model.TuyenXeModel;
import com.datvexe.service.homeService;


@Controller(value = "quanlytuyenxeControllerOfAdmin")
	
public class QuanLyTuyenXeController {
	
	@Autowired
	private homeService homeService;
	
	@RequestMapping(value = "/admin/quan-ly-tuyen-xe", method = RequestMethod.GET)
	public ModelAndView quanlytuyenxePage(@ModelAttribute("model") TuyenXeModel model) {
		ModelAndView mav = new ModelAndView("admin/QuanLyTuyenXe");
		model.setListResult(homeService.finalAll());
		mav.addObject("model",model);
		return mav;
	}

}
