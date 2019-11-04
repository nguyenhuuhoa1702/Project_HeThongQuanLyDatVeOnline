//package com.datvexe.interceptor;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.datvexe.service.homeService;
//
//public class MenuHandleInterceptor implements HandlerInterceptor {
//	
//	@Autowired
//	private homeService homeService;
//
//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//			throws Exception {
//		request.setAttribute("menu",homeService.loadMenu());
//		return true;
//	}
//
//	@Override
//	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
//			ModelAndView modelAndView) throws Exception {
//	}
//
//	@Override
//	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
//			throws Exception {
//	}
//
//}
