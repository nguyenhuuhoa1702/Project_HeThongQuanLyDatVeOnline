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

import com.datvexe.dto.TuyenXeDTO;
import com.datvexe.service.ITuyenXeService;
import com.datvexe.util.MessageUtil;


@Controller(value = "quanlytuyenxeControllerOfAdmin")
	
public class QuanLyTuyenXeController {
	
	@Autowired
	private ITuyenXeService tuyenXeService;
	@Autowired
	private MessageUtil messageUtil;
	
//	@RequestMapping(value = "/admin/quan-ly-tuyen-xe", method = RequestMethod.GET)
//	public ModelAndView quanlytuyenxePage(@ModelAttribute("model") TuyenXeModel model) {
//		ModelAndView mav = new ModelAndView("admin/QuanLyTuyenXe");
//		model.setListResult(ILichTrinhService.finalAll1());
//		mav.addObject("model",model);
//		return mav;
//	}
	
	@RequestMapping(value = "/admin/quan-ly-tuyen-xe/danh-sach", method = RequestMethod.GET)
	public ModelAndView danhSachTuyenXePage(@ModelAttribute("model") TuyenXeDTO model,HttpServletRequest req) {
		ModelAndView mav = new ModelAndView("admin/QuanLyTuyenXe/danh-sach-tuyen-xe");
		if (req.getParameter("message") != null) {
			Map<String, String> message = messageUtil.getMessage(req.getParameter("message"));
			mav.addObject("message", message.get("message"));
			mav.addObject("alert", message.get("alert"));
		}
		model.setListResult(tuyenXeService.finalAll());
		mav.addObject("model",model);
		return mav;
	}
	
	@RequestMapping(value = "/admin/quan-ly-tuyen-xe/chinh-sua", method = RequestMethod.GET)
	public ModelAndView chinhSuaTuyenXePage(@RequestParam(value = "id", required = false) Long id,
			HttpServletRequest req,  @ModelAttribute TuyenXeDTO dto) {
		ModelAndView mav = new ModelAndView("admin/QuanLyTuyenXe/chinh-sua-tuyen-xe");
		TuyenXeDTO model = new TuyenXeDTO();
		if (id != null) {
			model = tuyenXeService.findById(id);
		}
		if (req.getParameter("message") != null) {
			Map<String, String> message = messageUtil.getMessage(req.getParameter("message"));
			mav.addObject("message", message.get("message"));
			mav.addObject("alert", message.get("alert"));
		}
		mav.addObject("model", model);
		return mav;
	}
	
	
	// Test phân trang nếu không sử dụng boostraps
//	@RequestMapping(value = "/admin/quan-ly-tuyen-xe-2", method = RequestMethod.GET)
//	public ModelAndView quanlytuyenxePage2(@RequestParam("page") int page,@RequestParam("limit") int limit) 
//	{
//		TuyenXeDTO model = new TuyenXeDTO();
//		// lấy giá trị page và limit
//		model.setPage(page);
//		model.setLimit(limit);
//		ModelAndView mav = new ModelAndView("admin/QuanLyTuyenXe2");
//		// bắt đầu phân trang
//		Pageable pageable = new PageRequest(page - 1, limit);
//		model.setListResult(ITuyenXeService.finaAll(pageable));
//		model.setTotalItem(ITuyenXeService.getTotalItem());
//		model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getLimit()));
//		mav.addObject("model",model);
//		return mav;
//	}
	

}
