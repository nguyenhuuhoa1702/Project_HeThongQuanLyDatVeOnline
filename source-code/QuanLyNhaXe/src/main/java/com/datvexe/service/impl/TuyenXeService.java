package com.datvexe.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.datvexe.converter.LichTrinhConverter;
import com.datvexe.converter.TuyenXeConverter;
import com.datvexe.dto.TuyenXeDTO;
import com.datvexe.entity.LichTrinh;
import com.datvexe.entity.TuyenXe;
import com.datvexe.repository.LichTrinhRepository;
import com.datvexe.repository.TuyenXeRepository;
import com.datvexe.service.ITuyenXeService;

// mỗi service chỉ chịu trách nhiệm mỗi 1 nhiệm vụ
@Service
public class TuyenXeService implements ITuyenXeService {

	@Autowired
	private TuyenXeRepository tuyenXeRepository;
	@Autowired
	private TuyenXeConverter tuyenXeConverter;
	
	
	// hàm hiển thị danh sách tuyến xe
	@Override
	public List<TuyenXeDTO> finalAll() {
		// convert data từ DTO sang entity và entity -> DTO
		// chuyển List LichTrinh sang List DTO
		List<TuyenXeDTO> models = new ArrayList<>();
		List<TuyenXe> entity = tuyenXeRepository.findAll();
		for(TuyenXe item: entity)
		{
			TuyenXeDTO tuyenXeDTO =  tuyenXeConverter.toDTO(item);
			models.add(tuyenXeDTO);
		}
		return models;	}
	
	// nơi hiển thị danh sách tuyến xe
	public Map<String, String> finalAllMap() {
		Map<String, String>  result = new HashMap<>();
		List<TuyenXe> entity = tuyenXeRepository.findAll();
		for (TuyenXe item : entity) {
			result.put(item.getTenTuyenXe(), item.getTenTuyenXe());
//			result.put(key, value)
		}	
		return result;
	}
	public List<TuyenXeDTO> finaAll(Pageable pageable) {

		List<TuyenXeDTO> models = new ArrayList<>();
		List<TuyenXe> entity = tuyenXeRepository.findAll(pageable).getContent();
		for (TuyenXe item : entity) {
			TuyenXeDTO tuyenXeDTO = new TuyenXeDTO();
		//	tuyenXeDTO.setTenTuyen(item.getTenTuyen());
			models.add(tuyenXeDTO);
		}
		return models;
	}

	// nơi lấy tổng iItem
	@Override
	public int getTotalItem() {
		return (int) tuyenXeRepository.count();
	}

	@Override
	public TuyenXeDTO findById(Long id) {
		TuyenXe entity = tuyenXeRepository.findOne(id);
		return tuyenXeConverter.toDTO(entity);
	}

	@Override
	public TuyenXeDTO save(TuyenXeDTO dto) {
		TuyenXe tuyenXeEntity = new TuyenXe();
		if (dto.getTuyenXeId() != null){
			TuyenXe tuyenXe = tuyenXeRepository.findOne(dto.getTuyenXeId());
			tuyenXeEntity = new TuyenXeConverter().toEntity(tuyenXe, dto);
		} else {
			tuyenXeEntity = new TuyenXeConverter().toEntity(dto);
		}
		return tuyenXeConverter.toDTO(tuyenXeRepository.save(tuyenXeEntity));
	}

	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub
		
	}


//	public List<TuyenXeModel> finalAll1()
//	{	
//		List<TuyenXeModel> models = new ArrayList<>();
//		List<TuyenXe> entity = newRepository.findAll();
//		for(TuyenXe item: entity)
//		{
//			TuyenXeModel tuyenXeModel =  new TuyenXeModel();
//			tuyenXeModel.setTuyenXeID(item.getId());
//			tuyenXeModel.setTenTuyen(item.getTenTuyen());
//			tuyenXeModel.setDiemDen(item.getDiemDen());
//			tuyenXeModel.setDiemDi(item.getDiemDi());
//			models.add(tuyenXeModel);
//		}
//		return models;
//	}
}
