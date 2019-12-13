package com.datvexe.controller.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "testController")
public class TestController {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView homePage(HttpServletRequest req) {
		ModelAndView mav = new ModelAndView("web/test");
		return mav;
	}
	@RequestMapping(value = "/test-2", method = RequestMethod.POST)
	public ModelAndView homePage2(HttpServletRequest req) {
		ModelAndView mav = new ModelAndView("web/test");
		String a = req.getParameter("abcd");
		System.out.println(a);
		return mav;
	}
}
