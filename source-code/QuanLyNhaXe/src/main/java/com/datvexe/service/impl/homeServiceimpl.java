package com.datvexe.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.datvexe.service.homeService;

@Service
public class homeServiceimpl implements homeService {

	@Override
		public List<String> loadMenu() {
			List<String> menus = new ArrayList<>();
			menus.add("Blog java web");
			menus.add("Hướng dẫn học java web");
			menus.add("Liên hệ");
			menus.add("Thanh toán");
			return menus;
	}
	

}
