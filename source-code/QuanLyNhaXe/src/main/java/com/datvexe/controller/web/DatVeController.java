package com.datvexe.controller.web;

import java.util.ArrayList;

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

import com.datvexe.converter.VeConverter;
import com.datvexe.dto.KhachHangDTO;
import com.datvexe.dto.LichTrinhDTO;
import com.datvexe.dto.VeDTO;
import com.datvexe.dto.ViTriGheNgoiDTO;
import com.datvexe.service.IKhachHangService;
import com.datvexe.service.ILichTrinhService;
import com.datvexe.service.IVeService;
import com.datvexe.service.IViTriDonTra;
import com.datvexe.service.IViTriGheNgoi;
import com.datvexe.service.IXeService;
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
	@Autowired
	private VeConverter veConverter;
	@Autowired
	private IViTriGheNgoi viTriGheNgoi;

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

		VeDTO vedto = new VeDTO();
		KhachHangDTO khdto = new KhachHangDTO();
		ViTriGheNgoiDTO vtgndto = new ViTriGheNgoiDTO();
		vtgndto.setListResult(viTriGheNgoi.finalAll(model.getIdLichTrinh()));
		mav.addObject("noiDon", viTriDonTra.finalAllMapNoiDon(model));
		mav.addObject("noiTra", viTriDonTra.finalAllMapNoiTra(model));
		mav.addObject("tongghe", xeService.TongGhe(model.getBienSoXe()));
		mav.addObject("vtgndto", vtgndto);
		mav.addObject("model", model);
		mav.addObject("modelkh", khdto);
		mav.addObject("modelve", vedto);

		if (request.getParameter("message") != null) {
			mav.addObject("message", "Quý khách vui lòng chọn nơi đón");
		} else if (request.getParameter("message-2") != null) {
			mav.addObject("message", "Quý khách vui lòng chọn nơi trả");
		} else if (request.getParameter("message-3") != null) {
			mav.addObject("message", "Quý khách vui lòng chọn ít nhất 1 vé ");
		} else if (request.getParameter("message-4") != null) {
			mav.addObject("message",
					"Chỉ còn có " + model.getGheTrong() + " ghế trống. Xin quý khách vui lòng chọn lại");
		} else if (request.getParameter("message-5") != null) {
			mav.addObject("message", "Vui lòng chọn đúng số lượng ghế với số vé đặt");
		}
