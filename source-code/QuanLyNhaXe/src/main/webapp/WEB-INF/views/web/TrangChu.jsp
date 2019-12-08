<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
					<form:form action="tim-kiem" method="GET" modelAttribute="model" class="request-form ftco-animate"
						style="margin-top: 100px; box-sizing: border-box;">
						<div class="row">
							<div class="col-lg align-items-end">
								<div class="form-group">
									<div class="form-group">
										<label for="tuyenXeId">Chọn nơi đi</label>
										<div class="form-field">
										<form:select path="diemDi" id="diemdi">
											<form:option value="null" label="Chọn nơi đi" />
											<form:options items="${tuyenXe}" />
										</form:select>
										</div>
									</div>
								</div>
							</div>
							<div class="col-lg align-items-end">
								<div class="form-group">
									<div class="form-group">
										<label for="tuyenXeId">Chọn nơi đến</label>
										<div class="form-field">
										<form:select path="diemDen" id="diemDen">
											<form:option value="null" label="Chọn nơi đến" />
											<form:options items="${tuyenXe}" />
										</form:select>
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
												<form:input path="ngayDi" value="12/11/2019" type="date" />
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-lg align-self-end">
								<div class="form-group">
									<div class="form-field">
<!-- 										<input type="submit" value="Search" -->
<!-- 											class="form-control btn btn-primary"> -->
										<Button class="form-control btn btn-primary" type="submit"> 
												TÌM VÉ XE
										</Button>
									</div>
								</div>
							</div>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>

</html>