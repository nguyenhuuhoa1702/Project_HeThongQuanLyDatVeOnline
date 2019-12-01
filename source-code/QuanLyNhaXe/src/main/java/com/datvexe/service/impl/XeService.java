package com.datvexe.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datvexe.entity.Xe;
import com.datvexe.repository.XeRepository;
import com.datvexe.service.IXeService;

@Service
public class XeService implements IXeService {

	@Autowired
	private XeRepository xeRepository;
	
	@Override
	public Map<String, String> finalAllMap() {
		
		Map<String, String>  result = new HashMap<>();
		List<Xe> entity = xeRepository.findAll();
		for (Xe item : entity) {
			result.put(item.getBienSoXe(), item.getBienSoXe());
//			result.put(key, value)
		}	
		return result;
	}
}
