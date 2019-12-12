package com.datvexe.controller.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.datvexe.dto.KhachHangDTO;
import com.datvexe.dto.LichTrinhDTO;
import com.datvexe.dto.VeDTO;
import com.datvexe.dto.XeDTO;
import com.datvexe.service.IKhachHangService;
import com.datvexe.service.ILichTrinhService;
import com.datvexe.service.IVeService;
import com.datvexe.service.IViTriDonTra;
import com.datvexe.service.IXeService;
import com.datvexe.service.impl.XeService;
import com.datvexe.util.SessionUtil;

@Controller(value = "datveWebController")
public class DatVeController {
	@Autowired
	private IKhachHangService khachHangService;
	@Autowired
	private ILichTrinhService lichTrinhService;
	@Autowired
	private IViTriDonTra viTriDonTra;
	@Autowired
	private IVeService veService;
	@Autowired
	private SessionUtil sessionUtil;
	@Autowired
	private IXeService xeService;

	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public ModelAndView data(@RequestParam(value = "idLichTrinh", required = false) Long id,
			HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("web/dat-ve");
		LichTrinhDTO model = new LichTrinhDTO();
		if (id != null) {
			model = lichTrinhService.findById(id);
		}
		HttpSession session = request.getSession();
		session.setAttribute("modelLichTrinh", model);
		
		sessionUtil.SaveSeesionLichTrinh(request, model);
		
		if (request.getParameter("message") != null) {
			mav.addObject("message", "Quý khách vui lòng chọn nơi đón");
		} else if (request.getParameter("message-2") != null) {
			mav.addObject("message", "Quý khách vui lòng chọn nơi trả");
		} else if (request.getParameter("message-3") != null) {
			mav.addObject("message", "Quý khách vui lòng chọn ít nhất 1 vé ");
		} else if (request.getParameter("message-4") != null) {
			mav.addObject("message", "Chỉ còn có " + model.getGheTrong() + " ghế trống. Xin quý khách vui lòng chọn lại");
		}
		VeDTO vedto = new VeDTO();
		KhachHangDTO khdto = new KhachHangDTO();
		mav.addObject("noiDon", viTriDonTra.finalAllMapNoiDon(model));
		mav.addObject("noiTra", viTriDonTra.finalAllMapNoiTra(model));
		mav.addObject("model", model);
		mav.addObject("modelkh", khdto);
		mav.addObject("modelve", vedto);	
		return mav;
	}

	@RequestMapping(value = "/xu-ly-dat-ve", method = RequestMethod.GET)
	public String XuLyDatVe(@ModelAttribute("modelve") VeDTO vedto, HttpServletRequest request, ModelMap model) {
		String user = request.getParameter("hoten");
		int phone = Integer.parseInt(request.getParameter("phone"));
		String email = request.getParameter("email");

		KhachHangDTO dtoKH = new KhachHangDTO();
		dtoKH.setTenKhachHang(user);
		dtoKH.setSoDienThoai(phone);
		dtoKH.setEmail(email);
		
		LichTrinhDTO ltdto = (LichTrinhDTO) request.getSession().getAttribute("modelLichTrinh");
		
		if (vedto.getNoiDon().equals("null")) {
			model.addAttribute("message", "null-data-don");
			return "redirect:/book?idLitchTrinh=" + ltdto.getIdLichTrinh();
		}
		else if (vedto.getNoiTra().equals("null"))
		{
			model.addAttribute("message-2", "null-data-tra");
			return "redirect:/book?idLichTrinh=" + ltdto.getIdLichTrinh();
		}
		else if (vedto.getSoVeDat() <= 0){
			model.addAttribute("message-3", "null-data-ve");
			return "redirect:/book?idLichTrinh=" + ltdto.getIdLichTrinh();
		}
		else if(vedto.getSoVeDat() > ltdto.getGheTrong()){
			model.addAttribute("message-4", "error-data-ve");
			return "redirect:/book?idLichTrinh=" + ltdto.getIdLichTrinh();
		}
		
		// test ---- tìm ghế trống không dựa vào cột gheTrong
		
//		int gheTrong = 0;
//		XeDTO xedto = new XeDTO();
//		System.out.println(ltdto.getBienSoXe());
//		xedto = xeService.findById(ltdto.getBienSoXe());
//		System.out.println(xedto.getTongGhe());
//		System.out.println(ltdto.getIdLichTrinh());
//		System.out.println(xedto.getTongGhe()-veService.getTongVeDat(ltdto));		
//		gheTrong = xedto.getTongGhe()-veService.getTongVeDat(ltdto);
		
		// ket thuc test ------ tìm ghế trống không dựa vào cột gheTrong
		
		HttpSession session = request.getSession();
		session.setAttribute("datave", vedto);
		session.setAttribute("dtokh", dtoKH);
		sessionUtil.SaveSessionKhachHang(request, dtoKH);		
		sessionUtil.SaveSessionVe(request, vedto);
		session.setAttribute("tongtien", ltdto.getDonGia() * vedto.getSoVeDat());
		return "redirect:/thanh-toan";
	}

	@RequestMapping(value = "/thanh-toan", method = RequestMethod.GET)
	public ModelAndView thanhtoanPage(@RequestParam(value = "idLichTrinh", required = false) Long id,
			@ModelAttribute("modelve") VeDTO vedto, @ModelAttribute("modelkh") KhachHangDTO khdto,
			HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("web/thanh-toan");
		VeDTO vedto_se = (VeDTO) request.getSession().getAttribute("datave");
		KhachHangDTO khdto_se = (KhachHangDTO) request.getSession().getAttribute("dtokh");
		vedto = vedto_se;
		khdto = khdto_se;
		mav.addObject("modelve", vedto);
		mav.addObject("modelkh", khdto);
		return mav;
	}

	@RequestMapping(value = "/xu-ly", method = RequestMethod.GET)
	public String XuLyDaTa(HttpServletRequest request) {
		VeDTO vedto_se = (VeDTO) request.getSession().getAttribute("datave");
		KhachHangDTO khdto = (KhachHangDTO) request.getSession().getAttribute("dtokh");
		LichTrinhDTO ltdto = (LichTrinhDTO) request.getSession().getAttribute("modelLichTrinh");
		veService.save(vedto_se, ltdto.getIdLichTrinh());
		khachHangService.save(khdto, veService.getTotalItem());
		lichTrinhService.CapNhatGheTrong(ltdto, vedto_se.getSoVeDat());
		// Hủy tất cả sesion
		HttpSession session = request.getSession();
		session.setAttribute("idVe", veService.getTotalItem());
		return "redirect:/thong-bao";
	}

	@RequestMapping(value = "/thong-bao", method = RequestMethod.GET)
	public ModelAndView thongbaoPage(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("datave");
		session.removeAttribute("dtokh");
		session.removeAttribute("modelLichTrinh");
		ModelAndView mav = new ModelAndView("web/thong-bao");
		return mav;
	}
}
