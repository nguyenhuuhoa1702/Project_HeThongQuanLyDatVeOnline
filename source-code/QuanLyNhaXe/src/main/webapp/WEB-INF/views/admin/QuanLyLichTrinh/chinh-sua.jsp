<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/Chung/taglib.jsp"%>

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
					<form:form modelAttribute="model" id="form">
						
						<!--  Nơi lựa chọn loại tuyến xe -->
						<div class="form-group">
							<div class="form-group">
								<label for="tuyenXeId">Chọn tuyến xe</label>
								<form:select path="tuyenXeId" id="tuyenXeId">
									<form:option value="" label="Chọn tuyến xe" />
									<form:options items="${tuyenXe}" />
								</form:select>
							</div>
						</div>
						
						
						<div class="form-group">
							<label> Ngày đi </label>
							<!-- Path gồm 2 chức năng của name (để kết nối) và value (để hiển thị) -->
							<form:input path="ngayDi" cssClass="form-control" />
						</div>
						<div class="form-group">
							<label> Thời gian đi</label>
							<form:input path="thoiGian" cssClass="form-control" />
						</div>
						
						<!-- Lựa chọn nút -->
						<c:if test="${not empty model.id }">
							<Button class="btn btn-primary btn-block" type="button"
								id="btnOK">Đồng ý update thêm tuyến</Button>
						</c:if>
						<c:if test="${empty model.id }">
							<Button class="btn btn-primary btn-block" type="button"
								id="btnOK">Đồng ý thêm tuyến 1</Button>
						</c:if>
					</form:form>
				</div>
			</div>
		</div>
	</div>
	<script>
		$('#btnOK').click(function (e))
		{
			e.preventDefault();
			var formData = $('#form').serializeArray();
			console.log(formData);
		});
	</script>

</body>

</html>