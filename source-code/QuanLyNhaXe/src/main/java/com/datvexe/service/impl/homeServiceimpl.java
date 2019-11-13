package com.datvexe.service.impl;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datvexe.dto.newRouteDTO;
import com.datvexe.entity.TuyenXe;
import com.datvexe.model.TuyenXeModel;
import com.datvexe.repository.NewRepository;
import com.datvexe.service.homeService;

@Service
public class homeServiceimpl implements homeService {

//	@Override
//		public List<String> loadMenu() {
//			List<String> menus = new ArrayList<>();
//			menus.add("Blog java web");
//			menus.add("Hướng dẫn học java web");
//			menus.add("Liên hệ");
//			menus.add("Thanh toán");22
//			return menus;
//	}
//	
	@Autowired
	private NewRepository newRepository;

	public List<TuyenXeModel> finalAll()
	{	
		List<TuyenXeModel> models = new ArrayList<>();
		List<TuyenXe> entity = newRepository.findAll();
		for(TuyenXe item: entity)
		{
			TuyenXeModel tuyenXeModel =  new TuyenXeModel();
			tuyenXeModel.setTuyenXeID(item.getId());
			tuyenXeModel.setTenTuyen(item.getTenTuyen());
			tuyenXeModel.setDiemDen(item.getDiemDen());
			tuyenXeModel.setDiemDi(item.getDiemDi());
			models.add(tuyenXeModel);
		}
		return models;
	}

	@Override
	public List<String> loadMenu() {
		// TODO Auto-generated method stub
		return null;
	}

}
