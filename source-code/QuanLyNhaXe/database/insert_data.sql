use mysqldb;

insert into phanquyen(code,tenQuyen) values('ADMIN','Quản trị');
insert into phanquyen(code,tenQuyen) values('USER','Nhân viên');

insert into taikhoan(tenTaiKhoan,matKhau,active)
values('admin','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG',1);
insert into taikhoan(tenTaiKhoan,matKhau,active)
values('nguyenvana','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG',1);
insert into taikhoan(tenTaiKhoan,matKhau,active)
values('nguyenvanb','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG',1);

INSERT INTO user_role(userId,roleId) VALUES (1,1);
INSERT INTO user_role(userId,roleId) VALUES (2,2);
INSERT INTO user_role(userId,roleId) VALUES (3,2);