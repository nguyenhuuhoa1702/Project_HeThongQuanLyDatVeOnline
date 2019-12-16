use mysqldb;

/* DUY Them*/ 

/*phân quyền*/
insert into phanquyen(code,tenQuyen) values('ADMIN','Quản trị');
insert into phanquyen(code,tenQuyen) values('USER','Nhân viên');

/*tài khoản*/
insert into taikhoan(tenTaiKhoan,matKhau,active)
values('admin','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG',1);
insert into taikhoan(tenTaiKhoan,matKhau,active)
values('nguyenvana','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG',1);
insert into taikhoan(tenTaiKhoan,matKhau,active)
values('nguyenvanb','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEidJRdtzdrMXXwU7dgnLKTCYG',1);

/*user role*/
INSERT INTO user_role(userId,roleId) VALUES (1,1);
INSERT INTO user_role(userId,roleId) VALUES (2,2);
INSERT INTO user_role(userId,roleId) VALUES (3,2);

/* Khach hang */
INSERT INTO `mysqldb`.`khachhang` (`Email`, `SoDienThoai`, `TenKhachHang`, `TinhTrangVe`) VALUES ('lamthanhduy1998@gmail,com', '0332969954', 'Duy', 'Đã thanh toán');
INSERT INTO `mysqldb`.`khachhang` (`Email`, `SoDienThoai`, `TenKhachHang`, `TinhTrangVe`) VALUES ('anhasd@gmail.com', '0312894312', 'Hoa', 'Đã thanh toán');
INSERT INTO `mysqldb`.`khachhang` (`Email`, `SoDienThoai`, `TenKhachHang`, `TinhTrangVe`) VALUES ('ChiThanh@gmail.com', '0124823943', 'Thanh', 'Đã thanh toán');

/*tuyến xe*/
INSERT INTO `mysqldb`.`tuyenxe` (`tuyenXeId`, `maTuyenXe`, `tenTuyenXe`) VALUES ('1', 'Binh Dinh', 'Bình Định');
INSERT INTO `mysqldb`.`tuyenxe` (`tuyenXeId`, `maTuyenXe`, `tenTuyenXe`) VALUES ('2', 'HCM', 'HCM');
INSERT INTO `mysqldb`.`tuyenxe` (`tuyenXeId`, `maTuyenXe`, `tenTuyenXe`) VALUES ('3', 'Nha Trang', 'Nha Trang');
INSERT INTO `mysqldb`.`tuyenxe` (`tuyenXeId`, `maTuyenXe`, `tenTuyenXe`) VALUES ('4', 'Phu Yen', 'Phú Yên');

/*nhân sự*/
INSERT INTO `mysqldb`.`nhansu` (`idNhanSu`, `HoTen`, `Email`, `NamSinh`, `SoDienThoai`, `idTenTaiKhoan`) VALUES ('1', 'Nguyễn Nhân Tài', 'nguyennhantai@gmail.com', '1986', '964140530', '2');
INSERT INTO `mysqldb`.`nhansu` (`idNhanSu`, `HoTen`, `Email`, `NamSinh`, `SoDienThoai`, `idTenTaiKhoan`) VALUES ('2', 'Nguyễn Tài Nhân', 'nguyentainhan@gmail.com', '1988', '964140530', '2');

/*Xe*/
INSERT INTO `mysqldb`.`xe` (`BienSoXe`, `TongGhe`, `idNhanSu`) VALUES ('77H-K55948', '20', '1');
INSERT INTO `mysqldb`.`xe` (`BienSoXe`, `TongGhe`, `idNhanSu`) VALUES ('78H-F42345', '30', '2');
INSERT INTO `mysqldb`.`xe` (`BienSoXe`, `TongGhe`, `idNhanSu`) VALUES ('79H-K55948', '25', '1');

