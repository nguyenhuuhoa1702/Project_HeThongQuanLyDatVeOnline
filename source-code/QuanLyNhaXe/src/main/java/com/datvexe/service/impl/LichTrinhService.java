package com.datvexe.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.datvexe.converter.LichTrinhConverter;
import com.datvexe.dto.LichTrinhDTO;
import com.datvexe.entity.LichTrinh;
import com.datvexe.entity.TuyenXe;
import com.datvexe.repository.LichTrinhRepository;
import com.datvexe.repository.TuyenXeRepository;
import com.datvexe.service.ILichTrinhService;

@Service
public class LichTrinhService implements ILichTrinhService {
	
	@Autowired
	private LichTrinhRepository LichTrinhRepository;
	@Autowired
	private LichTrinhConverter lichTrinhConverter;
	@Autowired
	private TuyenXeRepository tuyenXeRepository;
	
	// Nơi lấy danh sách lịch trình chuyến đi
	@Override
	public List<LichTrinhDTO> finalAll() {
		// convert data từ DTO sang entity và entity -> DTO
		// chuyển List LichTrinh sang List DTO
		List<LichTrinhDTO> models = new ArrayList<>();
		List<LichTrinh> entity = LichTrinhRepository.findAll();
		for(LichTrinh item: entity)
		{
			LichTrinhDTO lichTrinhDTO =  lichTrinhConverter.toDTO(item);
			models.add(lichTrinhDTO);
		}
		return models;	}

	// nơi xử lý lấy id
	@Override
	public LichTrinhDTO findById(long id) {
		LichTrinh entity  = LichTrinhRepository.findOne(id); 
		return lichTrinhConverter.toDTO(entity);
	}
	

	@Override
	// Khi thao tác dữ liệu, khai báo @Transactional  để quản lý commit và rollback
	@Transactional
	public LichTrinhDTO save(LichTrinhDTO dto) {
		// Hiển thị theo id của tuyến xe
		TuyenXe tuyenXe = tuyenXeRepository.findOneByTuyenXeId(dto.getTuyenXeId());
		LichTrinh lichTrinhEntity = new LichTrinh();
		if(dto.getId() != null)
		{
			// Nếu là cập nhật sẽ lấy cái cũ lên
			LichTrinh oldlichtrinh = LichTrinhRepository.findOne(dto.getId());
			// lấy dữ liệu thêm vào cái cũ 
			oldlichtrinh.setTuyenxe(tuyenXe);
			// Chuyển cái dữ liệu vừa thêm vào , chuyển sang dữ liệu mới
			lichTrinhEntity = new LichTrinhConverter().toEntity(oldlichtrinh,dto);
		}
		else
		{
			// nếu thêm mới hoàn toàn
			lichTrinhEntity = new LichTrinhConverter().toEntity(dto);
			// chỉ cần set tuyến xe vào là xong
			lichTrinhEntity.setTuyenxe(tuyenXe);
		}
		return lichTrinhConverter.toDTO(LichTrinhRepository.save(lichTrinhEntity));
	}
}
