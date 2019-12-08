package com.datvexe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datvexe.entity.TuyenXe;
//                                     JpaRepository<tên Entity mà chúng ta làm việc, Khai báo kiểu dữ liệu khóa chính>
public interface TuyenXeRepository extends JpaRepository<TuyenXe, Long> {
	TuyenXe findOneByTuyenXeId(Long id);
	TuyenXe findOneByTenTuyenXeOrMaTuyenXe(String tenTuyenXe,String maTuyenXe);
	
//	 @Query("select u from TuyenXe u where u.TenTuyenXe = ?1")
//	 TuyenXe findOneByTenTuyenXe(String TenTuyenXe);
	 
}
