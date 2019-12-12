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
					<form:form id="form" action="xu-ly-dat-ve" method="GET"
						modelAttribute="modelve" class="request-form ftco-animate"
						style="margin-top: 100px; box-sizing: border-box;">
						<div class="row">
							<div class="col-lg align-items-end">
								<div class="form-group">
									<div style="float: left;">
										<table style="width: 145%;">
											<tr
												style="text-align: center; height: 50px; border-bottom: 1px solid blue;">
												<td colspan="3"><div>THÔNG TIN CHUYẾN ĐI</div></td>
											</tr>
											<tr>
												<td>
													<div>Điểm đi: ${sessionScope.diemdi}</div>
												</td>
												<td>
													<div>Điểm đến: ${sessionScope.diemden}</div>
												</td>
												<td>
													<div>Đơn giá vé: ${sessionScope.dongia} VNĐ</div>
												</td>
											</tr>

											<tr>
												<td>
													<div>
														<label>Chọn nơi đón</label>
													</div>
													<div style="width: height:100px">
														<form:select path="noiDon" id="noiDon"
															style="width:80%;height:50px;font-size:16px;text-align:center">
															<form:option style="text-align:center" value="null"
																label="Chọn nơi đón" />
															<form:options items="${noiDon}" />
														</form:select>
													</div>
												</td>
												<td>
													<div>
														<label>Chọn nơi trả</label>
													</div>
													<div>
														<form:select path="noiTra" id="noiTra"
															style="width:80%;height:50px;font-size:16px;text-align:center">
															<form:option value="null" label="Chọn nơi trả" />
															<form:options items="${noiTra}" />
														</form:select>
													</div>
												<td>
													<div>Chọn số vé cần đặt</div>
													<div>
														<form:input path="soVeDat" type="number"
															style="width:50%;height:50px;font-size:16px;text-align:center;"
															required="required" />

													</div>
												</td>
											</tr>
											<tr>
												<td colspan="3">
													<div>&nbsp;</div>
												</td>
											</tr>
											<tr>
												<td colspan="3">
													<div>
														<b>Chú ý:</b> Quý khách vui lòng chọn chính xác nơi cần
														phải đón - trả
													</div>
													<div>Nhà xe sẽ liên hệ khi gần tới địa điểm đón hành
														khác</div>
													<div>
														<b>Mọi thắc mắc liên hệ:</b> 0964140530
													</div>
												</td>
											</tr>
										</table>
									</div>
								</div>
								<!-- Giao diện thông tin khách hàng -->
								<div class="form-group">
									<div style="float: right;margin-top:5px ">
										<table>
											<tr style="margin-bottom: 10px; border-bottom: 1px solid blue;">
												<td style="text-align: center;">
													<div>THÔNG TIN HÀNH KHÁCH</div>
												</td>
											</tr>
											<tr>
												<td>
													<div>
														<label>Họ tên khách hàng * (Bắt buộc)</label>
													</div>
													<div>
														<input class="w3-input w3-border w3-round" name="hoten"
															type="text" style="width: 100%;"
															placeholder=" ví dụ: Nguyễn Thị Hiền" required
															pattern="[^0-9]{1,30}"
															title="Họ tên không chứa ký tự đặc biệt và chữ số. Ví dụ: Nguyễn Thị Hiền" />
													</div>
												</td>
											</tr>
											<tr>
												<td>
													<div>
														<label>Số điện thoại * (Bắt buộc)</label>
													</div>
													<div>
														<input name="phone" type="text" style="width: 100%;"
															pattern="[0-9]{10}" placeholder=" ví dụ : 0964140530"
															required
															title="Số điện thoại chỉ chứa dãy số 10 chữ số Ví dụ: 0964140530">
													</div>
												</td>
											</tr>
											<tr>
												<td>
													<div>
														<label>Email</label>
													</div>
													<div>
														<input name="email" style="width: 100%;" type="email"
															placeholder=" ví dụ: nhh01629421608"
															pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$">
													</div>
												</td>
											</tr>
											<tr>
												<td>
													<div>
														<Button
															class="w3-button w3-orange w3-border w3-border-red w3-round-large"
															type="submit"
															style="width: 100%; margin-top: 10px; background-color: blue black; font-family: Helvetica">
															<b>XÁC NHẬN</b>
														</Button>
													</div>
												</td>
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
	<script>
		var s = "${message}";
		if (s != "")
			swal("Thông Báo!", "${message}", "error");
	</script>
	<!-- 	<script>
 	 $(document).ready(function() {
		 
 	        //Khi bàn phím được nhấn và thả ra thì sẽ chạy phương thức này
	        $("#form").validate({
	            rules: {
	            	hoten: "required",
	                phone: "required",
              email: {
 	                    required: true,
 	                    minlength: 2
 	                }
 	            },
 	            messages: {
 	            	hoten: "Vui lòng nhập họ",
 	            	phone: "Vui lòng nhập tên",
 	            	email: {
 	                    required: "Vui lòng nhập địa chỉ",
 	                    minlength: "Địa chỉ ngắn vậy, chém gió ah?"
 	                }
 	            }
 	        });
 	    });
 	    </script> -->
</body>
</html>