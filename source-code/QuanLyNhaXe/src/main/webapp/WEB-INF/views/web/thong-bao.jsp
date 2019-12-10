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
					<form class="request-form ftco-animate" action="thong-bao"
						style="margin-top: 100px; box-sizing: border-box;">
						<div class="row">
							<div class="col-lg align-items-end">
								<div class="form-group">
									<div class="alert alert-success" style="text-align:center">
										ĐẶT VÉ THÀNH CÔNG
									</div>
									<div>
										<label>Mã vé khách hàng: </label>
										<label>${sessionScope.idVe} <a href="#">Xem chi tiết vé </a></label>
									</div>
									<div>
										<label>Cảm ơn quý khách đã sử dụng dịch vụ của chúng tôi</label>
									</div>
									<div>
										<label>Mọi khiếu nạ xin liên hệ : 0964140530</label>
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
