<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/Chung/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Xem lich trinh</title>
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
					<form:form action="book" method="GET" modelAttribute="model"
						class="request-form ftco-animate"
						style="margin-top: 100px; box-sizing: border-box;">
						<div class="row">
							<div class="col-lg align-items-end">
								<div class="form-group">
									<div>
										<table style="width: 100%">
											<tr>
												<td colspan="3"><div>Thông tin chuyến đi</div></td>
												<td><div>Thông tin khách hàng</div></td>
											</tr>
											<tr>
												<td>
													<div>Điểm đi</div>
													<div>Quy Nhơn</div>
												</td>
												<td>
													<div>Điểm đến</div>
													<div>Nha Trang</div>
												</td>

												<td>
													<div>Đơn giá vé</div>
													<div>17-02-2019</div>
												</td>
												<td rowspan="2">
													<div>
														<label>Họ tên khách hàng *</label>
													</div>
													<div>
														<input type="text">
													</div>
													<div>
														<label>Số điện thoại *</label>
													</div>
													<div>
														<input type="text">
													</div>

												</td>
											<tr>
											<tr>
												<td><label>Chọn nơi đón</label> <form:select
														path="bienSoXe" id="xe" style="width:100%">
														<form:option value="null" label="Chọn nơi đón" />
														<form:options items="${noiDon}" />
													</form:select></td>
												<td><label>Chọn nơi trả</label> <form:select
														path="bienSoXe" id="xe" style="width:100%">
														<form:option value="null" label="Chọn nơi đón" />
														<form:options items="${noiTra}" />
													</form:select></td>
												<td>
													<div>Chọn số vé cần đặt</div>
													<div>
														<input type="text">
													</div>
												</td>
												<td>
													<div>
														<label>Email</label>
													</div>
													<div>
														<input type="text">
													</div>
												</td>


											</tr>
											<tr>
												<td colspan="3">
													<div>Nội dung ghi chú</div>
												</td>
												<td>
													<button>ĐẶT VÉ</button>
												<td>
											</tr>

										</table>
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