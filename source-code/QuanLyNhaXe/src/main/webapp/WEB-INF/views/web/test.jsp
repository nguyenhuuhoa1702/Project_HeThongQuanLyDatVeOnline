\<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/Chung/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Xác nhận thanh toán</title>
<style>
input[type='checkbox'] {
	margin-right: 7px;
	line-height: 12px;
	display: none; &+ label { width : auto;
	color: #333; span { display : inline-block;
	width: 13px;
	height: 12px;
	margin: -2px 5px 0 0;
	vertical-align: middle;
	background: url('template/web/images/person_4.jpg'); left top no-repeat;
	cursor: pointer;
}

}
}
input[type="checkbox"]:checked { &+label { span { background:url('template/web/images/person_4.jpg');
	-13px top no-repeat;
	
}
}
}
</style>
</head>
<body>
	<div class="hero-wrap"
		style="background-image: url('template/web/images/bg_1.jpg');"
		data-stellar-background-ratio="0.5">
		<div class="overlay"></div>
		<div class="container">
			<div class="">
				<div class="">
					<br> <br>
					<form class="request-form ftco-animate" action="test-2"
						method="post" style="margin-top: 100px; box-sizing: border-box;">
						<div class="row">
							<div class="col-lg align-items-end">
								<div class="form-group">
									<div>
										<input type="checkbox" name="abc" value="A1"> ABC
										<input type="checkbox" name="abc" value="A1"> ABC
										<button type="submit">ok</button>
									</div>
									<div style="display: none;" id="notiError-5">abc</div>
									<input type="checkbox" id="action" value="1" /> <label>Bạn
										có thích blog freetuts.net không?</label>

									<script>
										document.getElementById('action').onclick = function(
												e) {
											if (this.checked) {
												alert("Bạn vừa thích freetuts.net");
												document.getElementById("notiError-5").style.display = 'block'
											} else {
												alert("Bạn vừa bỏ thích freetuts.net");
												document.getElementById("notiError-5").style.display = 'none'

											}
										};
									</script>
								</div>
							</div>
						</div>

						<div>------------------------------------------------------------</div>







					</form>


				</div>
			</div>

		</div>
	</div>
	<script>
		$('#pagination-demo').twbsPagination({
			totalPages : 50,
			visiblePages : 5
		});
	</script>
</body>

</html>
