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
        <form>
          <div class="form-group">
<!--             <div class="form-label-group"> -->
              <input type="text" id="tenTuyen" class="form-control" placeholder="Nhập tên tuyến mới" required="required"
               autofocus="autofocus" style="font-size:25px;height:50px;font-family:sans-serif;color:black;">
<!--               <label for="inputTenTuyen">Tên tuyến mới</label> -->
<!--             </div> -->
          </div>
          <div class="form-group">      
              <input type="text" id="diemDi" class="form-control" placeholder="Nhập điểm đi" required="required"
               style="font-size:25px;height:50px;font-family:sans-serif;color:black;" >
          </div>
          <div class="form-group">   
              <input type="text" id="diemDen" class="form-control" placeholder="Nhập điểm đến" required="required"
              style="font-size:25px;height:50px;font-family:sans-serif;color:black;" >         
          </div>
          <a class="btn btn-primary btn-block" href="#">Đồng ý thêm tuyến</a>
        </form>
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