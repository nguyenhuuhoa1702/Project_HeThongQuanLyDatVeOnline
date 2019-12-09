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
					<form:form action="tim-kiem" method="GET" modelAttribute="model"
						class="request-form ftco-animate"
						style="margin-top: 100px; box-sizing: border-box;">
						<div class="row">
							<div class="col-lg align-items-end">
								<form:form action="tim-kiem" method="GET" modelAttribute="model"
									class="request-form ftco-animate"
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
															<form:input path="ngayDi" type="date" />
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
														TÌM VÉ XE</Button>
												
												</div>
											</div>
										</div>
									</div>
								</form:form>
								<div class="form-group">
									<table>
										<thead>
											<tr>
												<th>Biển số xe</th>
												<th>Nơi đi</th>
												<th>Nơi đón</th>
												<th>Thời gian dự kiến đi</th>
												<th>Đơn giá vé</th>
											</tr>
										</thead>
										<c:forEach var="item" items="${model.listResult}">
											<tbody>
												<tr>
													<td style="width: 150px" id="bienSoXe">${item.bienSoXe}</td>
													<td style="width: 150px" id="diemDi">${item.diemDi}</td>
													<td style="width: 150px" id="diemDen">${item.diemDen}</td>
													<td style="width: 200px" id="thoiGian">${item.thoiGian}</td>
													<td style="width: 160px" id="donGia">${item.donGia}</td>
													<td style="width: 240px">
													<c:url var="updateURL"
															value="/book">
															<c:param name="idLichTrinh" value="${item.idLichTrinh}"></c:param>
														</c:url> <a href='${updateURL}' class="btn btn-primary btn-block">ĐẶT
															VÉ</a></td>
												</tr>
										</c:forEach>
										<tbody>
<%-- 											<form:hidden path="idLichTrinh" id="lichTrinhId" /> --%>
									</table>
								</div>
							</div>
						</div>

						<!-- 						<div class="col-lg align-self-end"> -->
						<!-- 								<div class="form-group"> -->
						<!-- 									<div class="form-field"> -->
						<!-- 										<Button class="form-control btn btn-primary" type="submit">  -->
						<!-- 												DAT VE -->
						<!-- 										</Button> -->
						<!-- 									</div> -->
						<!-- 								</div> -->
						<!-- 							</div> -->
					</form:form>
				</div>
			</div>
		</div>
	</div>
	<!-- 	<script>
//              Lấy đối tượng
//             var button = document.getElementById("btnOK1");
//             // Thêm sự kiện cho đối tượng
//             button.onclick = function()
//             {
//             	//var inputVal = $('input').val();
//             	var id = $('input').val();
//             	window.location.href ="book?idLichTrinh="+id
//             };
            
            
        </script> -->
</body>
</html>