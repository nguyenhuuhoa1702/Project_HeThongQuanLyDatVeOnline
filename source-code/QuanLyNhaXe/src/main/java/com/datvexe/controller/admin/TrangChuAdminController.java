package com.datvexe.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TrangChuAdminController {
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView adminPage() {
		ModelAndView mav = new ModelAndView("admin/admin");
		return mav;
	}
	@RequestMapping(value = "/admin/quanlytaikhoan", method = RequestMethod.GET)
	public ModelAndView quanlytaikhoanPage() {
		ModelAndView mav = new ModelAndView("admin/QuanLyTaiKhoan");
		return mav;
	}
}