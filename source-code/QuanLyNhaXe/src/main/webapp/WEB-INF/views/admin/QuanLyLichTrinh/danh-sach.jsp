<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/Chung/taglib.jsp"%>
<c:url var="newAPI" value="/api/new" />
<c:url var="newURL" value="/admin/quan-ly-lich-trinh/danh-sach" />
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

		<div id="content-wrapper">
			<div class="container-fluid">
				<!-- Breadcrumbs-->
				<!-- Icon Cards-->
				<!-- Area Chart Example-->
				<!-- DataTables Example -->
				<div class="card mb-3">
					<div class="card-header">
						<i class="fas fa-table"></i> Danh sách tuyến xe

					</div>

					<c:if test="${not empty message}">
						<div class="alert alert-${alert}">${message}</div>
					</c:if>

					<div class="card-body">
						<div class="table-responsive">
							<table class="table table-bordered" id="dataTableLichTrinh"
								width="100%" cellspacing="0">
								<thead>
									<tr>
										<th><input type="checkbox" id="checkAll"></th>
										<th>ID Lịch Trình</th>
										<th>Biển Số Xe </th>
										<th>Điểm đi</th>
										<th>Điểm đến</th>
										<th>Ngày Đi</th>
										<th>Thời gian đi</th>
										<th>Thao tác</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="item" items="${model.listResult}">
										<tr>
											<td><input type="checkbox" id="checkbox_${item.idLichTrinh}"
												value="${item.idLichTrinh}"></td>
											<td>${item.idLichTrinh}</td>
											<td>${item.bienSoXe}</td>
											<td>${item.diemDi}</td>
											<td>${item.diemDen}</td>
											<td>${item.ngayDi}</td>
											<td>${item.thoiGian}</td>
											<td>
												<Button onclick="warningBeforeDelete()" type="button">Xóa</Button>

												<c:url var="updateURL"
													value="/admin/quan-ly-lich-trinh/chinh-sua">
													<c:param name="id" value="${item.idLichTrinh}"></c:param>
												</c:url> <a href='${updateURL}'>Cập nhật</a>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
					<c:url var="themURL" value="/admin/quan-ly-lich-trinh/chinh-sua" />
					<div>
						<a href='${themURL}'>Thêm</a>
					</div>

					<div class="card-footer small text-muted">Đây là một thông
						báo vớ vẩn nào đó ! Đừng bận tâm</div>
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
		function warningBeforeDelete() {
			swal({
				title : "Xác nhận xóa",
				text : "Bạn có chắc chắn muốn xóa hay không",
				type : "warning",
				showCancelButton : true,
				confirmButtonClass : "btn-success",
				cancelButtonClass : "btn-danger",
				confirmButtonText : "Xác nhận",
				cancelButtonText : "Hủy bỏ",
			}).then(
					function(isConfirm) {
						if (isConfirm) {
							var ids = $('tbody input[type=checkbox]:checked')
									.map(function() {
										return $(this).val();
									}).get();
							deleteData(ids);
						}
					});
		}
		function deleteData(data) {
	        $.ajax({
	            url: '${newAPI}',
	            type: 'DELETE',
	            contentType: 'application/json',
	            data: JSON.stringify(data),
	            success: function (result) {
	                window.location.href = "${newURL}?message=delete_success";
	            },
	            error: function (error) {
	            	window.location.href = "${newURL}?message=error_system";
	            }
	        });
	    }
	</script>


</body>

</html>