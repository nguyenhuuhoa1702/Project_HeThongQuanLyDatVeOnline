package com.datvexe.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.datvexe.entity.LichTrinh;
import com.datvexe.entity.Xe;

public interface LichTrinhRepository extends JpaRepository<LichTrinh, Long> {
	@Query("select u from LichTrinh u where u.BienSoXe = ?1")
	LichTrinh BienSoXe(Xe biensoxe);
	
	@Query("select u from LichTrinh u where u.BienSoXe = ?1 and u.ngayDi = ?2")
	LichTrinh BienSoXe2(Xe biensoxe,Date ngayDi);
	
	@Query("select u from LichTrinh u where u.BienSoXe = ?1 and u.ngayDi = ?2 and u.idLichTrinh <> ?3")
	LichTrinh  BienSoXe3(Xe biensoxe,Date ngayDi,Long idLichTrinh);
	
	@Query("select u from LichTrinh u where u.trangThai = ?1")
	List<LichTrinh>  finallActive(int active);
	
	@Modifying	
	@Query("update LichTrinh u set u.trangThai = ?1 where u.idLichTrinh=?2")
	void  deleteActive(int active,Long idLichTrinh);
	
//	@Query("select u from LichTrinh u where u.BienSoXe = ?1")
//	LichTrinh findByBienSoXe(Xe biensoxe);

//	List<LichTrinh> findByNgayDi(Date ngayDi);
//	 @Query("select u from LichTrinh u where u.DiemDi =?1 and u.DiemDen =?2 and u.ngayDi=?3")
//	 List<LichTrinh> queryTimKiem(String diemdi,String diemden,Date ngay);

	List<LichTrinh> findByDiemDiAndDiemDenAndNgayDiAndTrangThai(String DiemDi, String DiemDen, Date ngayDi, int trangThai);
	
	@Query("select u from LichTrinh u where u.idLichTrinh = ?1")
	LichTrinh findAllById(Long idLichTrinh);
}
