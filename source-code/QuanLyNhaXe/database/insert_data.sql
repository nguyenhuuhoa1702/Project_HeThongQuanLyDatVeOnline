use mysqldb;

/*phân quyền*/
insert into phanquyen(code,tenQuyen) values('ADMIN','Quản trị');
insert into phanquyen(code,tenQuyen) values('USER','Nhân viên');

/*tài khoản*/
insert into taikhoan(tenTaiKhoan,matKhau,active)
values('admin','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG',1);
insert into taikhoan(tenTaiKhoan,matKhau,active)
values('lamthanhduy','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG',1);
insert into taikhoan(tenTaiKhoan,matKhau,active)
values('nguyenhuuhoa','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEidJRdtzdrMXXwU7dgnLKTCYG',1);

/*user role*/
INSERT INTO user_role(userId,roleId) VALUES (1,1);
INSERT INTO user_role(userId,roleId) VALUES (2,2);
INSERT INTO user_role(userId,roleId) VALUES (3,2);


/*tuyến xe*/
INSERT INTO `mysqldb`.`tuyenxe` (`tuyenXeId`, `maTuyenXe`, `tenTuyenXe`) VALUES ('1', 'Binh Dinh', 'Bình Định');
INSERT INTO `mysqldb`.`tuyenxe` (`tuyenXeId`, `maTuyenXe`, `tenTuyenXe`) VALUES ('2', 'HCM', 'HCM');
INSERT INTO `mysqldb`.`tuyenxe` (`tuyenXeId`, `maTuyenXe`, `tenTuyenXe`) VALUES ('3', 'Nha Trang', 'Nha Trang');
INSERT INTO `mysqldb`.`tuyenxe` (`tuyenXeId`, `maTuyenXe`, `tenTuyenXe`) VALUES ('4', 'Phu Yen', 'Phú Yên');
UPDATE `mysqldb`.`tuyenxe` SET `Status` = '1' WHERE (`tuyenXeId` = '1');
UPDATE `mysqldb`.`tuyenxe` SET `Status` = '1' WHERE (`tuyenXeId` = '2');
UPDATE `mysqldb`.`tuyenxe` SET `Status` = '1' WHERE (`tuyenXeId` = '3');
UPDATE `mysqldb`.`tuyenxe` SET `Status` = '1' WHERE (`tuyenXeId` = '4');

/*nhân sự*/
INSERT INTO `mysqldb`.`nhansu` (`idNhanSu`, `HoTen`, `Email`, `NamSinh`, `SoDienThoai`, `idTenTaiKhoan`) VALUES ('1', 'Nguyễn Nhân Tài', 'nguyennhantai@gmail.com', '1986', '964140530', '2');
INSERT INTO `mysqldb`.`nhansu` (`idNhanSu`, `HoTen`, `Email`, `NamSinh`, `SoDienThoai`, `idTenTaiKhoan`) VALUES ('2', 'Nguyễn Tài Nhân', 'nguyentainhan@gmail.com', '1988', '964140530', '2');

/*Xe*/
INSERT INTO `mysqldb`.`xe` (`BienSoXe`, `TongGhe`, `idNhanSu`) VALUES ('77H-K55948', '20', '1');
INSERT INTO `mysqldb`.`xe` (`BienSoXe`, `TongGhe`, `idNhanSu`) VALUES ('78H-F42345', '30', '2');
INSERT INTO `mysqldb`.`xe` (`BienSoXe`, `TongGhe`, `idNhanSu`) VALUES ('79H-K55948', '25', '1');

/*Lịch Trình*/
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`,`Status`) VALUES ('1', 'Nha Trang', 'Bình Định', '99000', '20', '2019-12-15', '08:50:00', '12:50:00', '77H-K55948','1');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`,`Status`) VALUES ('2', 'Nha Trang', 'Bình Định', '99000', '30', '2019-12-15', '15:50:00', '18:50:00', '78H-F42345','1');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`,`Status`) VALUES ('3', 'Bình Định ', 'Phú Yên ', '99000', '25', '2019-12-15', '08:50:00', '12:50:00', '79H-K55948','1');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`,`Status`) VALUES ('4', 'Nha Trang', 'Bình Định', '99000', '20', '2019-12-16', '08:50:00', '12:50:00', '77H-K55948','1');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`,`Status`) VALUES ('5', 'Nha Trang', 'Bình Định', '99000', '30', '2019-12-16', '15:50:00', '18:50:00', '78H-F42345','1');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`,`Status`) VALUES ('6', 'Bình Định ', 'Phú Yên ', '99000', '25', '2019-12-16', '08:50:00', '12:50:00', '79H-K55948','1');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`,`Status`) VALUES ('7', 'Nha Trang', 'Bình Định', '99000', '20', '2019-12-17', '08:50:00', '12:50:00', '77H-K55948','1');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`,`Status`) VALUES ('8', 'Nha Trang', 'Bình Định', '99000', '30', '2019-12-17', '15:50:00', '18:50:00', '78H-F42345','1');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`,`Status`) VALUES ('9', 'Bình Định ', 'Phú Yên ', '99000', '25', '2019-12-17', '08:50:00', '12:50:00', '79H-K55948','1');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`,`Status`) VALUES ('10', 'Nha Trang', 'Bình Định', '99000', '20', '2019-12-18', '08:50:00', '12:50:00', '77H-K55948','1');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`,`Status`) VALUES ('11', 'Nha Trang', 'Bình Định', '99000', '30', '2019-12-18', '15:50:00', '18:50:00', '78H-F42345','1');
INSERT INTO `mysqldb`.`lichtrinh` (`idLichTrinh`, `DiemDen`, `DiemDi`, `DonVe`, `gheTrong`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`,`Status`) VALUES ('12', 'Bình Định ', 'Phú Yên ', '99000', '25', '2019-12-18', '08:50:00', '12:50:00', '79H-K55948','1');
UPDATE `mysqldb`.`lichtrinh` SET `ngayDi` = '2020-01-12' WHERE (`idLichTrinh` = '1');
UPDATE `mysqldb`.`lichtrinh` SET `ngayDi` = '2020-01-12' WHERE (`idLichTrinh` = '2');
UPDATE `mysqldb`.`lichtrinh` SET `ngayDi` = '2020-01-16' WHERE (`idLichTrinh` = '3');
UPDATE `mysqldb`.`lichtrinh` SET `ngayDi` = '2020-01-16' WHERE (`idLichTrinh` = '4');



/*vị trí đón tra*/
INSERT INTO `mysqldb`.`vitridontra` (`diaChi`, `tenTuyenXe`) VALUES ('Ngã ba phú quý', 'Bình Định');
INSERT INTO `mysqldb`.`vitridontra` (`diaChi`, `tenTuyenXe`) VALUES ('Bến xe Nha Trang', 'Nha Trang');
INSERT INTO `mysqldb`.`vitridontra` (`diaChi`, `tenTuyenXe`) VALUES ('Ngã ba gần ngã tư', 'Bình Định');
INSERT INTO `mysqldb`.`vitridontra` (`diaChi`, `tenTuyenXe`) VALUES ('Ven đường đẩy cỏ', 'Nha Trang');









    
/* INSERT INTO `mysqldb`.`lichtrinh` (`ngayDi`,`thoiGian`, `tuyenXeId`) VALUES ('2019-11-02',  '11:59:59', '1'); */
