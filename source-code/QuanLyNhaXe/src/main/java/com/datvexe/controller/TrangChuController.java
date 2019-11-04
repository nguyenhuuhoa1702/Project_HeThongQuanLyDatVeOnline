package com.datvexe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TrangChuController {
	 @RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	
	   public ModelAndView homePage() {
	      ModelAndView mav = new ModelAndView("TrangChu");
	      return mav;
	   }
	 
	 @RequestMapping(value = "/admin", method = RequestMethod.GET)	
	   public ModelAndView adminPage() {
	      ModelAndView mav = new ModelAndView("Admin");
	      return mav;
	   }
}
