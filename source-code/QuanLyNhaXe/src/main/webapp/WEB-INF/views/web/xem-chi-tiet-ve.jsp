\<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/Chung/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Xem chi tiết vé</title>
</head>
<body>
	<div class="hero-wrap"
		style="background-image: url('template/web/images/slides2.jpg');"
		data-stellar-background-ratio="0.5">
		<div class="overlay"></div>
		<div class="container">
			<div class="">
				<div class="">
					<br> <br>
					<form:form class="request-form ftco-animate" action="xem-chi-tiet-ve" modelAttribute="model" 
						method="get" style="margin-top: 100px; box-sizing: border-box;">
						<div class="row">
							<div class="col-lg align-items-end">
								<div class="form-group">
									<div style="float: left;">
										<div>
											<label>Mã vé hành khách</label>
										</div>
										
										<div>
											<input style="width: 250px" name="code" required="required"
												placeholder=" Vui lòng nhập mã vé ở đây " />
										</div>
										<div style="margin-top: 5px;">
											<label>Số điện thoại</label>
										</div>
										<div>
											<input style="width: 250px" name="phone" required="required"
												placeholder=" Vui lòng nhập số điện thoại ở đây" />
										</div>
										<div style="margin-top: 10px;">
											<button class="w3-button w3-blue w3-round-large"
												style="width: 100%">Kiểm tra vé</button>
										</div>
										<div>
											<div>
												<b>Lưu ý: </b>
											</div>
											<div style="width: 200px">Trường hợp không thể xem vé
												dù mã vé đúng hoặc có vấn đề gì về vé. Xin vui lòng liên hệ
												hotline: một tám không không, một không không có. Xin cảm ơn
												quý khách đã sử dụng dịch vụ.</div>
										</div>
									</div>

									<div style="float: left; margin-left: 100px;">
										<%-- 										<div class="alert alert-${alert}">${message}</div>--%>
										<div class="alert alert-success" style="text-align: center;">
											Vui lòng nhập mã vé, số điện thoại và bấm kiểm tra vé</div>
										<div>
											<table
												style="float: right; vertical-align: middle; width: 100%; border: 2px solid blue;">
												<tr style="border-	bottom: 2px solid blue;">
													<td colspan="6" style="border-left: 1px solid #ccc;">
														<div style="text-align: center">
															<b>THÔNG TIN VÉ</b>
														</div>
												</tr>
												<tr>
													<td style="border-left: 1px solid #ccc;"><label
														style="margin-left: 10px">Hành khách</label></td>
													<td>&nbsp;</td>
													<form:form modelAttribute="model2" >
														<td><form:input path="tenKhachHang"/></td>
												</form:form>
													
													
													<td><label style="margin-left: 10px">Ngày khởi
															hành</label></td>
													<td>&nbsp;</td>
													<td><label>${sessionScope.ngaydi}</label></td>
												</tr>
												<tr>
													<td><label style="margin-left: 10px">Số điện
															thoại</label></td>
													<td>&nbsp;</td>
													<td><label>${sessionScope.phone}</label></td>
													<td><label style="margin-left: 10px">Nơi đón</label></td>
													<td>&nbsp;</td>
													<td><form:input style="width:100px" disabled="true" path="noiDon"/></td>
												</tr>
												<tr>
													<td><label style="margin-left: 10px">Email</label></td>
													<td>&nbsp;</td>
													<td><label>${sessionScope.email}</label></td>

													<td><label style="margin-left: 10px">Thời gian
															đón dự kiến</label></td>
													<td>&nbsp;</td>
													<td><label>${sessionScope.thoigiandi}</label></td>
												</tr>
												<tr>
													<td><label style="margin-left: 10px">Biển số
															xe</label></td>
													<td>&nbsp;</td>
													<td><label>${sessionScope.biensoxe}</label></td>

													<td><label style="margin-left: 10px">Nơi Trả</label></td>
													<td>&nbsp;</td>

													<td><form:input style="width:100px" disabled="true" path="noiTra"/></td>
												</tr>
												<tr>
													<td><label style="margin-left: 10px">Tuyến đi</label></td>
													<td>&nbsp;</td>
													<td><label>${sessionScope.diemdi} -
															${sessionScope.diemden}</label></td>
													<td><label style="margin-left: 10px">Thời gian
															trả dự kiến</label></td>
													<td>&nbsp;</td>
													<td><label>${sessionScope.thoigianden}</label></td>
												</tr>
												<tr>
													<td><label style="margin-left: 10px">Đơn giá
															vé</label></td>
													<td>&nbsp;</td>
													<td><label>${sessionScope.dongia}</label></td>

													<td><label style="margin-left: 10px">Tổng tiền
															vé</label></td>
													<td>&nbsp;</td>
													<td><label style="margin-left: 10px">${sessionScope.tongtien}
															VNĐ</label></td>
												</tr>
											</table>
										</div>
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
