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
		<div class="container" style="font-size: 16px">
			<div class="">
				<div class="">
					<br> <br>
					<form:form action="xu-ly-tim-kiem" method="GET"
						modelAttribute="model" class="request-form ftco-animate"
						style="	margin-top: 100px; 
								box-sizing: border-box;
<%-- 								background-image: url('template/web/images/route-no-schedule.png'); --%>
<%-- 								background-position: center center; --%>
<%--     							background-size: cover;  --%>
    							">
						<div class="row">
							<div class="col-lg align-items-end">
								<form:form action="tim-kiem" method="GET" modelAttribute="model"
									class="request-form ftco-animate"
									style="margin-top: 100px; box-sizing: border-box;
									">
									<div class="row">
										<div class="col-lg align-items-end" style="width: 230px">
											<div class="form-group" style="width: 230px">
												<div class="form-group" style="width: 230px" >
													<label for="tuyenXeId">Chọn điểm đi </label>

													<form:select path="diemDi" id="diemdi" 
														style="text-align:center;">
														<form:option value="null" label="Chọn nơi đi" />
														<form:options items="${tuyenXe}" />
													</form:select>

												</div>
											</div>
										</div>
										<div class="col-lg align-items-end" style="width: 260px">
											<div class="form-group" style="width: 260px">
												<div class="form-group" style="width: 260px">

													<label for="tuyenXeId"> Chọn điểm đến </label>

													<form:select path="diemDen" id="diemDen"
														style="text-align:center">
														<form:option value="null" label="Chọn nơi đến" />
														<form:options style="text-align:center" items="${tuyenXe}" />
													</form:select>

												</div>
											</div>
										</div>
										<div class="col-lg align-items-end" style="width: 350px">
											<div class="form-group" style="width: 350px">
												<div class="form-group" style="width: 350px">
													<label>Chọn ngày đi </label>

													<form:input path="ngayDi"
														style="width:200px;text-align:center" type="date" />

												</div>

											</div>
										</div>
										<div class="col-lg align-self-end">
											<div class="form-group" style="width: 20px">
												<Button class="w3-button w3-yellow w3-border"
													style="margin-left: 100px" type="submit">TÌM VÉ XE
												</Button>
											</div>
										</div>
									</div>
								</form:form>
								<div class="form-group">
									<table style="vertical-align: middle; text-align: center;" class="table table-hover">
										<thead>
											<tr class="w3-blue">
												<th style="width: 150px;">Biển số xe</th>
												<th style="width: 150px">Điểm đi</th>
												<th style="width: 200px">Thời gian đi</th>
												<th style="width: 150px">Điểm đến</th>
												<th style="width: 200px">Thời gian đến</th>
												<th style="width: 160px">Đơn giá vé</th>
												<th style="width: 160px">Còn Trống</th>
												<th style="width: 100px"></th>
											</tr>
										</thead>
										<c:forEach var="item" items="${model.listResult}">
											<tbody>
												<tr style="border-top: 1px solid blue;">
													<td style="width: 150px;">${item.bienSoXe}<br> <a
														href="#">Xem chi tiết</a></td>
													<td style="width: 150px">${item.diemDi}</td>
													<td style="width: 200px">${item.thoiGian}</td>
													<td style="width: 150px">${item.diemDen}</td>
													<td style="width: 200px">${item.thoiGianDen}</td>
													<td style="width: 160px">${item.donGia}</td>
													<td style="width: 160px">${item.gheTrong}</td>
													<td style="width: 100px"><c:url var="updateURL"
															value="/book">
															<c:param name="idLichTrinh" value="${item.idLichTrinh}"></c:param>
														</c:url> <a href='${updateURL}'
														class="w3-button w3-white w3-border w3-border-red w3-round-large"
														style="background-color: LightSalmon;"> ĐẶT VÉ </a></td>
												</tr>
										</c:forEach>
										<tbody>
											<%-- 											<form:hidden path="idLichTrinh" id="lichTrinhId" /> --%>
											<tr>
												<td colspan="8" style="">
													<ul
														style="text-align: center; margin-left: 150px; margin-top: 30px; height: 1px; font-size: 10px;"
														id="pagination-demo" class="pagination-lg"></ul>
												</td>
											</tr>
									</table>
								</div>
							</div>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
	<script>
		$('#pagination-demo').twbsPagination({
			totalPages : 50,
			visiblePages : 5,
			first : 'Trang Đầu',
			prev : 'Trước',
			next : 'Tiếp',
			last : 'Trang cuối',
		});
		
		$(function(){
		    $('tr').hover(function(){
		        $(this).toggleClass('active');
		    });
		});
	</script>
	
<script>

</script>
</body>
<style>
table {
	tr:hover {
    	background: yellow;
		}
	}
.active { color: red; }
</style>
</html>
