<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="styles.css">
<style type="text/css">
.graduation-status {
	position: relative;
}

.status-icon {
	width: 20px;
	height: 20px;
	position: absolute;
	top: 50%;
	right: 138px;
	transform: translateY(-50%);
	background-size: cover;
}

[data-status="true"] {
	color: green;
}

[data-status="true"] .status-icon {
	background-image: url('view/image/check.png');
	/* Đường dẫn đến hình ảnh của icon tích xanh */
}
</style>
</head>
<body>


	<br>

	<div class="row">

		<div class="container">
			<h3 class="text-center">Danh sách sinh viên</h3>
			<hr>
			<div class="container text-left">
				<a href="javascript:history.go(-1);" class="btn btn-primary">Quay lại</a>
				<!-- Nút quay lại -->
				<a
					href="<%=request.getContextPath()%>/AddStudentServlet?khoa=${khoa}"
					class="btn btn-success">Thêm sinh viên</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Mã sinh viên</th>
						<th>Tên sinh viên</th>
						<th>Giới tính</th>
						<th>Địa chỉ</th>
						<th>Trạng thái tốt nghiệp</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach var="student" items="${students}">
						<tr>
							<td>${student.studentId}</td>
							<td>${student.name}</td>
							<td>${student.gender}</td>
							<td>${student.address}</td>
							<td class="graduation-status"
								data-status="${student.graduationStatus}"
								style="text-align: center; vertical-align: middle;"><c:if
									test="${student.graduationStatus}">
									<span class="status-icon">&nbsp;</span>
								</c:if></td>
							<td><a
								href="ShowStudentServlet?khoa=${khoa}&id=<c:out value='${student.studentId}' />">Sửa</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="DeleteStudent?khoa=${khoa}&id=<c:out value='${student.studentId}' />">Xóa</a></td>
						</tr>
					</c:forEach>

				</tbody>

			</table>
		</div>
	</div>
</body>
</html>