<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/Chung/taglib.jsp"%>

<!DOCTYPE html>

<html>

<head>

<!-- <meta charset="UTF-8"> -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<c:url value='/template/admin/assets/css/bootstrap.min.css' />" />



<title>Quản lý tuyến xe</title>

</head>

<body>
	<form action="/admin/quan-ly-tuyen-xe-2'/>" id="formSubmit"
		method="get">
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
								<table class="table table-bordered" id="dataTableTest" width="100%"
									cellspacing="0">
									<thead>
										<tr>
											<th>Tuyến xe ID</th>
											<th>Tên Tuyến</th>
											<th>Điểm đi</th>
											<th>Điểm đến</th>
											<th>Thời gian di chuyển</th>
											<th>Salary</th>
										</tr>
									</thead>
									<tfoot>
										<tr>
											<th>Tuyến xe ID</th>
											<th>Tên Tuyến</th>
											<th>Điểm đi</th>
											<th>Điểm đến</th>
											<th>Thời gian di chuyển</th>
											<th>Salary</th>
										</tr>
									</tfoot>
									<tbody>
										<c:forEach var="item" items="${model.listResult}">
											<tr>
												<td>${item.tenTuyen}</td>
												<td>${item.diemDi}</td>
												<td>${item.diemDen}</td>
												<td>abcd</td>
												<td>880</td>
												<td>
													<Button>Xoa</Button>
													<button>Sua</button>
												</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								
								<ul class="pagination" id="pagination"></ul>
								<input type="hidden" value="" id="page" name="page" /> <input
									type="hidden" value="" id="limit" name="limit" />
							</div>
						</div>
						<div class="card-footer small text-muted">Updated yesterday
							at 11:59 PM</div>
					</div>

				</div>

				<!-- /.container-fluid -->

				<!-- Sticky Footer -->


			</div>
			<!-- /.content-wrapper -->

		</div>
		<!-- /#wrapper -->
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
						<h5 class="modal-title" id="exampleModalLabel">Ready to
							Leave?</h5>
						<button class="close" type="button" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">×</span>
						</button>
					</div>
					<div class="modal-body">Select "Logout" below if you are
						ready to end your current session.</div>
					<div class="modal-footer">
						<button class="btn btn-secondary" type="button"
							data-dismiss="modal">Cancel</button>
						<a class="btn btn-primary" href="login.html">Logout</a>
					</div>
				</div>
			</div>
		</div>

		<script>
		var totalPages = ${model.page}
		var currentPages = ${model.totalPage}
		$(function() {
			window.pagObj = $('#pagination').twbsPagination({
				totalPages : totalPages,
				visiblePages : 10,
				startPage : currentPages,
				onPageClick : function(event, page) {
					if (currentPage != page) {
 	            		$('#limit').val(2);
 						$('#page').val(page);
						$('#formSubmit').submit();
				}
			});
		});
	</script>
	
	</form>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type='text/javascript'
	src='<c:url value="/template/admin/js/jquery-2.2.3.min.js" />'></script>
		<script
	src="<c:url value='/template/admin/paging/jquery.twbsPagination.js'/>"></script>
</body>
<!-- paping -->

</html>