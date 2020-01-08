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
					<form:form class="request-form ftco-animate"
						action="xem-chi-tiet-ve" modelAttribute="model" method="get"
						style="margin-top: 100px; box-sizing: border-box;">
						<div class="row">
							<div class="col-lg align-items-end">
								<div class="form-group"
									style="color: black; font-family: tahoma;">
									<div style="float: left;">
										<div>
											<label><b>Mã vé hành khách</b></label>
										</div>

										<div>
											<input style="width: 250px" class="w3-input w3-border w3-round"  name="code" required="required"
												placeholder=" Vui lòng nhập mã vé ở đây " />
										</div>
										<div style="margin-top: 5px;">
											<label><b>Số điện thoại</b></label>
										</div>
										<div>
											<input style="width: 250px" class="w3-input w3-border w3-round"  name="phone" required="required"
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
											<div style="width: 250px">Trường hợp không thể xem vé
												dù mã vé đúng hoặc có vấn đề gì về vé. Xin vui lòng liên hệ
												hotline: một tám không không, một không không có. Xin cảm ơn
												quý khách đã sử dụng dịch vụ.</div>
										</div>
									</div>
									<div style="float: left; margin-left: 50px;width:700px">
										<div class="alert alert-${alert3}" style="text-align: center;display: none" id="idTB-tieude">${message}</div>
										<div class="alert alert-${alert2}" style="text-align: center;display: block;" id="idTB-tieude2">${message2}</div>
