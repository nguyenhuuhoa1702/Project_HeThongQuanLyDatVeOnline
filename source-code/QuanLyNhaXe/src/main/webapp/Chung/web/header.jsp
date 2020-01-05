<%@ page import="com.datvexe.util.SecurityUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<nav
	class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light"
	id="ftco-navbar">
	<div class="container">
		<a class="navbar-brand" href="../QuanLyNhaXe/trang-chu">DAT VE XE <span>ONLINE</span></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#ftco-nav" aria-controls="ftco-nav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="oi oi-menu"></span> Menu
		</button>

		<div class="collapse navbar-collapse" id="ftco-nav">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a href="../QuanLyNhaXe/trang-chu"
					class="nav-link">Trang chủ </a></li>
				<li class="nav-item"><a href="" class="nav-link">Vé Ngày Tết</a></li>
				<li class="nav-item"><a href="../QuanLyNhaXe/xem-chi-tiet-ve" class="nav-link">Quản lý vé</a></li>
				<li class="nav-item"><a href="#" class="nav-link">Blog</a></li>
				<li class="nav-item"><a href="#" class="nav-link">Liên Hệ </a></li>
				<security:authorize access = "isAnonymous()">
						<li class="nav-item"><a class="nav-link" href="<c:url value='/dang-nhap'/>">Đăng nhập</a></li>
				</security:authorize>
				<!-- Sau khi đăng nhập thành công thì hiển thị nút thoát và Wecome -->
				<security:authorize access = "isAuthenticated()">
<%-- 					<li class="nav-item"><a class="nav-link" href="#">Wellcome <%=SecurityUtil.getPrincipal().getTenTaiKhoan()%></a></li> --%>
					<li class="nav-item"><a class="nav-link" href="<c:url value='/thoat'/>">Đăng xuất</a></li>
				</security:authorize>
				<security:authorize access = "isAuthenticated()">
				<li class="nav-item">
					<div class="dropdown">
						  <a class="nav-link" style="color: white;margin-top: 5px">Quản lý vé</a>
						  <div class="dropdown-content">
						  		<a href="#">Danh sách đặt vé</a>
						  	<a href="#">Danh sách hủy vé</a>
						  <a href="#">Danh sách đổi vé</a>
					  </div>
					</div>
				</li>
				</security:authorize>
			</ul>
		</div>
	</div>
</nav> 