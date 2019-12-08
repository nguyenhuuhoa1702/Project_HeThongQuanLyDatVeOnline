package com.datvexe.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.datvexe.dto.KhachHangDTO;
import com.datvexe.service.IKhachHangService;
import com.datvexe.util.MessageUtil;

@Controller(value = "quanlykhachhangControllerOfAdmin")
public class QuanLyKhachHangController {
	
	@Autowired
	private MessageUtil messageUtil;
	@Autowired
	private IKhachHangService khachHangService;
	
	@RequestMapping(value ="/admin/quan-ly-khach-hang/danh-sach", method = RequestMethod.GET)
	public ModelAndView danhSachKhachHangPage(@ModelAttribute("model") KhachHangDTO model,HttpServletRequest req)
	{
		ModelAndView mav = new ModelAndView("admin/QuanLyKhachHang/danh-sach-khach-hang");
		if(req.getParameter("message") != null)
		{
			//
		}
		model.setListResult(khachHangService.finalALl());
		mav.addObject("model", model);
		return mav;
	}
	
	/*
	 ModelAndView mav = new ModelAndView("admin/QuanLyLichTrinh/danh-sach-lich-trinh");
		if (req.getParameter("message") != null) {
			Map<String, String> message = messageUtil.getMessage(req.getParameter("message"));
			mav.addObject("message", message.get("message"));
			mav.addObject("alert", message.get("alert"));
		}
		model.setListResult(ilichTrinhService.finalAll());
		mav.addObject("model", model);
		return mav;
	 
	 */
}
