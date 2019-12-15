<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/Chung/taglib.jsp"%>
<c:url var="trangchuURL" value="/trang-chu" />
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">
<title>Trang chủ</title>

</head>

<body>
	<div class="hero-wrap"
		style="background-image: url('template/web/images/slides2.jpg');"
		data-stellar-background-ratio="0.5">
		<div class="overlay"></div>
		<div class="container">
			<div class="">

				<!-- test -->
				<div>
					<h1 style="color: white; position: relative; top: 250px; left: 200px;">
						ĐẶT VÉ CHƯA BAO GIỜ DỄ DÀNG ĐẾN VẬY
					</h1>
				</div>
			<!-- end test -->

			<div class="">
				<br> <br>
				<form:form action="xu-ly-tim-kiem" method="GET"
					modelAttribute="model" class="request-form ftco-animate"
					style="margin-top: 200px; box-sizing: border-box;">
					<div class="row">
						<div class="col-lg align-items-end">
							<div class="form-group">
								<div class="form-group">
									<label for="tuyenXeId">Chọn điểm đi</label>
									<div class="form-field">
										<form:select path="diemDi" id="diemdi" class="w3-input w3-border w3-round-large">
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
									<label for="tuyenXeId">Chọn điểm đến</label>
									<div class="form-field">
										<form:select path="diemDen" id="diemDen" class="w3-input w3-border w3-round-large">
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
											<form:input path="ngayDi" value="12/11/2019" type="date" class="w3-input w3-border w3-round-large" />
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-lg align-self-end">
							<div class="form-group">
								<div class="form-field">
									<Button class="w3-button w3-orange w3-round-large" type="submit" 
											style= "width:100%;
													font-family: Tahoma,Bookman,Verdana;">
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


	<section class="ftco-section services-section ftco-no-pt ftco-no-pb">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-12 heading-section text-center ftco-animate mb-5">
					<span class="subheading">DỊCH VỤ CỦA CHÚNG TÔI</span>
					<h2 class="mb-2">Dịch vụ của chúng tôi</h2>
				</div>
			</div>
			<div class="row d-flex">
				<div class="col-md-3 d-flex align-self-stretch ftco-animate">
					<div class="media block-6 services">
						<div class="media-body py-md-4">
							<div class="d-flex mb-3 align-items-center">
								<div class="icon">
									<span class="flaticon-customer-support"></span>
								</div>
								<h3 class="heading mb-0 pl-3">Hỗ trợ 24/7</h3>
							</div>
							<p>Bạn lo lắng về vấn đề mua vé, không biết cách mua. Đừng lo
								hãy gọi ngay cho chúng tôi. Chúng tôi luôn có mặt vì bạn</p>
						</div>
					</div>
				</div>
				<div class="col-md-3 d-flex align-self-stretch ftco-animate">
					<div class="media block-6 services">
						<div class="media-body py-md-4">
							<div class="d-flex mb-3 align-items-center">
								<div class="icon">
									<span class="flaticon-route"></span>
								</div>
								<h3 class="heading mb-0 pl-3">Có mặt gần như 64 tỉnh thành</h3>
							</div>
							<p>Nhà xe chúng tôi có các tuyến đường phủ gần khắp đất nước</p>
						</div>
					</div>
				</div>
				<div class="col-md-3 d-flex align-self-stretch ftco-animate">
					<div class="media block-6 services">
						<div class="media-body py-md-4">
							<div class="d-flex mb-3 align-items-center">
								<div class="icon">
									<span class="flaticon-online-booking"></span>
								</div>
								<h3 class="heading mb-0 pl-3">Đặt vé</h3>
							</div>
							<p>Có thể đặt vé mọi lúc mọi nơi mọi thời điểm</p>
						</div>
					</div>
				</div>
				<div class="col-md-3 d-flex align-self-stretch ftco-animate">
					<div class="media block-6 services">
						<div class="media-body py-md-4">
							<div class="d-flex mb-3 align-items-center">
								<div class="icon">
									<span class="flaticon-rent"></span>
								</div>
								<h3 class="heading mb-0 pl-3">Thuê xe</h3>
							</div>
							<p>Chúng tối còn cung cấp dịch vụ thuê xe, cho các khách hàng
								có nhu cầu</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section class="ftco-section">
		<div class="container-fluid px-4">
			<div class="row justify-content-center">
				<div class="col-md-12 heading-section text-center ftco-animate mb-5">
					<span class="subheading">DỊCH VỤ TẾT</span>
					<h2 class="mb-2">HÃY ĐẶT VÉ NGAY LÚC NÀY ! GIẢM 50%</h2>
				</div>
			</div>
			<div class="row">
				<div class="col-md-3">
					<div class="car-wrap ftco-animate">
						<div class="img d-flex align-items-end"
							style="background-image: url('template/web/images/car-1.jpg');">
							<div class="price-wrap d-flex">
								<span class="rate">$25</span>
								<p class="from-day">
									<span>From</span> <span>/Day</span>
								</p>
							</div>
						</div>
						<div class="text p-4 text-center">
							<h2 class="mb-0">
								<a href="#">Mercedes Grand Sedan</a>
							</h2>
							<span>Audi</span>
							<p class="d-flex mb-0 d-block">
								<a href="#" class="btn btn-black btn-outline-black mr-1">Book
									now</a> <a href="#" class="btn btn-black btn-outline-black ml-1">Details</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="car-wrap ftco-animate">
						<div class="img d-flex align-items-end"
							style="background-image: url('template/web/images/car-2.jpg');">
							<div class="price-wrap d-flex">
								<span class="rate">$25</span>
								<p class="from-day">
									<span>From</span> <span>/Day</span>
								</p>
							</div>
						</div>
						<div class="text p-4 text-center">
							<h2 class="mb-0">
								<a href="#">Mercedes Grand Sedan</a>
							</h2>
							<span>Ford</span>
							<p class="d-flex mb-0 d-block">
								<a href="#" class="btn btn-black btn-outline-black mr-1">Book
									now</a> <a href="#" class="btn btn-black btn-outline-black ml-1">Details</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="car-wrap ftco-animate">
						<div class="img d-flex align-items-end"
							style="background-image: url('template/web/images/car-3.jpg');">
							<div class="price-wrap d-flex">
								<span class="rate">$25</span>
								<p class="from-day">
									<span>From</span> <span>/Day</span>
								</p>
							</div>
						</div>
						<div class="text p-4 text-center">
							<h2 class="mb-0">
								<a href="#">Mercedes Grand Sedan</a>
							</h2>
							<span>Cheverolet</span>
							<p class="d-flex mb-0 d-block">
								<a href="#" class="btn btn-black btn-outline-black mr-1">Book
									now</a> <a href="#" class="btn btn-black btn-outline-black ml-1">Details</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="car-wrap ftco-animate">
						<div class="img d-flex align-items-end"
							style="background-image: url('template/web/images/car-4.jpg');">
							<div class="price-wrap d-flex">
								<span class="rate">$25</span>
								<p class="from-day">
									<span>From</span> <span>/Day</span>
								</p>
							</div>
						</div>
						<div class="text p-4 text-center">
							<h2 class="mb-0">
								<a href="#">Mercedes Grand Sedan</a>
							</h2>
							<span>Mercedes</span>
							<p class="d-flex mb-0 d-block">
								<a href="#" class="btn btn-black btn-outline-black mr-1">Book
									now</a> <a href="#" class="btn btn-black btn-outline-black ml-1">Details</a>
							</p>
						</div>
					</div>
				</div>

				<div class="col-md-3">
					<div class="car-wrap ftco-animate">
						<div class="img d-flex align-items-end"
							style="background-image: url('template/web/images/car-5.jpg');">
							<div class="price-wrap d-flex">
								<span class="rate">$25</span>
								<p class="from-day">
									<span>From</span> <span>/Day</span>
								</p>
							</div>
						</div>
						<div class="text p-4 text-center">
							<h2 class="mb-0">
								<a href="#">Mercedes Grand Sedan</a>
							</h2>
							<span>Audi</span>
							<p class="d-flex mb-0 d-block">
								<a href="#" class="btn btn-black btn-outline-black mr-1">Book
									now</a> <a href="#" class="btn btn-black btn-outline-black ml-1">Details</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="car-wrap ftco-animate">
						<div class="img d-flex align-items-end"
							style="background-image: url('template/web/images/car-6.jpg');">
							<div class="price-wrap d-flex">
								<span class="rate">$25</span>
								<p class="from-day">
									<span>From</span> <span>/Day</span>
								</p>
							</div>
						</div>
						<div class="text p-4 text-center">
							<h2 class="mb-0">
								<a href="#">Mercedes Grand Sedan</a>
							</h2>
							<span>Ford</span>
							<p class="d-flex mb-0 d-block">
								<a href="#" class="btn btn-black btn-outline-black mr-1">Book
									now</a> <a href="#" class="btn btn-black btn-outline-black ml-1">Details</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="car-wrap ftco-animate">
						<div class="img d-flex align-items-end"
							style="background-image: url('template/web/images/car-7.jpg');">
							<div class="price-wrap d-flex">
								<span class="rate">$25</span>
								<p class="from-day">
									<span>From</span> <span>/Day</span>
								</p>
							</div>
						</div>
						<div class="text p-4 text-center">
							<h2 class="mb-0">
								<a href="#">Mercedes Grand Sedan</a>
							</h2>
							<span>Cheverolet</span>
							<p class="d-flex mb-0 d-block">
								<a href="#" class="btn btn-black btn-outline-black mr-1">Book
									now</a> <a href="#" class="btn btn-black btn-outline-black ml-1">Details</a>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="car-wrap ftco-animate">
						<div class="img d-flex align-items-end"
							style="background-image: url('template/web/images/car-8.jpg');">
							<div class="price-wrap d-flex">
								<span class="rate">$25</span>
								<p class="from-day">
									<span>From</span> <span>/Day</span>
								</p>
							</div>
						</div>
						<div class="text p-4 text-center">
							<h2 class="mb-0">
								<a href="#">Mercedes Grand Sedan</a>
							</h2>
							<span>Mercedes</span>
							<p class="d-flex mb-0 d-block">
								<a href="#" class="btn btn-black btn-outline-black mr-1">Book
									now</a> <a href="#" class="btn btn-black btn-outline-black ml-1">Details</a>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section class="ftco-section services-section img"
		style="background-image: url('template/web/images/bg_2.jpg');">
		<div class="overlay"></div>
		<div class="container">
			<div class="row justify-content-center mb-5">
				<div
					class="col-md-7 text-center heading-section heading-section-white ftco-animate">
					<span class="subheading">CÁC BƯỚC THỰC HIỆN</span>
					<h2 class="mb-3">LÀM SAO ĐỂ ĐẶT VÉ</h2>
				</div>
			</div>
			<div class="row">
				<div class="col-md-3 d-flex align-self-stretch ftco-animate">
					<div class="media block-6 services services-2">
						<div class="media-body py-md-4 text-center">
							<div
								class="icon d-flex align-items-center justify-content-center">
								<span class="flaticon-route"></span>
							</div>
							<h3>Chọn tuyến đi</h3>
							<p>Đầu tiên, bạn hãy chọn điểm đi, điểm dến và ngày đi theo
								nhu cầu của bạn</p>
						</div>
					</div>
				</div>

				<div class="col-md-3 d-flex align-self-stretch ftco-animate">
					<div class="media block-6 services services-2">
						<div class="media-body py-md-4 text-center">
							<div
								class="icon d-flex align-items-center justify-content-center">
								<span class="flaticon-rent"></span>
							</div>
							<h3>Nhập thông tin</h3>
							<p>Nhập các yêu cầu thông tin đầy đủ theo yêu cầu</p>
						</div>
					</div>
				</div>
				<div class="col-md-3 d-flex align-self-stretch ftco-animate">
					<div class="media block-6 services services-2">
						<div class="media-body py-md-4 text-center">
							<div
								class="icon d-flex align-items-center justify-content-center">
								<span class="flaticon-select"></span>
							</div>
							<h3>Chọn xe</h3>
							<p>Hãy lựa chọn các xe phù hợp và bắt đầu đặt vé</p>
						</div>
					</div>
				</div>
				<div class="col-md-3 d-flex align-self-stretch ftco-animate">
					<div class="media block-6 services services-2">
						<div class="media-body py-md-4 text-center">
							<div
								class="icon d-flex align-items-center justify-content-center">
								<span class="flaticon-review"></span>
							</div>
							<h3>Thanh toán</h3>
							<p>Thanh toán online</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section class="ftco-section testimony-section">
		<div class="container">
			<div class="row justify-content-center mb-5">
				<div class="col-md-7 text-center heading-section ftco-animate">
					<span class="subheading">ĐÁNH GIÁ VỀ DỊCH VỤ</span>
					<h2 class="mb-3">Đánh giá về dịch vụ</h2>
				</div>
			</div>
			<div class="row ftco-animate">
				<div class="col-md-12">
					<div class="carousel-testimony owl-carousel ftco-owl">
						<div class="item">
							<div class="testimony-wrap text-center py-4 pb-5">
								<div class="user-img mb-4"
									style="background-image: url('template/web/images/person_3.jpg')">
								</div>
								<div class="text pt-4">
									<p class="mb-4">Ngoại trừ mọi thứ đều tốt, tôi không gì
										phàn nàn</p>
									<p class="name">Công Tằng Tôn Nữ Đinh Thị Cỏ Hâm</p>
									<span class="position">Chủ tịch liên hiệp nhà máy thuốc
										nổ</span>
								</div>
							</div>
						</div>
						<div class="item">
							<div class="testimony-wrap text-center py-4 pb-5">
								<div class="user-img mb-4"
									style="background-image: url('template/web/images/person_1.jpg')">
								</div>
								<div class="text pt-4">
									<p class="mb-4">Rất tuyệt. Không còn gì tuyệt vời hơn. Đặt
										vé rõ ràng và nhanh chóng. Đi đúng nơi về đúng chỗ. Đây là
										điều làm t khá hài lòng</p>
									<p class="name">Nguyễn Thái Dương</p>
									<span class="position">Nhân viên văn phòng</span>
								</div>
							</div>
						</div>
						<div class="item">
							<div class="testimony-wrap text-center py-4 pb-5">
								<div class="user-img mb-4"
									style="background-image: url('template/web/images/person_2.jpg')">
								</div>
								<div class="text pt-4">
									<p class="mb-4">Thật sự dịch vụ không chê vào đâu được. Tài
										xe thì nhiệt tình. Xe chạy rất êm, khá hẳn mấy cái xe đón ven
										đường. Đúng là xe ven đường sao với được tới xe đặt trước</p>
									<p class="name">Phương Phưởng Phường Phượng</p>
									<span class="position">CEO CAVE</span>
								</div>
							</div>
						</div>

						<div class="item">
							<div class="testimony-wrap text-center py-4 pb-5">
								<div class="user-img mb-4"
									style="background-image: url('template/web/images/person_3.jpg')">
								</div>
								<div class="text pt-4">
									<p class="mb-4">Ngoại trừ mọi thứ đều tốt, tôi không gì
										phàn nàn</p>
									<p class="name">Công Tằng Tôn Nữ Đinh Thị Cỏ Hâm</p>
									<span class="position">Chủ tịch liên hiệp nhà máy thuốc
										nổ</span>
								</div>
							</div>
						</div>
						<div class="item">
							<div class="testimony-wrap text-center py-4 pb-5">
								<div class="user-img mb-4"
									style="background-image: url('template/web/images/person_3.jpg')">
								</div>
								<div class="text pt-4">
									<p class="mb-4">Ngoại trừ mọi thứ đều tốt, tôi không gì
										phàn nàn</p>
									<p class="name">Công Tằng Tôn Nữ Đinh Thị Cỏ Hâm</p>
									<span class="position">Chủ tịch liên hiệp nhà máy thuốc
										nổ</span>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section class="ftco-section ftco-no-pt ftco-no-pb">
		<div class="container">
			<div class="row no-gutters">
				<div
					class="col-md-6 p-md-5 img img-2 d-flex justify-content-center align-items-center"
					style="background-image: url('template/web/images/about.jpg');">
				</div>
				<div class="col-md-6 wrap-about py-md-5 ftco-animate">
					<div class="heading-section mb-5 pl-md-5">
						<span class="subheading">Hay từ bây giờ</span>
						<h2 class="mb-4">Hãy chọn chuyến đi cho bạn</h2>

						<p>A small river named Duden flows by their place and supplies
							it with the necessary regelialia. It is a paradisematic country,
							in which roasted parts of sentences fly into your mouth.</p>
						<p>On her way she met a copy. The copy warned the Little Blind
							Text, that where it came from it would have been rewritten a
							thousand times and everything that was left from its origin would
							be the word "and" and the Little Blind Text should turn around
							and return to its own, safe country. But nothing the copy said
							could convince her and so it didn’t take long until a few
							insidious Copy Writers ambushed her, made her drunk with Longe
							and Parole and dragged her into their agency, where they abused
							her for their.</p>
						<p>
							<a href="#" class="btn btn-primary">Search Vehicle</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center mb-5">
				<div class="col-md-7 heading-section text-center ftco-animate">
					<span class="subheading">Blog</span>
					<h2>Blog Nổi bật</h2>
				</div>
			</div>
			<div class="row d-flex">
				<div class="col-md-4 d-flex ftco-animate">
					<div class="blog-entry justify-content-end">
						<a href="blog-single.html" class="block-20"
							style="background-image: url('template/web/images/image_1.jpg');">
						</a>
						<div class="text pt-4">
							<div class="meta mb-3">
								<div>
									<a href="#">July. 24, 2019</a>
								</div>
								<div>
									<a href="#">Admin</a>
								</div>
								<div>
									<a href="#" class="meta-chat"><span class="icon-chat"></span>
										3</a>
								</div>
							</div>
							<h3 class="heading mt-2">
								<a href="#">Why Lead Generation is Key for Business Growth</a>
							</h3>
							<p>A small river named Duden flows by their place and
								supplies it with the necessary regelialia.</p>
						</div>
					</div>
				</div>
				<div class="col-md-4 d-flex ftco-animate">
					<div class="blog-entry justify-content-end">
						<a href="blog-single.html" class="block-20"
							style="background-image: url('template/web/images/image_2.jpg');">
						</a>
						<div class="text pt-4">
							<div class="meta mb-3">
								<div>
									<a href="#">July. 24, 2019</a>
								</div>
								<div>
									<a href="#">Admin</a>
								</div>
								<div>
									<a href="#" class="meta-chat"><span class="icon-chat"></span>
										3</a>
								</div>
							</div>
							<h3 class="heading mt-2">
								<a href="#">Why Lead Generation is Key for Business Growth</a>
							</h3>
							<p>A small river named Duden flows by their place and
								supplies it with the necessary regelialia.</p>
						</div>
					</div>
				</div>
				<div class="col-md-4 d-flex ftco-animate">
					<div class="blog-entry">
						<a href="blog-single.html" class="block-20"
							style="background-image: url('template/web/images/image_3.jpg');">
						</a>
						<div class="text pt-4">
							<div class="meta mb-3">
								<div>
									<a href="#">July. 24, 2019</a>
								</div>
								<div>
									<a href="#">Admin</a>
								</div>
								<div>
									<a href="#" class="meta-chat"><span class="icon-chat"></span>
										3</a>
								</div>
							</div>
							<h3 class="heading mt-2">
								<a href="#">Why Lead Generation is Key for Business Growth</a>
							</h3>
							<p>A small river named Duden flows by their place and
								supplies it with the necessary regelialia.</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<script>
		var s = "${message}";
		if (s != "")
			swal("Thông Báo", "${message}", "info");
	</script>
</body>


</html>