package com.datvexe.controller.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.datvexe.dto.LichTrinhDTO;
import com.datvexe.service.ILichTrinhService;
import com.datvexe.service.ITuyenXeService;

@Controller(value = "trangChuWebController")
public class TrangChuWebController {
	@Autowired
	private ILichTrinhService ilichTrinhService;
	@Autowired
	private ITuyenXeService ituyenXeService;

	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	public ModelAndView homePage(HttpServletRequest req) {
		ModelAndView mav = new ModelAndView("web/TrangChu");
		LichTrinhDTO model = new LichTrinhDTO(); // Cần 1 model chứa id
		mav.addObject("tuyenXe", ituyenXeService.finalAllMap());
		mav.addObject("model", model);
		if (req.getParameter("message") != null) {
			mav.addObject("message", "Quý khách vui lòng chọn ngày đi");
		}
		if (req.getParameter("message2") != null) {
			mav.addObject("message", "Quý khách vui lòng chọn địa điểm");
		}
		if (req.getParameter("message3") != null) {
			mav.addObject("message", "Hiện tại hệ thống chưa có thông tin xe về lịch trình như yêu cầu.." + 
					"Xin quý khách vui lòng tìm vé với ngày khởi hành khác hoặc thay đổi tuyến đường tìm kiếm.");
		}	
		return mav;
	}

	@RequestMapping(value = "/dang-nhap", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}

	@RequestMapping(value = "/thoat", method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return new ModelAndView("redirect:/trang-chu");
	}

	@RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
	public ModelAndView accessDenied() {
		return new ModelAndView("redirect:/dang-nhap?accessDenied");
	}

	// ----------------------------DUY---------------------------------------------------------
	@RequestMapping(value = "/xu-ly-tim-kiem", method = RequestMethod.GET)
	public ModelAndView data(@ModelAttribute("model") LichTrinhDTO model,BindingResult bindingResult,
			HttpServletRequest req) {
		ModelAndView mav = new ModelAndView("web/XemLichTrinh/xem-lich-trinh");
		ModelAndView mav1 = new ModelAndView("redirect:/trang-chu");
		if (bindingResult.hasErrors()) {	
			mav1.addObject("message", "null-date");
			return mav1;
		}
		if(model.getDiemDen().equals("null") || model.getDiemDi().equals("null")){
			mav1.addObject("message2", "null-data");
			return mav1;
		}
		if(model.getDiemDen().equals(model.getDiemDi()))
			return mav1;
		mav.addObject("tuyenXe", ituyenXeService.finalAllMap());
		if(ilichTrinhService.DanhSachKetQuaTimKiem(model).isEmpty()){
			mav1.addObject("message3", "null-result");
			return mav1;
		}
		model.setListResult(ilichTrinhService.DanhSachKetQuaTimKiem(model));
		mav.addObject("model", model);
		return mav;
	}
}
