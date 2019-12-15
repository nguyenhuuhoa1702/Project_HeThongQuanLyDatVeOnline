package com.datvexe.api.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.datvexe.dto.LichTrinhDTO;
import com.datvexe.service.ILichTrinhService;

@RestController(value = "newAPIOfAdmin")
public class NewAPI {

	@Autowired
	private ILichTrinhService lichTrinh;

	@PostMapping("/api/new")
	public ResponseEntity<LichTrinhDTO> createNew(@RequestBody LichTrinhDTO dto) {
//		System.out.println(dto.getThoiGian());
		if(lichTrinh.CheckNull(dto) == false)
			return new ResponseEntity<>( HttpStatus.BAD_REQUEST);
		if(lichTrinh.CheckDataDiemDiVaDiemDen(dto) == false)
			return new ResponseEntity<>( HttpStatus.FORBIDDEN);
		if(lichTrinh.CheckDataXe(dto) == false)
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		if(lichTrinh.CheckDonGia(dto) == false)
			return new ResponseEntity<>(HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
		if(lichTrinh.CheckThoiGian(dto) == false)
			return new ResponseEntity<>(HttpStatus.ALREADY_REPORTED);
//		System.out.println(dto.getBienSoXe()+"---"+lichTrinh.CheckDataXe(dto).toString());
		LichTrinhDTO ltdto = lichTrinh.save(dto);
		return new ResponseEntity<>(ltdto, HttpStatus.OK);
	}


	@PutMapping("/api/new")
	public ResponseEntity<LichTrinhDTO> updateNew(@RequestBody LichTrinhDTO dto) {
		if(lichTrinh.CheckNull(dto) == false)
			return new ResponseEntity<>( HttpStatus.LOCKED);
		if(lichTrinh.CheckDataDiemDiVaDiemDen(dto) == false)
			return new ResponseEntity<>( HttpStatus.FORBIDDEN);
		if(lichTrinh.CheckDataXe(dto) == false)
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		if(lichTrinh.CheckDonGia(dto) == false)
			return new ResponseEntity<>(HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
//		System.out.println(dto.getBienSoXe()+"---"+lichTrinh.CheckDataXe(dto).toString());
		LichTrinhDTO ltdto = lichTrinh.save(dto);
		return new ResponseEntity<>(ltdto, HttpStatus.OK);
	}

	@DeleteMapping("/api/new")
	public void deleteNew(@RequestBody long[] ids) {
		lichTrinh.delete(ids);
	}
}
