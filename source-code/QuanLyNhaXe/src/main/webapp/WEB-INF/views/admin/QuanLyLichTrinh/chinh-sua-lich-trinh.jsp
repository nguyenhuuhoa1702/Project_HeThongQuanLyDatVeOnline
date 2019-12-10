<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/Chung/taglib.jsp"%>
<c:url var="newAPI" value="/api/new" />
<c:url var="newURL" value="/admin/quan-ly-lich-trinh/danh-sach" />
<c:url var="chinhsuaURL" value="/admin/quan-ly-lich-trinh/chinh-sua" />
<c:url var="newURLloi" value="/admin" />
<!DOCTYPE html>

<html>

<head>
<meta charset="UTF-8">
<title>Quản lý tuyến xe</title>
</head>
<body>
	<div id="wrapper">
		<!-- Sidebar -->
		<%@ include file="/Chung/admin/menu.jsp"%>

		<div class="container">
			<div class="card card-login mx-auto mt-5">
				<div class="card-header">Giao diện thêm lịch trình mới</div>
				<div class="card-body">
					<c:if test="${not empty message }">
						<div class="alert alert-${alert}">${message}</div>
					</c:if>

					<div class="alert alert-danger" style="display: none"
						id="notiError"></div>

					<form:form modelAttribute="model" id="formSubmit" role="form">
