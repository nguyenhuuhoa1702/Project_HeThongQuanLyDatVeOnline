package com.datvexe.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.datvexe.dto.TuyenXeDTO;
import com.datvexe.service.ITuyenXeService;


@Controller(value = "quanlytuyenxeControllerOfAdmin")
	
public class QuanLyTuyenXeController {
	
	@Autowired
	private ITuyenXeService tuyenXeService;
	
//	@RequestMapping(value = "/admin/quan-ly-tuyen-xe", method = RequestMethod.GET)
//	public ModelAndView quanlytuyenxePage(@ModelAttribute("model") TuyenXeModel model) {
//		ModelAndView mav = new ModelAndView("admin/QuanLyTuyenXe");
//		model.setListResult(ILichTrinhService.finalAll1());
//		mav.addObject("model",model);
//		return mav;
//	}
	
	@RequestMapping(value = "/admin/quan-ly-tuyen-xe/danh-sach", method = RequestMethod.GET)
	public ModelAndView danhSachTuyenXePage(@ModelAttribute("model") TuyenXeDTO model) {
		ModelAndView mav = new ModelAndView("admin/QuanLyTuyenXe/danh-sach");
		model.setListResult(tuyenXeService.finalAll());
		mav.addObject("model",model);
		return mav;
	}
	
	@RequestMapping(value = "/admin/quan-ly-tuyen-xe/chinh-sua", method = RequestMethod.GET)
	public ModelAndView chinhSuaTuyenXePage() {
		ModelAndView mav = new ModelAndView("admin/QuanLyTuyenXe/chinh-sua");
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
