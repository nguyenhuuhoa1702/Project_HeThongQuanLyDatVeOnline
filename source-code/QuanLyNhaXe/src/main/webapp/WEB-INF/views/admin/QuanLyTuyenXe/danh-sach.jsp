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
					<div class="card-body">
						<div class="table-responsive">
							<table class="table table-bordered" id="dataTable" width="100%"
								cellspacing="0">
								<thead>
									<tr>
										<th>ID Tuyến Xe</th>
										<th>Tên Tuyến Xe</th>
										<th>Thao tác</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="item" items="${model.listResult}">
										<tr>
											<td>${item.tuyenXeId}</td>
											<td>${item.tenTuyenXe}</td>
											<td>
												<Button>Xoa</Button>
												<button>Sua</button>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
					<div class="card-footer small text-muted">Đây là một thông báo vớ vẩn nào đó ! Đừng bận tâm</div>
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

</body>

</html>