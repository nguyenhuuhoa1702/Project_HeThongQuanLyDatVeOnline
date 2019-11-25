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
					<form:form modelAttribute="model" id="formSubmit" role="form"
						action="check" method="POST">

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
						<form:hidden path="id" id="lichTrinhId" />
						<!-- Lựa chọn nút -->
						<div class="form-group">
							<c:if test="${not empty model.id }">
								<Button class="btn btn-primary btn-block" type="button"
									id="btnOK1">Đồng ý update thêm tuyến API</Button>
								<Button class="btn btn-primary btn-block" type="submit">Đồng
									ý update thêm tuyến controller</Button>
							</c:if>
							<c:if test="${empty model.id }">
								<Button class="btn btn-primary btn-block" type="button"
									id="btnOK1">Đồng ý thêm tuyến 1</Button>
								<Button type="submit">Đồng ý thêm tuyến controller</Button>
							</c:if>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
	<script>
		$('#btnOK1').click(function(e) {
			e.preventDefault();
			var data = {};
			var formData = $('#formSubmit').serializeArray();
			$.each(formData, function(i, v) {
				data["" + v.name + ""] = v.value;
			});
			var id = $('#lichTrinhId').val();
			if (id == "") {
				addNew(data);
			} else {
				updateNew(data);
			}
		});

		function addNew(data) {
			$.ajax({
				url : '${newAPI}',
				type : 'POST',
				contentType : 'application/json',
				data : JSON.stringify(data),
				dataType : 'json',
				success : function(result) {
					window.location.href = "${chinhsuaURL}?id="+result.id+"&message=insert_success";
				},
				error : function(error) {
					window.location.href = "${newURL}?message=error_system";
				}
			});
		}

		function updateNew(data) {
			$.ajax({
				url : '${newAPI}',
				type : 'PUT',
				contentType : 'application/json',
				data : JSON.stringify(data),
				dataType : 'json',
				success : function(result) {
					window.location.href = "${chinhsuaURL}?id="+result.id+"&message=update_success";
				},
				error : function(error) {
					console.log(error);
					window.location.href = "${chinhsuaURL}"+result.id+"&message=error_system";
				}
			});
		}
	</script>
</body>

</html>