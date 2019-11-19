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
				<div class="card-header">Giao diện thêm tuyến mới</div>
				<div class="card-body">
					<form:form modelAttribute="model" id ="form" >
						<!--  Nơi lựa chọn loại tuyến xe -->
						<div class="form-group">
							<div class="form-group">
								<label for="tuyenXeId">Chọn tuyến xe</label> \
<!-- 								<select class="form-control" id="tuyenXeId" name ="tuyenXeId"> -->
<!-- 									<option value=""> -- Chọn Tuyến Xe -- </option> -->
<!-- 									var = "item"  items = "attributeName"  -->
<%-- 									<c:forEach var="item" items="${tuyenXe}"> --%>
<%-- 											<option value="${item.id}">${item.tenTuyen}</option> --%>
<%-- 									</c:forEach> --%>
<!-- 								</select> -->
<!-- 								Sử dụng spring form  với yêu cầu truyền cho 1 cái mappig-->
									<form:select path="tuyenXeId" id="tuyenXeId">
										<form:option value="" label="Chọn tuyến xe"/>
										<form:options items = "${tuyenxe}"/>
									</form:select>
							</div>
						</div>
						<!--  Nhập điểm điểm đi -->
						<div class="form-group">
<%-- 							<input type="text" id="diemDi" class="form-control" value="${model.tenChuyen}" --%>
<!-- 								placeholder="Nhập điểm đi" required="required" -->
<!-- 								style="font-size: 25px; height: 50px; font-family: sans-serif; color: black;"> -->
							<form:input path="tenChuyen" cssClass="form-control"/>
						</div>
						<div class="form-group">
							<input type="text" id="diemDen" class="form-control"
								placeholder="Nhập điểm đến" required="required"
								style="font-size: 25px; height: 50px; font-family: sans-serif; color: black;">
						</div>
						<!-- Row tùy chỉnh ngày đi-->
						<div class="form-group">
							<div class="control-group">
								<div class="controls input-append date form_date" data-date=""
									data-date-format="dd MM yyyy" data-link-field="dtp_input2"
									data-link-format="yyyy-mm-dd">
									<input type="text" value="" readonly
										style="width: 85%; height: 50px; font-family: sans-serif; font-size: 20px;"
										placeholder="Chọn ngày dự kiến khởi hành"> <span
										class="add-on" style="height: 50px;"> <i
										class="icon-remove" style="width: 25; margin-top: 10px"></i>
									</span> <span class="add-on" style="height: 50px;"> <i
										class="icon-th" style="width: 25; margin-top: 10px"></i>
									</span>
								</div>
								<input type="hidden" id="dtp_input2" value="" /><br />
							</div>
						</div>
						<!-- Row tùy chỉnh thời gian -->
						<div class="form-group">
							<div class="control-group">
								<!-- 								<label class="control-label">Time Picking</label> -->
								<div class="controls input-append date form_time" data-date=""
									data-date-format="hh:ii" data-link-field="dtp_input3"
									data-link-format="hh:ii">
									<input type="text" value="" readonly
										style="width: 85%; height: 50px; font-family: sans-serif; font-size: 20px;"
										placeholder="Chọn giờ dự kiến khởi hành"> <span
										class="add-on" style="height: 50px;"> <i
										class="icon-remove" style="width: 25; margin-top: 10px"></i>
									</span> <span class="add-on" style="height: 50px;"> <i
										class="icon-th" style="width: 25; margin-top: 10px"></i>
									</span>
								</div>
								<input type="hidden" id="dtp_input3" value="" /><br />
							</div>

						</div>
						<c:if test="${not empty model.id }">
							<Button class="btn btn-primary btn-block" type ="button" id ="btnOK">Đồng ý update thêm tuyến</Button>
						</c:if>
						<c:if test="${empty model.id }">
							<Button class="btn btn-primary btn-block" type ="button" id ="btnOK">Đồng ý thêm tuyến</Button>
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

	<!--  datetime -->
	<!-- datetime -->
	<script type="text/javascript"
		src="<c:url value='/template/datetime/jquery/jquery-1.8.3.min.js'/>"
		charset="UTF-8"></script>
	<script type="text/javascript"
		src="<c:url value='/template/datetime/bootstrap/js/bootstrap.min.js'/>"></script>
	<script type="text/javascript"
		src="<c:url value='/template/datetime/js/bootstrap-datetimepicker.js'/>"
		charset="UTF-8"></script>
	<script type="text/javascript"
		src="<c:url value='/template/datetime/js/locales/bootstrap-datetimepicker.fr.js'/>"
		charset="UTF-8"></script>
	<script type="text/javascript">
		$('.form_date').datetimepicker({
			format : 'dd/mm/yyyy',
			language : 'vi',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			minView : 2,
			forceParse : 0
		});
		$('.form_time').datetimepicker({
			language : 'vi',
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
	
	<script>
		$('#btnOK').click(function e)
		{
			e.preventDefault();
			var formData = $('#form').serializeArray();
			console.log(formData);
		});
	</script>

</body>

</html>