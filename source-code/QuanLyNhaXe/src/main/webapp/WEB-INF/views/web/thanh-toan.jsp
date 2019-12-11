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
					<form class="request-form ftco-animate" action="xu-ly"
						style="margin-top: 100px; box-sizing: border-box;">
						<div class="row">
							<div class="col-lg align-items-end">
<!-- 								<div class="form-group"> -->
<!-- 									<div class="alert alert-success">XÁC NHẬN THANH TOÁN VÀ KIỂM TRA THÔNG TIN</div> -->
<!-- 								</div> -->
								<table style="float:left;width:600px;vertical-align: middle; 
    									border:2px solid blue;" >	
    																	
									<tr style="border:2px solid blue;">
										<td colspan="2">
											<div style="text-align:center">Lựa chọn phương thức thanh toán</div>
										</td>
									</tr>
									
									<tr style="height:50px;">
										<td >
											<input type="radio" id="radio_1"/>
										</td>
										<td>
											<div>Thẻ thanh toán quốc tế Visa, MasterCard, JCB</div>
										</td>
									</tr>
									
									<tr style="height:50px;">
										<td>
											<input type="radio" id="radio_2"/>
										</td>
										<td>
											<div>Thẻ thanh toán quốc tế gia đình</div>
										</td>
									</tr>
									
									<tr style="height:50px;">
										<td>
											<input type="radio" id="radio_3"/>
										</td>
										<td>
											<div>Thẻ ATM nội địa/ Internet Banking</div>
										</td>
									</tr>
									<tr style="height:50px;">
										<td>
											<input type="radio" id="radio_4"/>
										</td>
										<td>
											<div>Ví ZaloPay</div>
										</td>
									</tr>
									<tr style="height:50px;">
										<td style="border-bottom:2px solid #ccc">
											<input type="radio" id="radio_5"/>
										</td>
										<td style="border-bottom:2px solid #ccc">
											<div>Chuyển khoản ngân hàng</div>
										</td>
									</tr>
									<tr style="height:50px;">
										<td colspan="2">
											<label>Lưu ý : Sau khi đặt vé sẽ có nhân viên liên hệ trực tiếp. Xin vui lòng quý khách xác nhận.</label>
											<label>Chú ý: Khi đồng ý đặt vé, quý khách đã đồng ý với <a href="#">điều khoản</a> của web</label>
										</td>
									</tr>
								</table>
								
								<table style="float:right;vertical-align: middle;
									width:400px;
									border:2px solid blue;">
									<tr style="border-bottom:2px solid blue;">
										<td colspan="2" style="border-left:1px solid #ccc;">
											<div style="text-align:center"><b>Thông tin chuyến đi</b></div>
										</td>
									</tr>
									<tr>
										<td style="border-left:1px solid #ccc;">
											<label style="margin-left:10px" >Hành khách</label>
										</td >
										<td>
											<label>${sessionScope.name}</label>
										</td>
									</tr>
									<tr>
										<td>
											<label style="margin-left:10px">Số điện thoại</label>
										</td>
										<td>
											<label>${sessionScope.phone}</label>
										</td>
									</tr>
									<tr>
										<td>
											<label style="margin-left:10px">Email</label>
										</td>
										<td>
											<label>${sessionScope.email}</label>
										</td>
									</tr>
									<tr>
										<td>
											<label style="margin-left:10px">Biển số xe</label>
										</td>
										<td>
											<label>${sessionScope.biensoxe}</label>
										</td>
									</tr>
									<tr>
										<td>
											<label style="margin-left:10px">Tuyến đi</label>
										</td>
										<td>
											<label>${sessionScope.diemdi} - ${sessionScope.diemden}</label>
										</td>
									</tr>
									<tr>
										<td>
											<label style="margin-left:10px">Đơn giá vé</label>
										</td>
										<td>
											<label>${sessionScope.dongia}</label>
										</td>
									</tr>
									<tr>
										<td>
											<label style="margin-left:10px">Số vé đặt</label>
										</td>
										<td>
											<label>${sessionScope.sovedat}</label>
										</td>
									</tr>
									<tr>
										<td>
											<label style="margin-left:10px">Ngày khởi hành</label>
										</td>
										<td>
											<label>${sessionScope.ngaydi}</label>
											
										</td>
									</tr>
									<tr>
										<td>
											<label style="margin-left:10px">Nơi đón</label>
										</td>
										<td>
											<label>${sessionScope.noidon}</label>
										</td>
									</tr>
									<tr>
										<td>
											<label style="margin-left:10px">Thời gian đón dự kiến</label>
										</td>
										<td>
											<label>${sessionScope.thoigiandi}</label>
										</td>
									</tr>
									<tr>
										<td>
											<label style="margin-left:10px">Nơi Trả</label>
										</td>
										<td>
											<label>${sessionScope.noitra}</label>
										</td>
									</tr>
									<tr>
										<td>
											<label style="margin-left:10px">Thời gian trả dự kiến</label>
										</td>
										<td>
											<label>${sessionScope.thoigianden}</label>
										</td>
									</tr>
									<tr style="border-bottom:2px solid blue;">
										<td>
											<label style="margin-left:10px">Tổng tiền vé</label>
										</td>
										<td>
											<label style="margin-left:10px">${sessionScope.tongtien} VNĐ</label>
										</td>
									</tr>
									<tr>
										<td colspan="2">
											<div>
												<button  
													style="width:100%;font-family:sans-serif; ">ĐỒNG Ý ĐẶT VÉ
												</button>
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
</body>
</html>
