//// Call the dataTables jQuery plugin
//$(document).ready(function() {
//  $('#dataTable').DataTable();
//});

$(document).ready(
		function() {
			$('#dataTable').DataTable(
					{
						"language" : {
							"lengthMenu" : 'Hiển thị <select >'
									+ '<option selected="selected" value="2">2</option>'
									+ '<option value="5">5</option>'
									+ '<option value="10">10</option>'
									+ '<option value="25">25</option>'
									+ '<option value="50">50</option>'
									+ '<option value="-1">All</option>'
									+ '</select> kết quả ||  '
									+ '<a href="../quan-ly-tuyen-xe/chinh-sua" > Thêm tuyến mới </a>'
						}
					});
		});

$(document).ready(
		function() {
			$('#dataTableLichTrinh').DataTable(
					{
						"language" : {
							"lengthMenu" : 'Hiển thị <select >'
									+ '<option selected="selected" value="2">2</option>'
									+ '<option value="5">5</option>'
									+ '<option value="10">10</option>'
									+ '<option value="25">25</option>'
									+ '<option value="50">50</option>'
									+ '<option value="-1">All</option>'
									+ '</select> kết quả ||  '
									+ '<a href="../quan-ly-lich-trinh/chinh-sua" > Thêm chuyến mới </a>'
						}
					});
		});

$(document).ready(
		function() {
			$('#dataTableTest').DataTable(
					{
						"language" : {
							"lengthMenu" : 'Hiển thị <select >'
									+ '<option selected="selected" value="2">2</option>'
									+ '<option value="5">5</option>'
									+ '<option value="10">10</option>'
									+ '<option value="25">25</option>'
									+ '<option value="50">50</option>'
									+ '<option value="-1">All</option>'
									+ '</select> kết quả '
						}
					});
		});

