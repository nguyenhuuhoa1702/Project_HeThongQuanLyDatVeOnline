<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">
<link rel="stylesheet" href="<c:url value='/template/admin/assets/css/bootstrap.min.css' />" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type='text/javascript'
	src='<c:url value="/template/admin/js/jquery-2.2.3.min.js" />'></script>
		<script
	src="<c:url value='/template/admin/paging/jquery.twbsPagination.js'/>"></script>
<title>Home Page</title>

</head>

<body>
	<div class="container">
		<nav aria-label="Page navigation">
			<ul class="pagination" id="pagination"></ul>
		</nav>
	</div>
	<script type="text/javascript">
		$(function() {
			window.pagObj = $('#pagination').twbsPagination({
				totalPages : 35,
				visiblePages : 10,
				onPageClick : function(event, page) {
					console.info(page + ' (from options)');
				}
			}).on('page', function(event, page) {
				console.info(page + ' (from event listening)');
			});
		});
	</script>
</body>

</html>