<%-- 					<form:form modelAttribute="model" id="formSubmit" role="form" --%>
<%-- 						action="check" method="POST">						 --%>

						<div class="form-group">
							<div class="form-group">
								<div>
									<label for="tuyenXeId">Chọn xe</label>
								</div>
								<div>
									<form:select path="bienSoXe" id="xe" style="width:100%">
										<form:option value="null" label="Chọn xe" />
										<form:options items="${xe}" />
									</form:select>
								</div>
							</div>
						</div>
						<!--  Nơi lựa chọn vị trí tuyến đi -->
						<div class="form-group">
							<div class="form-group">
								<div>
									<label>Chọn điểm đi</label>
								</div>
								<div>
									<form:select path="diemDi" id="diemDi" style="width:100%">
										<form:option value="" label="Chọn điểm đi dự kiến" />
										<form:options items="${tuyenXe}" />
									</form:select>
								</div>
							</div>
						</div>
						<!--  Hiển thị vị trí điểm đến  -->
						<div class="form-group">
							<div class="form-group">
								<div>
									<label>Chọn điểm đến</label>
								</div>
								<div>
									<form:select path="diemDen" id="diemDen" style="width:100%">
										<form:option value="" label="Chọn điểm đến dự kiến" />
										<form:options items="${tuyenXe}" />
									</form:select>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label> Ngày đi </label>
							<!-- Path gồm 2 chức năng của name (để kết nối) và value (để hiển thị) -->
							<form:input path="ngayDi" value="2019-12-07" type="date"
								min="1979-12-31" max="2030-01-02" cssClass="form-control" />
						</div>
						<div class="form-group">
							<div>
								<label> Thời gian đi</label>
							</div>
							<div class="controls input-append date form_time" data-date=""
								data-date-format="hh:ii:00" data-link-field="dtp_input3"
								data-link-format="hh:ii">
								<form:input size="16" type="text" path="thoiGian" readonly="true" style="width:100%" /> <span
									class="add-on"><i class="icon-remove"></i></span> <span
									class="add-on"><i class="icon-th"></i></span>
							</div>
						</div>
						<div class="form-group">
							<div>
								<label> Thời gian đến</label>
							</div>
							<div class="controls input-append date form_time" data-date=""
								data-date-format="hh:ii:00" data-link-field="dtp_input3"
								data-link-format="hh:ii">
								<form:input size="16" type="text" path="thoiGianDen" readonly="true" style="width:100%" /> <span
									class="add-on"><i class="icon-remove"></i></span> <span
									class="add-on"><i class="icon-th"></i></span>
							</div>
						</div>
						<div class="form-group">
							<label for="donGia"> Đơn giá vé (VNĐ) </label>
							<form:input path="donGia" value="99000" type="number"
								required="required" cssClass="form-control" />
						</div>


						<form:hidden path="idLichTrinh" id="lichTrinhId" />


						<!-- Lựa chọn nút -->
						<div class="form-group">
							<c:if test="${not empty model.idLichTrinh }">
								<Button class="btn btn-primary btn-block" type="button"
									id="btnOK1">Đồng ý update thêm tuyến API</Button>
								<!-- 								<Button class="btn btn-primary btn-block" type="submit">Đồng -->
								<!-- 									ý update thêm tuyến controller</Button> -->
							</c:if>
							<c:if test="${empty model.idLichTrinh }">
								<Button class="btn btn-primary btn-block" type="button"
									id="btnOK1">Đồng ý thêm lịch trình</Button>
								<!-- 								<Button type="submit">Đồng ý thêm tuyến controller</Button> -->
							</c:if>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
	<!-- 	<script> -->
	<!-- // 		$(function() { -->
	<!-- // 			$('#datetimepicker3').datetimepicker({ -->
	<!-- // 				format : 'LT' -->
	<!-- // 			}); -->
	<!-- // 		}); -->
	<!-- 	</script> -->
	<script>
		$('#btnOK1').click(function(e) {
			e.preventDefault();
			var data = {};
			var formData = $('#formSubmit').serializeArray();
			$.each(formData, function(i, v) {
				data["" + v.name + ""] = v.value;
			});
			var id = $('#lichTrinhId').val();
			// xử lý ngoại lệ ở đây sao ???

			if (id == "") {
				addNew(data);
			} else {
				updateNew(data);
			}
		});

		function addNew(data) {
			$
					.ajax({
						url : '${newAPI}',
						type : 'POST',
						contentType : 'application/json',
						data : JSON.stringify(data),
						dataType : 'json',
						// 				success : function(result) {
						// 					window.location.href = "${chinhsuaURL}?id=" + result.id
						// 							+ "&message=insert_success";
						// 				},
						success : function(result, textStatus, xhr) {
							//if(xhr.status=200) alert("Thanh cong");
							window.location.href = "${chinhsuaURL}?id="
									+ result.idLichTrinh
									+ "&message=insert_success";
						},
						error : function(error) {
							console.log(error);
							//window.location.href = "${chinhsuaURL}?message=error_system";
						},
						complete : function(xhr, textStatus) {
							if (xhr.status == 403) {
								$('#notiError').html(
										'Nơi đi và đến không được trùng');
							}
							if (xhr.status == 401) {
								$('#notiError').html(' Xe này đã được sử dụng');
							}
							if (xhr.status == 423)
								$('#notiError').html(
										'Vui lòng nhập đầy đủ thông tin !!!');
							if (xhr.status == 509)
								$('#notiError').html(
										'Vui lòng nhập đơn giá vé hợp lệ !!!');
							document.getElementById("notiError").style.display = 'block'
							console.log(textStatus);
						}
					});
		}

		function updateNew(data) {
			$
					.ajax({
						url : '${newAPI}',
						type : 'PUT',
						contentType : 'application/json',
						data : JSON.stringify(data),
						dataType : 'json',
						success : function(result) {
							window.location.href = "${chinhsuaURL}?id="
									+ result.idLichTrinh
									+ "&message=update_success";
						},
						error : function(error) {
							console.log(error);
							// 					window.location.href = "${chinhsuaURL}"
							// 							+ result.idLichTrinh + "&message=error_system";
						},
						complete : function(xhr, textStatus) {
							if (xhr.status == 403) {
								$('#notiError').html('Nơi đi và đến không được trùng');
							}
							if (xhr.status == 401) {
								$('#notiError').html(' Xe này đã được sử dụng');
							}
							if (xhr.status == 423)
								$('#notiError').html('Vui lòng nhập đầy đủ thông tin !!!');
							if (xhr.status == 509)
								$('#notiError').html('Vui lòng nhập đơn giá vé hợp lệ !!!');
							document.getElementById("notiError").style.display = 'block'
							console.log(textStatus);
						}
					});
		}

		$('.form_time').datetimepicker({
			language : 'fr',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 1,
			minView : 0,
			maxView : 1,
			forceParse : 0
		});
	</script>
</body>

</html>