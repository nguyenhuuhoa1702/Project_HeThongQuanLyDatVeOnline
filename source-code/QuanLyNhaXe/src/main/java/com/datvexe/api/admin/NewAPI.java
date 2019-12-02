package com.datvexe.api.admin;

import org.springframework.beans.factory.annotation.Autowired;
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
	public LichTrinhDTO createNew(@RequestBody LichTrinhDTO them) {
		return lichTrinh.save(them);
	}

	@PutMapping("/api/new")
	public LichTrinhDTO updateNew(@RequestBody LichTrinhDTO update) {
		return lichTrinh.save(update);
	}

	@DeleteMapping("/api/new")
	public void deleteNew(@RequestBody long[] ids) {
		lichTrinh.delete(ids);
	}
}