//		session.setAttribute("message", model);
		return mav;
	}

	@RequestMapping(value = "/xu-ly-dat-ve", method = RequestMethod.GET)
	public String XuLyDatVe(@RequestParam(value = "idLichTrinh", required = false) Long id,
			@ModelAttribute("modelve") VeDTO vedto, HttpServletRequest request, ModelMap model) {
		String user = request.getParameter("hoten");
		int phone = Integer.parseInt(request.getParameter("phone"));
		String email = request.getParameter("email");
		
		HttpSession session = request.getSession();
		
		KhachHangDTO dtoKH = new KhachHangDTO();
		dtoKH.setTenKhachHang(user);
		dtoKH.setSoDienThoai(phone);
		dtoKH.setEmail(email);

		LichTrinhDTO ltdto = (LichTrinhDTO) request.getSession().getAttribute("modelLichTrinh");

		if (vedto.getNoiDon().equals("null")) {
			model.addAttribute("message", "null-data-don");
			return "redirect:/book?idLichTrinh=" + ltdto.getIdLichTrinh();
		} else if (vedto.getNoiTra().equals("null")) {
			model.addAttribute("message-2", "null-data-tra");
			return "redirect:/book?idLichTrinh=" + ltdto.getIdLichTrinh();
		} else if (vedto.getSoVeDat() <= 0) {
			model.addAttribute("message-3", "null-data-ve");
			return "redirect:/book?idLichTrinh=" + ltdto.getIdLichTrinh();
		} else if (vedto.getSoVeDat() > ltdto.getGheTrong()) {
			model.addAttribute("message-4", "error-data-ve");
			return "redirect:/book?idLichTrinh=" + ltdto.getIdLichTrinh();
		}
		
		int count = 0 ;
		ArrayList<String> listCheck = new ArrayList<>();
		for(int i = 1 ; i <=  xeService.TongGhe(ltdto.getBienSoXe()); i++ )
		{
			boolean check = request.getParameter("A"+i) != null;
			if(check == true)
			{	
				listCheck.add(request.getParameter("A"+i))  ;
				count++;
			}
			
			session.setAttribute("listCheck", listCheck);
			
		}
		
		if(count > vedto.getSoVeDat() || count < vedto.getSoVeDat())
		{
			model.addAttribute("message-5", "error-data-check");
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
		if (request.getParameter("messageError") != null) {
			if (request.getParameter("messageError").equals("null-check")) {
				return mav.addObject("message", "Quý khách vui lòng chọn phương thức thanh toán");
			} else {
				if (request.getParameter("messageError").equals("null-code"))
					return mav.addObject("message", "Quý khách vui lòng nhập mã thanh toán");
				else {
					return mav.addObject("message", "Mã thanh toán không đúng");
				}
			}
		}
		return mav;
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/xu-ly-thanh-toan", method = RequestMethod.GET)
	public String XuLyDaTa(HttpServletRequest request, ModelMap model) {
		VeDTO vedto_se = (VeDTO) request.getSession().getAttribute("datave");
		KhachHangDTO khdto = (KhachHangDTO) request.getSession().getAttribute("dtokh");
		LichTrinhDTO ltdto = (LichTrinhDTO) request.getSession().getAttribute("modelLichTrinh");
		ArrayList<String> listCheck = (ArrayList<String>) request.getSession().getAttribute("listCheck");
		
		String check = request.getParameter("radio");
		String code = request.getParameter("code");
		if (check == null)
			return "redirect:/thanh-toan?messageError=null-check";
		if (request.getParameter("code") != null 
				&& request.getParameter("code-2") != null
				&& request.getParameter("code-3") != null 
				&& request.getParameter("code-4") != null
				&& request.getParameter("code-5") != null)
			if (code.equals("") && request.getParameter("code-2").equals("")
					&& request.getParameter("code-3").equals("") 
					&& request.getParameter("code-5").equals("")
					&& request.getParameter("code-4").equals("")) {
				return "redirect:/thanh-toan?messageError=null-code";
//				ModelAndView mav = new ModelAndView("web/thanh-toan");
//				model.addAttribute("alert", "danger");
//				model.addAttribute("messageCode", "Vui lòng nhập mã thanh toán");
//				return "redirect:/thanh-toan?";
			}
		if (request.getParameter("radio") != null) {
			if (request.getParameter("radio").equals("on")) {
				if (code.equals("1234") 
						|| request.getParameter("code-2").equals("1234")
						|| request.getParameter("code-3").equals("1234")
						|| request.getParameter("code-4").equals("1234")
						|| request.getParameter("code-5").equals("1234")) {
					veService.save(vedto_se, ltdto.getIdLichTrinh());
					khachHangService.save(khdto, veService.getTotalItem());
					lichTrinhService.CapNhatGheTrong(ltdto, vedto_se.getSoVeDat());
					HttpSession session = request.getSession();
					for(int i = 0 ; i < listCheck.size(); i++)
					{
						viTriGheNgoi.save(ltdto.getIdLichTrinh(), veService.getTotalItem(), listCheck.get(i));
						
					}
					session.setAttribute("idVe", veService.getTotalItem());					
				} else {
					return "redirect:/thanh-toan?messageError=faild-code";
				}
			}
		}
		return "redirect:/thong-bao";
	}

	@RequestMapping(value = "/thong-bao", method = RequestMethod.GET)
	public ModelAndView thongbaoPage(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("web/thong-bao");
		HttpSession session = request.getSession();
		session.removeAttribute("datave");
		session.removeAttribute("dtokh");
		session.removeAttribute("modelLichTrinh");
	
		return mav;
	}

	@RequestMapping(value = "/xem-chi-tiet-ve", method = RequestMethod.GET)
	public ModelAndView chitietvePage(HttpServletRequest request)
	{
		int tongtien = 0 ;
		VeDTO dtoVe = new VeDTO();
		KhachHangDTO dtoKH = new KhachHangDTO();
		LichTrinhDTO dtoLT = new LichTrinhDTO();
		ModelAndView mav = new ModelAndView("web/xem-chi-tiet-ve");
		if(request.getParameter("message") != null && request.getParameter("alert") != null) {
			mav.addObject("alert", "error");
			mav.addObject("alert3", "danger");
			mav.addObject("message", "Xác thực thất bại ! Vui lòng kiểm tra lại mã vé hoặc số điện thoại");
		}
		else
		{
			mav.addObject("message2", "Vui lòng nhập mã vé, số điện thoại và bấm kiểm tra vé");
			mav.addObject("alert2", "success");

		}
		if(request.getParameter("code") != null && request.getParameter("phone") != null)
		{
			int phone = Integer.parseInt(request.getParameter("phone"));
			String code = request.getParameter("code");
			if(!veService.findAllcheckId(Long.parseLong(code)))
			{
				ModelAndView mav2 = new ModelAndView("redirect:/xem-chi-tiet-ve?message=a&alert=b");
				mav.addObject("alert", "error");
				mav.addObject("message", "Xác thực thất bại ! Vui lòng kiểm tra lại mã vé");
				return mav2;
			}
			if(!khachHangService.findAllcheck(phone, Long.parseLong(code))) {
				ModelAndView mav2 = new ModelAndView("redirect:/xem-chi-tiet-ve?message=a&alert=b");
				mav.addObject("alert", "error");
				mav.addObject("message", "Xác thực thất bại ! Vui lòng kiểm tra lại số điện thoại");
				return mav2;
			}
			dtoVe = veService.findAllcheck(Long.parseLong(code));
			dtoKH = khachHangService.findAllcheck(dtoVe.getIdVe());
			dtoLT = lichTrinhService.findById(dtoVe.getIdLichTrinh());
			tongtien = dtoVe.getSoVeDat() * dtoLT.getDonGia();
			mav.addObject("message", "Xác thực thành công ! Vui lòng kiểm tra thông tin bên dưới");
			mav.addObject("alert3", "success");
		}

		mav.addObject("model", dtoVe);
		mav.addObject("model2",dtoKH);
		mav.addObject("model3", dtoLT);
		mav.addObject("tongtien", tongtien);
		return mav;
	}
}
