package com.datvexe.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datvexe.entity.LichTrinh;
import com.datvexe.entity.Xe;

public interface LichTrinhRepository extends JpaRepository<LichTrinh, Long> {
	 @Query("select u from LichTrinh u where u.BienSoXe = ?1")
	 LichTrinh BienSoXe(Xe biensoxe);
//	 @Query("select u from LichTrinh u where u.DiemDi =?1 and u.DiemDen =?2 and u.ngayDi=?3")
//	 List<LichTrinh> queryTimKiem(String diemdi,String diemden,Date ngay);
	 
	 List<LichTrinh> findByDiemDiAndDiemDenAndNgayDi(String DiemDi,String DiemDen,Date ngayDi);
}
