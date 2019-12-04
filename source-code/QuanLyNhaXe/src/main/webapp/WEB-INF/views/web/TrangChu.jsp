<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/Chung/taglib.jsp"%>
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">
<title>Trang chủ</title>

</head>

<body>
	<div class="hero-wrap"
		style="background-image: url('template/web/images/bg_1.jpg');"
		data-stellar-background-ratio="0.5">
		<div class="overlay"></div>
		<div class="container">
			<div class="">
				<div class="">
					<br> <br>
					<form action="#" class="request-form ftco-animate"
						style="margin-top: 100px; box-sizing: border-box;">
						<div class="row">
							<div class="col-lg align-items-end">
								<div class="form-group">
									<label for="#">Nhập nơi đi</label>
									<div class="form-field">
										<div class="select-wrap">
											<div class="icon" >
												<span class="ion-ios-arrow-down"></span>
											</div>
											<select name="Noi Di" id="NoiDi" class="form-control">
												<option value="">Nơi đi</option>
												<option value="">TP HCM</option>
												<option value="">Đà Lạt</option>
												<option value="">Nha Trang</option>
												<option value="">Tuy Hòa</option>
												<option value="">Quy Nhơn</option>
											</select>
										</div>
									</div>
								</div>
							</div>
							<div class="col-lg align-items-end">
								<div class="form-group">
									<label for="#">Nhập nơi đến</label>
									<div class="form-field">
										<div class="select-wrap">
											<div class="icon">
												<span class="ion-ios-arrow-down"></span>
											</div>
											<select name="Noi Den" id="NoiDen" class="form-control">
												<option value="">Nơi đến</option>
												<option value="">TP HCM</option>
												<option value="">Đà Lạt</option>
												<option value="">Nha Trang</option>
												<option value="">Tuy Hòa</option>
												<option value="">Quy Nhơn</option>
											</select>
										</div>
									</div>
								</div>
							</div>
							<div class="col-lg align-items-end">
								<div class="form-group">
									<label for="#">Chọn ngày đi</label>
									<div class="form-field">
										<div class="select-wrap">
											<div class="md-form">
												<input  type="date" value="${date}"/>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-lg align-items-end">
								<div class="form-group">
									<label for="#">Số người</label>
									<div class="form-field">
										<div class="text">
											<input name="So Nguoi" id="SoNguoi" class="form-control">
											</input>
										</div>
									</div>
								</div>
							</div>
							<div class="col-lg align-self-end">
								<div class="form-group">
									<div class="form-field">
										<input type="submit" value="Search"
											class="form-control btn btn-primary">
									</div>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>

</html>