<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/Chung/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Xác nhận thanh toán</title>
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
					<form class="request-form ftco-animate" action="xu-ly-thanh-toan"
						style="margin-top: 100px; box-sizing: border-box;">
						<div class="row">
							<div class="col-lg align-items-end">
								<table
									style="float: left; width: 600px; vertical-align: middle; border: 2px solid blue;">

									<tr style="border: 2px solid blue;">
										<td colspan="2">
											<div style="text-align: center">Lựa chọn phương thức
												thanh toán</div>
										</td>
									</tr>

									<tr style="height: 50px;">
										<td><input type="radio" name="radio" id="action-1" /></td>
										<td>
											<div>Thẻ thanh toán quốc tế Visa, MasterCard, JCB</div>

										</td>
									</tr>
									<tr>
										<td></td>
										<td>
											<div id="notiError-1" style="display: none;">
												<input type="text" placeholder="Nhập mã thanh toán" name="code"
													style="text-align: center;" />

											</div>
										</td>
									</tr>

									<tr style="height: 50px;">
										<td><input type="radio" name="radio" id="action-2" /></td>
										<td>
											<div>Thẻ thanh toán quốc tế gia đình</div>
										</td>
									</tr>
									<tr>
										<td></td>
										<td>
											<div id="notiError-2" style="display: none;">
												<input type="text" placeholder="Nhập mã thanh toán" name="code-2"
													style="text-align: center;" />

											</div>
										</td>
									</tr>

									<tr style="height: 50px;">
										<td><input type="radio" name="radio" id="action-3" /></td>
										<td>
											<div>Thẻ ATM nội địa/ Internet Banking</div>
										</td>
									</tr>
									<tr>
										<td></td>
										<td>
											<div id="notiError-3" style="display: none;">
												<input type="text" placeholder="Nhập mã thanh toán" name="code-3"
													style="text-align: center;" />

											</div>
										</td>
									</tr>
									<tr style="height: 50px;">
										<td><input type="radio" name="radio" id="action-4" /></td>
										<td>
											<div>Ví ZaloPay</div>
										</td>
									</tr>
									<tr>
										<td></td>
										<td>
											<div id="notiError-4" style="display: none;">
												<input type="text" placeholder="Nhập mã thanh toán" name="code-4"
													style="text-align: center;" />
											</div>
										</td>
									</tr>
									<tr style="height: 50px;">
										<td><input type="radio" name="radio" id="action-5" /></td>
										<td>
											<div>Chuyển khoản ngân hàng</div>
										</td>
									</tr>
									<tr>
										<td></td>
										<td>
											<div id="notiError-5" style="display: none;">
												<input type="text" placeholder="Nhập mã thanh toán" name="code-5"
													style="text-align: center;" />
											
											
											</div>
											
											
										</td>
									</tr>
									<tr style="height: 50px;">
										<td colspan="2" style="border-top: 2px solid #ccc"><label>Lưu
												ý : Sau khi đặt vé sẽ có nhân viên liên hệ trực tiếp. Xin
												vui lòng quý khách xác nhận.</label> <label>Chú ý: Khi đồng
												ý đặt vé, quý khách đã đồng ý với <a href="#">điều khoản</a>
												của web
										</label></td>
									</tr>
								</table>

								<table
									style="float: right; vertical-align: middle; width: 400px; border: 2px solid blue;">
									<tr style="border-bottom: 2px solid blue;">
										<td colspan="2" style="border-left: 1px solid #ccc;">
											<div style="text-align: center">
												<b>Thông tin chuyến đi</b>
											</div>
										</td>
									</tr>
									<tr>
										<td style="border-left: 1px solid #ccc;"><label
											style="margin-left: 10px">Hành khách</label></td>
										<td><label>${sessionScope.name}</label></td>
									</tr>
									<tr>
										<td><label style="margin-left: 10px">Số điện
												thoại</label></td>
										<td><label>0${sessionScope.phone}</label></td>
									</tr>
									<tr>
										<td><label style="margin-left: 10px">Email</label></td>
										<td><label>${sessionScope.email}</label></td>
									</tr>
									<tr>
										<td><label style="margin-left: 10px">Biển số xe</label></td>
										<td><label>${sessionScope.biensoxe}</label></td>
									</tr>
									<tr>
										<td><label style="margin-left: 10px">Tuyến đi</label></td>
										<td><label>${sessionScope.diemdi} -
												${sessionScope.diemden}</label></td>
									</tr>
									<tr>
										<td><label style="margin-left: 10px">Đơn giá vé</label></td>
										<td><label>${sessionScope.dongia}</label></td>
									</tr>
									<tr>
										<td><label style="margin-left: 10px">Số vé đặt</label></td>
										<td><label>${sessionScope.sovedat}</label></td>
									</tr>
									<tr>
										<td><label style="margin-left: 10px">Ngày khởi
												hành</label></td>
										<td><label>${sessionScope.ngaydi}</label></td>
									</tr>
									<tr>
										<td><label style="margin-left: 10px">Nơi đón</label></td>
										<td><label>${sessionScope.noidon}</label></td>
									</tr>
									<tr>
										<td><label style="margin-left: 10px">Thời gian
												đón dự kiến</label></td>
										<td><label>${sessionScope.thoigiandi}</label></td>
									</tr>
									<tr>
										<td><label style="margin-left: 10px">Nơi Trả</label></td>
										<td><label>${sessionScope.noitra}</label></td>
									</tr>
									<tr>
										<td><label style="margin-left: 10px">Thời gian
												trả dự kiến</label></td>
										<td><label>${sessionScope.thoigianden}</label></td>
									</tr>
									<tr style="border-bottom: 2px solid blue;">
										<td><label style="margin-left: 10px">Tổng tiền vé</label>
										</td>
										<td><label style="margin-left: 10px">${sessionScope.tongtien}
												VNĐ</label></td>
									</tr>
									<tr>
										<td colspan="2">
											<div>
												<button style="width: 100%; font-family: sans-serif;">ĐỒNG
													Ý ĐẶT VÉ</button>
											</div>
										</td>
									</tr>
								</table>

							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script>
		document.getElementById('action-1').onclick = function(e) {
			if (this.checked) {
				document.getElementById("notiError-1").style.display = 'block'
				document.getElementById("notiError-2").style.display = 'none'
				document.getElementById("notiError-3").style.display = 'none'
				document.getElementById("notiError-4").style.display = 'none'
				document.getElementById("notiError-5").style.display = 'none'
			}

		};
		document.getElementById('action-2').onclick = function(e) {
			if (this.checked) {
				document.getElementById("notiError-1").style.display = 'none'
				document.getElementById("notiError-2").style.display = 'block'
				document.getElementById("notiError-3").style.display = 'none'
				document.getElementById("notiError-4").style.display = 'none'
				document.getElementById("notiError-5").style.display = 'none'
			}

		};
		document.getElementById('action-3').onclick = function(e) {
			if (this.checked) {
				document.getElementById("notiError-1").style.display = 'none'
				document.getElementById("notiError-2").style.display = 'none'
				document.getElementById("notiError-3").style.display = 'block'
				document.getElementById("notiError-4").style.display = 'none'
				document.getElementById("notiError-5").style.display = 'none'
			}

		};
		document.getElementById('action-4').onclick = function(e) {
			if (this.checked) {
				document.getElementById("notiError-1").style.display = 'none'
				document.getElementById("notiError-2").style.display = 'none'
				document.getElementById("notiError-3").style.display = 'none'
				document.getElementById("notiError-4").style.display = 'block'
				document.getElementById("notiError-5").style.display = 'none'
			}

		};
		document.getElementById('action-5').onclick = function(e) {
			if (this.checked) {
				document.getElementById("notiError-1").style.display = 'none'
				document.getElementById("notiError-2").style.display = 'none'
				document.getElementById("notiError-3").style.display = 'none'
				document.getElementById("notiError-4").style.display = 'none'
				document.getElementById("notiError-5").style.display = 'block'
			}
		};
	</script>
	<script>
		var s = "${message}";
		if (s != "")
			swal("Thông Báo!", "${message}", "error");
	</script>

</body>

</html>