<!-- 										<div class="alert alert-success" style="text-align: center;"> -->
<!-- 											Vui lòng nhập mã vé, số điện thoại và bấm kiểm tra vé</div> -->
										<div id="hien-thi-null" style="display: block;">										
											<div style="background-image: url('template/web/images/212.png'); 
														background-repeat: no-repeat;
														 background-position: center;
														margin-left:100px;width:500px;height:250px;">
														</div>
										</div>
										<div id="hien-thi-table" style="display: none;">
											<table
												style="float: left; vertical-align: middle; width: 100%; border: 2px solid blue;">
												<tr style="border-bottom: 2px solid blue;">
													<td colspan="6" style="border-left: 1px solid #ccc;">
														<div style="text-align: center;">
															<b>THÔNG TIN VÉ</b>
														</div>
												</tr>
												<tr>
													<td style="border-left: 1px solid #ccc;"><label
														style="margin-left: 10px"><b>Hành khách</b></label></td>
													<td>&nbsp;</td>
													<form:form modelAttribute="model2">
														<td><form:input path="tenKhachHang"
																class="w3-input w3-border-0"
																style="background-color: white;
																		color: black;"
																disabled="true" /></td>
													</form:form>
													<form:form modelAttribute="model3">
														<td><label style="margin-left: 10px"><b>Ngày
																khởi hành</b></label></td>
														<td>&nbsp;</td>
														<td><form:input path="ngayDi"
																class="w3-input w3-border-0"
																style="background-color: white;
																		color: black;"
																disabled="true" /></td>
													</form:form>
												</tr>

												<tr>
													<form:form modelAttribute="model2">
														<td><label style="margin-left: 10px;width:150px"><b>Số điện
																thoại</b></label></td>
														<td>&nbsp;</td>
														<td>	<form:input path="soDienThoai"
																class="w3-input w3-border-0"
																style="background-color: white;
																		color: black;"
																disabled="true" /></td>
													</form:form>
													<td><label style="margin-left: 10px"><b>Nơi đón</b></label></td>
													<td>&nbsp;</td>
													<td><form:input class="w3-input w3-border-0"
															style="background-color: white;
																		color: black;
																		width:100%;"
															disabled="true" path="noiDon" /></td>
												</tr>
												<tr>
													<form:form modelAttribute="model2">
														<td><label style="margin-left: 10px"><b>Email</b></label></td>
														<td>&nbsp;</td>
														<td><form:input class="w3-input w3-border-0"
																style="background-color: white;
																		color: black;
																		width:100%;"
																path="email" disabled="true" /></td>
													</form:form>
													<form:form modelAttribute="model3">
														<td><label style="margin-left: 10px"><b>Thời
																gian đón dự kiến</b></label></td>
														<td>&nbsp;</td>
														<td><form:input path="thoiGian"
																class="w3-input w3-border-0"
																style="background-color: white;
																		color: black;
																		width:100%;"
																disabled="true" /></td>
													</form:form>
												</tr>
												<tr>
													<form:form modelAttribute="model3">
														<td><label style="margin-left: 10px"><b>Biển số
																xe</b></label></td>
														<td>&nbsp;</td>
														<td><form:input path="bienSoXe"
																class="w3-input w3-border-0"
																style="background-color: white;
																		color: black;
																		width:100%;"
																disabled="true" /></td>
													</form:form>
													<td><label style="margin-left: 10px"><b>Nơi Trả</b></label></td>
													<td>&nbsp;</td>
													<td><form:input class="w3-input w3-border-0"
															style="background-color: white;
																		color: black;
																		width:100%;"
															disabled="true" path="noiTra" /></td>
												</tr>
												<tr>
													<form:form modelAttribute="model3">
														<td><label style="margin-left: 10px"><b>Tuyến đi</b></label></td>
														<td>&nbsp;</td>
														<td><form:input path="diemDi" disabled="true"
																style="width:80px;text-align: center;
																background-color: white;
																color: black;" />-<form:input
																path="diemDen" disabled="true" style="width:80px;text-align: center;
																 background-color: white; color: black;" /></td>
														<td><label style="margin-left: 10px"><b>Thời
																gian trả dự kiến</b></label></td>
														<td>&nbsp;</td>
														<td><form:input path="thoiGianDen"
																class="w3-input w3-border-0"
																style="background-color: white;
																		color: black;
																		width:100%;"
																disabled="true" /></td>
													</form:form>
												</tr>
												<tr>
													<form:form modelAttribute="model3">
														<td><label style="margin-left: 10px"><b>Đơn giá
																vé</b></label></td>
														<td>&nbsp;</td>
														<td><form:input path="donGia"
																class="w3-input w3-border-0"
																style="background-color: white;
																		color: black;
																		width:100%;"
																disabled="true" /></td>
													</form:form>
													<td><label style="margin-left: 10px"><b>Tổng tiền
															vé</b></label></td>
													<td>&nbsp;</td>
													<td><label>${tongtien} VNĐ</label></td>
												</tr>
												<tr>
													<td>
														<div>
															<label style="margin-left: 10px;"><b>Tổng vé đặt</b></label>
														</div>
													</td>
													<td>&nbsp;</td>
													<td>
														<div>
															<form:input
																style="background-color: white;
																		color: black;"
																class="w3-input w3-border-0" path="soVeDat"
																disabled="true" />
														</div>
													</td>
													<td>
														<div>
															<label style="margin-left: 10px"><b>Ngày đặt vé</b></label>
														</div>
													</td>
													<td>&nbsp;</td>
													<td>
														<div><label>11-01-2020</label></div>
													</td>
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
	<script>
		var string = "${tongtien}";
		if(string != 0){
				document.getElementById("hien-thi-table").style.display = 'block'
				document.getElementById("hien-thi-null").style.display = 'none'
		}
		else
			{
			document.getElementById("hien-thi-table").style.display = 'none'
			document.getElementById("hien-thi-null").style.display = 'block'
			}
		console.log("${tongtien}")
		var s = "${message}";
		if (s != "")
			{
			swal("Thông Báo!", "${message}", "${alert}");
			document.getElementById("idTB-tieude").style.display = 'block'
			document.getElementById("idTB-tieude2").style.display = 'none'
			}	
	</script>
</body>
<style>
.input {
	text-align: center;
	background-color: white;
	color: black;
}
</style>
</html>
