<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/Chung/taglib.jsp"%>
<c:url var="newAPI" value="/api/new" />
<c:url var="newURL" value="/admin/quan-ly-lich-trinh/danh-sach" />
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Quản lý lịch trình</title>

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
						<i class="fas fa-table"></i> Danh sách lịch trình

					</div>

					<c:if test="${not empty message}">
						<div class="alert alert-${alert}">${message}</div>
					</c:if>

					<div class="card-body">
						<div class="table-responsive">
							<table class="table table-bordered" id="dataTableLichTrinh"
								width="100%" cellspacing="0" 
								style= "cursor: pointer;
										 
										text-align: center;">
								<thead>
									<tr>
										<th id="checkbox" style="width:0px;vertical-align:middle;display: none;"><input type="checkbox"
											id="checkAll"></th>
										<th style="width: 10px;vertical-align: middle;">ID</th>
										<th style="width: 120px;vertical-align: middle;">Biển Số Xe</th>	
										<th style="width: 100px;vertical-align: middle;">Điểm đi</th>
										<th style="width: 100px;vertical-align: middle;"> Thời gian đi</th>						
										<th style="width: 100px;vertical-align: middle;">Điểm đến</th>
										<th style="width: 100px;vertical-align: middle;">Thời gian đến</th>
										<th style="width: 100px;vertical-align: middle;">Ngày Đi</th>
										<th style="width: 50px;vertical-align: middle;">Đơn giá vé</th>
										<th style="width: 10px;vertical-align: middle;">Ghế Trống</th>
										<th style="vertical-align: middle;">Thao tác</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="item" items="${model.listResult}">
										<tr>
											<td id="checkbox-2" style="width:1px;vertical-align:middle;display: none;"><input type="checkbox"
												id="checkbox_${item.idLichTrinh}"
												value="${item.idLichTrinh}"></td>
											<td style="width: 10px;vertical-align: middle;">${item.idLichTrinh}</td>
											<td style="vertical-align: middle;">${item.bienSoXe}</td>
											<td style="vertical-align: middle;">${item.diemDi}</td>
											<td style="vertical-align: middle;">${item.thoiGian}</td>
											<td style="vertical-align: middle;">${item.diemDen}</td>	
											<td style="vertical-align: middle;">${item.thoiGianDen}</td>
											<td style="vertical-align: middle;">${item.ngayDi}</td>
											<td style="vertical-align: middle;">${item.donGia}</td>
											<td style="vertical-align: middle;">${item.gheTrong}</td>
											<td style="width: 175px;">
												<div style="float: left;">
												<Button onclick="warningBeforeDelete()" type="button"
													class="btn btn-primary btn-block">Xóa</Button> 
												</div>
												<div style="float: left;"> &nbsp;  </div>
												<div style="float: left;">	
													<c:url var="updateURL" value="/admin/quan-ly-lich-trinh/chinh-sua">
														<c:param name="id" value="${item.idLichTrinh}"></c:param>
													</c:url>
													<a href='${updateURL}' class="btn btn-primary btn-block">
														Cập nhật
													</a>
												</div>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
					<c:url var="themURL" value="/admin/quan-ly-lich-trinh/chinh-sua" />
<!-- 					<div> -->
<!-- 						<button id="abc">abc</button> -->
<!-- 					</div> -->

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
							var ids = $('tbody input[type=checkbox]:checked').map(function() {
										return $(this).val();
									}).get();
							deleteData(ids);
						}
					});
		}
		function deleteData(data) {
			$.ajax({
				url : '${newAPI}',
				type : 'DELETE',
				contentType : 'application/json',
				data : JSON.stringify(data),
				success : function(result) {
					window.location.href = "${newURL}?message=delete_success";
				},
				error : function(error) {
					window.location.href = "${newURL}?message=error_system";
				}
			});
		}
		document.getElementById('btnDeleteALot').onclick = function(e) {
				document.getElementById("checkbox").style.display = 'block'
				document.getElementById("checkbox-2").style.display = 'block'
						
		}
	</script>
</body>
</html>