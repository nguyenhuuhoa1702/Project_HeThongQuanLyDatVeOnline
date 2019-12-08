<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/Chung/taglib.jsp"%>
<c:url var="tuyenAPI" value="/api/tuyenXe" />
<c:url var="tuyenURL" value="/admin/quan-ly-tuyen-xe/danh-sach" />
<c:url var="chinhsuaURL" value="/admin/quan-ly-tuyen-xe/chinh-sua" />
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
				<div class="card-header">Giao diện thêm tuyến mới</div>
				<div class="card-body">
					<c:if test="${not empty message }">
						<div class="alert alert-${alert}">${message}</div>
					</c:if>
<%-- 					<c:if test="${not empty notiError }"> --%>
						<div class="alert alert-danger" style="display:none" id="notiError"></div>
<%-- 					</c:if> --%>
					<form:form modelAttribute="model" id="formSubmit">
						<div class="form-group">
							<form:input path="maTuyenXe" class="form-control"
								placeholder="Nhập mã tuyến mới" autofocus="autofocus" />
						</div>
						<div class="form-group">
							<form:input path="tenTuyenXe" class="form-control"
								placeholder="Nhập tên tuyến mới" />
						</div>
						<form:hidden path="tuyenXeId" id="tuyenXeId" />
						<c:if test="${empty model.tuyenXeId }">
							<Button class="btn btn-primary btn-block" id="btnOK">
								Đồng ý thêm tuyến</Button>
						</c:if>
						<c:if test="${not empty model.tuyenXeId }">
							<Button class="btn btn-primary btn-block" id="btnOK">
								Cập nhật tuyến xe</Button>
						</c:if>
					</form:form>
				</div>
			</div>
		</div>
	</div>


	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="login.html">Logout</a>
				</div>
			</div>
		</div>
	</div>

	<script>
		$('#btnOK').click(function(e) {
			e.preventDefault();
			var data = {};
			var formData = $('#formSubmit').serializeArray();
			$.each(formData, function(i, v) {
				data["" + v.name + ""] = v.value;
			});
			var id = $('#tuyenXeId').val();
			if (id == "") {
				addNew(data);
			} else {
				updateNew(data);
			}
		});

		function addNew(data) {
			$.ajax({
				url : '${tuyenAPI}',
				type : 'POST',
				contentType : 'application/json',
				data : JSON.stringify(data),
				dataType : 'json',
//	 				success : function(result) {
// 					window.location.href = "${chinhsuaURL}?id=" + result.id
// 							+ "&message=insert_success";
	// 				},
					success : function(result) {
						window.location.href = "${tuyenURL}?message=insert_success";
					},
					error : function(error) {
						//console.log(error);
						//window.location.href = "${chinhsuaURL}";
					},
					complete:  function(xhr, textStatus) {
						if(xhr.status==403){
							$('#notiError').html('Tên mã hoặc tuyến xe đã tồn tại');
						}
						if(xhr.status==423)
							$('#notiError').html('Nhập đầy đủ thông tin !!!');
						document.getElementById("notiError").style.display = 'block'
						console.log(textStatus);
					}
				});
		}

		function updateNew(data) {
			$.ajax({
				url : '${tuyenAPI}',
				type : 'PUT',
				contentType : 'application/json',
				data : JSON.stringify(data),
				dataType : 'json',
				success : function(result) {
					window.location.href = "${chinhsuaURL}?id="
							+ result.tuyenXeId + "&message=update_success";
				},
				error : function(error) {
					console.log(error);
// 					window.location.href = "${chinhsuaURL}" + result.tuyenXeId
// 							+ "&message=error_system";
				},
				complete:  function(xhr, textStatus) {
					if(xhr.status==403){
						$('#notiError').html('Tên mã hoặc tuyến xe đã tồn tại');
					}
					if(xhr.status==423)
						$('#notiError').html('Nhập đầy đủ thông tin !!!');
					document.getElementById("notiError").style.display = 'block'
					console.log(textStatus);
				}
			});
		}
	</script>

</body>

</html>