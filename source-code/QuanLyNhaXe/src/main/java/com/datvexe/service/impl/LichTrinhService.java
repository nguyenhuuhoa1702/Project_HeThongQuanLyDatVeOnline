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
import com.datvexe.entity.Xe;
import com.datvexe.repository.LichTrinhRepository;
import com.datvexe.repository.TuyenXeRepository;
import com.datvexe.repository.XeRepository;
import com.datvexe.service.ILichTrinhService;

@Service
public class LichTrinhService implements ILichTrinhService {

	@Autowired
	private LichTrinhRepository LichTrinhRepository;
	@Autowired
	private LichTrinhConverter lichTrinhConverter;
	@Autowired
	private XeRepository xeRepository;

	// Nơi lấy danh sách lịch trình chuyến đi
	@Override
	public List<LichTrinhDTO> finalAll() {
		// convert data từ DTO sang entity và entity -> DTO
		// chuyển List LichTrinh sang List DTO
		List<LichTrinhDTO> models = new ArrayList<>();
		List<LichTrinh> entity = LichTrinhRepository.findAll();
		for (LichTrinh item : entity) {
			LichTrinhDTO lichTrinhDTO = lichTrinhConverter.toDTO(item);
			models.add(lichTrinhDTO);
		}
		return models;
	}

	// nơi xử lý lấy id
	@Override
	public LichTrinhDTO findById(long id) {
		LichTrinh entity = LichTrinhRepository.findOne(id);
		return lichTrinhConverter.toDTO(entity);
	}
	
	// Kiểm tra dữ liệu 2 ô điểm đi và điểm đến có bị trùng hay không ?
	@Override
	@Transactional
	public Boolean CheckDataDiemDiVaDiemDen(LichTrinhDTO dto) {
		if(!dto.getDiemDen().equals(dto.getDiemDi()))
		{
			return true;
		}
	return false;
	}
	
	@Override
	public Boolean CheckDataXe(LichTrinhDTO dto)
	{
		Xe biensoxe = xeRepository.findOneByXe(dto.getBienSoXe());
		LichTrinh check = LichTrinhRepository.BienSoXe(biensoxe);
		if(check == null)
			return true;
		return false;
	}
	
	@Override
	@Transactional
	public Boolean CheckNull(LichTrinhDTO dto)
	{
		if(!dto.getDiemDen().equals("") && !dto.getDiemDi().equals("") && !dto.getBienSoXe().equals("null"))		
			return true;
		return false;
	}
	
	@Override
	public Boolean CheckDonGia(LichTrinhDTO dto)
	{
		int check = dto.getDonGia();
		if(check > 1000 && (check%1000 == 0))
			return true;
		return false;
	}
	
	

	@Override
	// Khi thao tác dữ liệu, khai báo @Transactional để quản lý commit và rollback
	@Transactional
	public LichTrinhDTO save(LichTrinhDTO dto) {
		// Hiển thị theo id của tuyến xe
		Xe biensoxe = xeRepository.findOneByXe(dto.getBienSoXe());
		LichTrinh lichTrinhEntity = new LichTrinh();
		if (dto.getIdLichTrinh() != null) {
			// Nếu là cập nhật sẽ lấy cái cũ lên
			LichTrinh oldlichtrinh = LichTrinhRepository.findOne(dto.getIdLichTrinh());
			oldlichtrinh.setBienSoXe(biensoxe);
			// Chuyển cái dữ liệu vừa thêm vào , chuyển sang dữ liệu mới
			lichTrinhEntity = new LichTrinhConverter().toEntity(oldlichtrinh, dto);
		} else {
			// nếu thêm mới hoàn toàn
			lichTrinhEntity = new LichTrinhConverter().toEntity(dto);
			lichTrinhEntity.setBienSoXe(biensoxe);
		}
		return lichTrinhConverter.toDTO(LichTrinhRepository.save(lichTrinhEntity));
	}

	@Override
	@Transactional
	public void delete(long[] ids) {
		for (long id : ids) {
			LichTrinhRepository.delete(id);
		}
	}

	// ---------------------------------------- Xử lý bên web ------------------------------------------------
	
	@Override
	@Transactional
	public List<LichTrinhDTO> DanhSachKetQuaTimKiem(LichTrinhDTO dto) {
		List<LichTrinhDTO> models = new ArrayList<>();
		List<LichTrinh> entity = LichTrinhRepository.findByDiemDiAndDiemDenAndNgayDi(dto.getDiemDi(), dto.getDiemDen(),
				dto.getNgayDi());
		for (LichTrinh item : entity) {
			LichTrinhDTO lichTrinhDTO = lichTrinhConverter.toDTO(item);
			models.add(lichTrinhDTO);
		}
		return models;
	}
}
