package com.datvexe.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TrangChuWebController {
	 @RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	   public ModelAndView homePage() {
	      ModelAndView mav = new ModelAndView("web/TrangChu");
	      return mav;
	   }	 
	 
	 @RequestMapping(value = "/admin/login", method = RequestMethod.GET)
	   public ModelAndView loginPage() {
	      ModelAndView mav = new ModelAndView("web/Login");
	      return mav;
	   }	 
}
