package com.datvexe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datvexe.entity.TuyenXe;
//                                     JpaRepository<tên Entity mà chúng ta làm việc, Khai báo kiểu dữ liệu khóa chính>
public interface TuyenXeRepository extends JpaRepository<TuyenXe, Long> {
	TuyenXe findOneByTuyenXeId(Long id);
}
