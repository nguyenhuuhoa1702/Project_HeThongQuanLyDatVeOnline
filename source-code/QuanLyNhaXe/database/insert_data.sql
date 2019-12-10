use mysqldb;

insert into phanquyen(code,tenQuyen) values('ADMIN','Quản trị');
insert into phanquyen(code,tenQuyen) values('USER','Nhân viên');

insert into taikhoan(tenTaiKhoan,matKhau,active)
values('admin','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG',1);
insert into taikhoan(tenTaiKhoan,matKhau,active)
values('nguyenvana','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG',1);
insert into taikhoan(tenTaiKhoan,matKhau,active)
values('nguyenvanb','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEidJRdtzdrMXXwU7dgnLKTCYG',1);

INSERT INTO user_role(userId,roleId) VALUES (1,1);
INSERT INTO user_role(userId,roleId) VALUES (2,2);
INSERT INTO user_role(userId,roleId) VALUES (3,2);

/* Thêm dữ liệu cho bảng Tuyến Xe */ 
INSERT INTO `mysqldb`.`tuyenxe` (`maTuyenXe`, `tenTuyenXe`) VALUES ('Binh Dinh', 'Bình Định');
INSERT INTO `mysqldb`.`tuyenxe` (`maTuyenXe`, `tenTuyenXe`) VALUES ('Quy Nhon', 'Quy Nhơn');
INSERT INTO `mysqldb`.`tuyenxe` (`maTuyenXe`, `tenTuyenXe`) VALUES ('Nha Trang', 'Nha Trang');
INSERT INTO `mysqldb`.`tuyenxe` (`maTuyenXe`, `tenTuyenXe`) VALUES ('Phu Yen', 'Phú Yên');

INSERT INTO `mysqldb`.`nhansu` (`idNhanSu`, `HoTen`, `Email`, `NamSinh`, `SoDienThoai`, `idTenTaiKhoan`) VALUES ('1', 'Nguyễn Nhân Tài', 'nguyennhantai@gmail.com', '1986', '0964140530', '2');
INSERT INTO `mysqldb`.`nhansu` (`idNhanSu`, `HoTen`, `Email`, `NamSinh`, `SoDienThoai`, `idTenTaiKhoan`) VALUES ('2', 'Nguyễn Tài Nhân', 'nguyentainhan@gmail.com', '1988', '0964140530', '2');

INSERT INTO `mysqldb`.`xe` (`BienSoXe`, `TongGhe`, `idNhanSu`) VALUES ('77H-K55948', '20', '1');
INSERT INTO `mysqldb`.`xe` (`BienSoXe`, `TongGhe`, `idNhanSu`) VALUES ('78H-F42345', '30', '2');

INSERT INTO `mysqldb`.`lichtrinh` (`DiemDen`, `DiemDi`, `DonVe`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`) VALUES ('Nha Trang', 'Bình Định', '99000', '2019-12-07', '08:50:00', '12:50:00', '77H-K55948');
INSERT INTO `mysqldb`.`lichtrinh` (`DiemDen`, `DiemDi`, `DonVe`, `ngayDi`, `thoiGianDi`, `thoiGianDen`, `BienSoXe`) VALUES ('Nha Trang', 'Bình Định', '99000', '2019-12-07', '15:50:00', '18:50:00', '78H-F42345');

INSERT INTO `mysqldb`.`vitridontra` (`diaChi`, `tenTuyenXe`) VALUES ('Ngã tư tử thần', 'Bình Định');
INSERT INTO `mysqldb`.`vitridontra` (`diaChi`, `tenTuyenXe`) VALUES ('Ngã sáu vui vẻ', 'Nha Trang');
INSERT INTO `mysqldb`.`vitridontra` (`diaChi`, `tenTuyenXe`) VALUES ('Vui Vẻ không quậu', 'Bình Định');
INSERT INTO `mysqldb`.`vitridontra` (`diaChi`, `tenTuyenXe`) VALUES ('Ngã ba thiên nhiên', 'Nha Trang');

    
/* INSERT INTO `mysqldb`.`lichtrinh` (`ngayDi`,`thoiGian`, `tuyenXeId`) VALUES ('2019-11-02',  '11:59:59', '1'); */
