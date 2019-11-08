package com.datvexe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datvexe.entity.NewRouteEntity;
//                                     JpaRepository<tên Entity mà chúng ta làm việc, Khai báo kiểu dữ liệu khóa chính>
public interface NewRepository extends JpaRepository<NewRouteEntity, Long> {
	
}
