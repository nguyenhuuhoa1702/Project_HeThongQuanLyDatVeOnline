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
 
 INSERT INTO `mysqldb`.`tuyenxe` (`tuyenXeId`, `tenTuyenXe`) VALUES ('1', 'Bình Định - Nha Trang');
INSERT INTO `mysqldb`.`tuyenxe` (`tuyenXeId`, `tenTuyenXe`) VALUES ('2', 'Sài Gò - Hải Phòng');
INSERT INTO `mysqldb`.`tuyenxe` (`tuyenXeId`, `tenTuyenXe`) VALUES ('3', 'Nha Trang - Hà Nội');
INSERT INTO `mysqldb`.`tuyenxe` (`tuyenXeId`, `tenTuyenXe`) VALUES ('4', 'Quy Nhơn - Quãng Ngãi');
    
INSERT INTO `mysqldb`.`lichtrinh` (`ngayDi`,`thoiGian`, `tuyenXeId`) VALUES ('2019-11-02',  '11:59:59', '1');
INSERT INTO `mysqldb`.`lichtrinh` (`ngayDi`, `thoiGian`, `tuyenXeId`) VALUES ('2019-11-02', '12:59:59', '2');
INSERT INTO `mysqldb`.`lichtrinh` (`ngayDi`,`thoiGian`, `tuyenXeId`) VALUES ('2019-02-02', '13:59:59', '3');
INSERT INTO `mysqldb`.`lichtrinh` (`ngayDi`,`thoiGian`, `tuyenXeId`) VALUES ('2019-02-02',  '14:59:59', '4');



phanquyen