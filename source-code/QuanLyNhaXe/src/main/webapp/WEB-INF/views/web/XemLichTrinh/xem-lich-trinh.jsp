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
									<table>
										<c:forEach var="item" items="${model.listResult}">
										<tr>
											<td style="width: 100px">${item.bienSoXe}</td>
											<td style="width: 100px">${item.diemDi}</td>
											<td style="width: 100px">${item.diemDen}</td>
											<td style="width: 200px">${item.thoiGian}</td>
											<td style="width: 100px">${item.donGia}</td>
											<td style="width: 100px"><button>ĐẶT VÉ</button></td>
										</tr>
										</c:forEach>
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
</body>
</html>