/*Lịch Trình*/
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`) VALUES ('1', 'Nha Trang', 'Bình Định', '99000', '21', '2019-12-15', '08:50:00', '12:50:00', '77H-K55948');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`) VALUES ('2', 'Nha Trang', 'Bình Định', '99000', '25', '2019-12-15', '15:50:00', '18:50:00', '78H-F42345');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`) VALUES ('3', 'Bình Định ', 'Phú Yên ', '99000', '25', '2019-12-15', '08:50:00', '12:50:00', '79H-K55948');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`) VALUES ('4', 'Nha Trang', 'Bình Định', '99000', '21', '2019-12-16', '08:50:00', '12:50:00', '77H-K55948');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`) VALUES ('5', 'Nha Trang', 'Bình Định', '99000', '25', '2019-12-16', '15:50:00', '18:50:00', '78H-F42345');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`) VALUES ('6', 'Bình Định ', 'Phú Yên ', '99000', '25', '2019-12-16', '08:50:00', '12:50:00', '79H-K55948');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`) VALUES ('7', 'Nha Trang', 'Bình Định', '99000', '21', '2019-12-17', '08:50:00', '12:50:00', '77H-K55948');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`) VALUES ('8', 'Nha Trang', 'Bình Định', '99000', '25', '2019-12-17', '15:50:00', '18:50:00', '78H-F42345');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`) VALUES ('9', 'Bình Định ', 'Phú Yên ', '99000', '25', '2019-12-17', '08:50:00', '12:50:00', '79H-K55948');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`) VALUES ('10', 'Nha Trang', 'Bình Định', '99000', '21', '2019-12-18', '08:50:00', '12:50:00', '77H-K55948');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`) VALUES ('11', 'Nha Trang', 'Bình Định', '99000', '25', '2019-12-18', '15:50:00', '18:50:00', '78H-F42345');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`) VALUES ('12', 'Bình Định ', 'Phú Yên ', '99000', '25', '2019-12-18', '08:50:00', '12:50:00', '79H-K55948');



/*ve*/
INSERT INTO `mysqldb`.`ve` (`idVe`, `NgayDatVe`, `NoiDon`, `NoiTra`, `SoVeDat`, `idLichTrinh`) VALUES ('1', '2019-12-15', 'Ben xe Quy Nhon', 'Ben xe Nha Trang', '3', '1');
INSERT INTO `mysqldb`.`ve` (`idVe`, `NgayDatVe`, `NoiDon`, `NoiTra`, `SoVeDat`, `idLichTrinh`) VALUES ('2', '2019-12-17', 'Nga ba Dieu Tri', 'Nga tu Cay Da', '5', '2');

/*vị trí đón tra*/
INSERT INTO `mysqldb`.`vitridontra` (`diaChi`, `tenTuyenXe`) VALUES ('Ben xe Quy Nhon', 'Bình Định');
INSERT INTO `mysqldb`.`vitridontra` (`diaChi`, `tenTuyenXe`) VALUES ('Ben xe Nha Trang', 'Nha Trang');
INSERT INTO `mysqldb`.`vitridontra` (`diaChi`, `tenTuyenXe`) VALUES ('Nga ba Dieu Tri', 'Bình Định');
INSERT INTO `mysqldb`.`vitridontra` (`diaChi`, `tenTuyenXe`) VALUES ('Nga tu Cay Da', 'Nha Trang');

/*vị trí ghế ngồi*/
INSERT INTO `mysqldb`.`vitrighengoi` (`idGheNgoi`, `viTriGheNgoi`, `idVe`) VALUES ('1', 'A1', '1');
INSERT INTO `mysqldb`.`vitrighengoi` (`idGheNgoi`, `viTriGheNgoi`, `idVe`) VALUES ('2', 'B2', '2');








    
/* INSERT INTO `mysqldb`.`lichtrinh` (`ngayDi`,`thoiGian`, `tuyenXeId`) VALUES ('2019-11-02',  '11:59:59', '1'); */
