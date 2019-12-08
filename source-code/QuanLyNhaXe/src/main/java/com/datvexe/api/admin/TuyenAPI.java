package com.datvexe.api.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.datvexe.dto.TuyenXeDTO;
import com.datvexe.service.ITuyenXeService;

@RestController(value = "tuyenAPIOfAdmin")
public class TuyenAPI {
	
	@Autowired
	private ITuyenXeService tuyenXeService;

	@PostMapping("/api/tuyenXe")
	public ResponseEntity<TuyenXeDTO> createNew(@RequestBody TuyenXeDTO them) {
		if(tuyenXeService.CheckDATA(them) == false) {	
			return new ResponseEntity<>( HttpStatus.FORBIDDEN);
		}
		if(tuyenXeService.CheckNull(them) == false)
			return new ResponseEntity<>(HttpStatus.LOCKED);
		TuyenXeDTO dto = tuyenXeService.save(them);
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}

	@PutMapping("/api/tuyenXe")
	public TuyenXeDTO updateNew(@RequestBody TuyenXeDTO update) {
		return tuyenXeService.save(update);
	}

	@DeleteMapping("/api/tuyenXe")
	public void deleteNew(@RequestBody long[] ids) {
		tuyenXeService.delete(ids);
	}
}
