package com.datvexe.controller.admin;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
import com.datvexe.service.IXeService;
import com.datvexe.util.MessageUtil;

@Controller(value = "quanlylichtrinhControllerOfAdmin")
public class QuanLyLichTrinhController {

	@Autowired
	private ILichTrinhService ilichTrinhService;
	@Autowired
	private ITuyenXeService ituyenXeService;
	@Autowired
	private IXeService iXeService;
	
	@Autowired
	private MessageUtil messageUtil;

	@RequestMapping(value = "/admin/quan-ly-lich-trinh/danh-sach", method = RequestMethod.GET)
	public ModelAndView danhSachTuyenXePage(@ModelAttribute("model") LichTrinhDTO model, HttpServletRequest req) {
		ModelAndView mav = new ModelAndView("admin/QuanLyLichTrinh/danh-sach-lich-trinh");
		if (req.getParameter("message") != null) {
			Map<String, String> message = messageUtil.getMessage(req.getParameter("message"));
			mav.addObject("message", message.get("message"));
			mav.addObject("alert", message.get("alert"));
		}
		model.setListResult(ilichTrinhService.finalAll());
		mav.addObject("model", model);
		return mav;
	}

	@RequestMapping(value = "/admin/quan-ly-lich-trinh/chinh-sua", method = RequestMethod.GET)
	public ModelAndView chinhSuaTuyenXePage(@RequestParam(value = "id", required = false) Long id,
			HttpServletRequest req) {
		ModelAndView mav = new ModelAndView("admin/QuanLyLichTrinh/chinh-sua-lich-trinh");
		LichTrinhDTO model = new LichTrinhDTO();
		if (id != null) {
			model = ilichTrinhService.findById(id);
		}
		if (req.getParameter("message") != null) {
			Map<String, String> message = messageUtil.getMessage(req.getParameter("message"));
			mav.addObject("message", message.get("message"));
			mav.addObject("alert", message.get("alert"));
		}
		// Cần 1 model chứa id
		mav.addObject("tuyenXe", ituyenXeService.finalAllMap());
		mav.addObject("xe", iXeService.finalAllMap());
//		mav.addObject(attributeName, attributeValue)
		mav.addObject("model", model);
		return mav;
	}

	// sử dụng form
	@RequestMapping(value = "admin/quan-ly-lich-trinh/check", method = RequestMethod.POST)
	public String test(@RequestParam(value = "id", required = false) Long id, @ModelAttribute LichTrinhDTO dto) {
		ilichTrinhService.save(dto);
		return "redirect:/admin/quan-ly-lich-trinh/danh-sach";
	}
}
