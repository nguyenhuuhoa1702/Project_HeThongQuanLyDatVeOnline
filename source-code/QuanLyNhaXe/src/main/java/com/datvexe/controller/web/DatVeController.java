package com.datvexe.controller.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.datvexe.dto.KhachHangDTO;
import com.datvexe.dto.LichTrinhDTO;
import com.datvexe.dto.VeDTO;
import com.datvexe.service.IKhachHangService;
import com.datvexe.service.ILichTrinhService;
import com.datvexe.service.IVeService;
import com.datvexe.service.IViTriDonTra;
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
	
	
	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public ModelAndView data(@RequestParam(value = "idLichTrinh", required = false) Long id, HttpServletRequest request){
		ModelAndView mav = new ModelAndView("web/dat-ve");
		LichTrinhDTO model = new LichTrinhDTO();
		if (id != null) {
			model = lichTrinhService.findById(id);
		}
		VeDTO vedto = new VeDTO();
		KhachHangDTO khdto = new KhachHangDTO();
		mav.addObject("noiDon", viTriDonTra.finalAllMapNoiDon(model));
		mav.addObject("noiTra", viTriDonTra.finalAllMapNoiTra(model));
		mav.addObject("model", model);
		mav.addObject("modelkh", khdto);
		mav.addObject("modelve", vedto);
		
		HttpSession session = request.getSession();
		session.setAttribute("modelLichTrinh", model);
		return mav;
	}
	
	@RequestMapping(value = "/xu-ly-dat-ve", method = RequestMethod.GET)
	public String XuLyDatVe(@ModelAttribute("modelve") VeDTO vedto,HttpServletRequest request)
	{
		String user = request.getParameter("hoten");
		int phone = Integer.parseInt(request.getParameter("phone"));
		String email = request.getParameter("email");
		
		KhachHangDTO dtoKH = new KhachHangDTO();
		dtoKH.setTenKhachHang(user);
		dtoKH.setSoDienThoai(phone);
		dtoKH.setEmail(email);
		
		LichTrinhDTO ltdto = (LichTrinhDTO) request.getSession().getAttribute("modelLichTrinh");
		
		HttpSession session = request.getSession();
		session.setAttribute("datave", vedto);
		session.setAttribute("dtokh", dtoKH);
		sessionUtil.SaveSessionKhachHang(request, dtoKH);
		sessionUtil.SaveSeesionLichTrinh(request, ltdto);
		sessionUtil.SaveSessionVe(request, vedto);
		session.setAttribute("tongtien", ltdto.getDonGia() * vedto.getSoVeDat());
		return "redirect:/thanh-toan";
	}
	
	
	@RequestMapping(value = "/thanh-toan", method = RequestMethod.GET)
	public ModelAndView thanhtoanPage(@RequestParam(value = "idLichTrinh", required = false) Long id,
			@ModelAttribute("modelve") VeDTO vedto,@ModelAttribute("modelkh") KhachHangDTO khdto,
			HttpServletRequest request)
	{
		ModelAndView mav = new ModelAndView("web/thanh-toan");
		VeDTO vedto_se = (VeDTO) request.getSession().getAttribute("datave");
		
		int phone = (int) request.getSession().getAttribute("phone");
		KhachHangDTO khdto_se = (KhachHangDTO) request.getSession().getAttribute("dtokh");
		System.out.println(vedto_se.getNoiDon());
		vedto = vedto_se;
		System.out.println(vedto.getNoiDon());
		khdto = khdto_se;
		mav.addObject("modelve", vedto);
		mav.addObject("modelkh", khdto);
		System.out.println(khdto.getTenKhachHang());
		return mav;
	}
	
	
	@RequestMapping(value="/xu-ly",method= RequestMethod.GET)
	public String XuLyDaTa(HttpServletRequest request)
	{
		VeDTO vedto_se = (VeDTO) request.getSession().getAttribute("datave");
		KhachHangDTO khdto = (KhachHangDTO) request.getSession().getAttribute("dtokh");
		LichTrinhDTO ltdto = (LichTrinhDTO) request.getSession().getAttribute("modelLichTrinh");
		veService.save(vedto_se, ltdto.getIdLichTrinh());
		khachHangService.save(khdto,  veService.getTotalItem() );
		// Hủy tất cả sesion
		HttpSession session = request.getSession();
		session.setAttribute("idVe",veService.getTotalItem());
		return "redirect:/thong-bao";
	}
	
	@RequestMapping(value="/thong-bao",method= RequestMethod.GET)
	public ModelAndView thongbaoPage(HttpServletRequest request)
	{	
		HttpSession session = request.getSession();
		session.removeAttribute("datave");
		session.removeAttribute("dtokh");
		session.removeAttribute("modelLichTrinh");
		ModelAndView mav= new ModelAndView("web/thong-bao");
		return mav;
	}
}
