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

</head>
<body>


	<br>

	<div class="row">

		<div class="container">
			<h3 class="text-center">Danh sách giảng viên</h3>
			<hr>
			<div class="container text-left">
				<a href="javascript:history.go(-1);" class="btn btn-primary">Quaylại</a>
				<a href="<%=request.getContextPath()%>/AddTeacher"
					class="btn btn-success">Thêm giảng viên</a>
					<a href="<%=request.getContextPath()%>/BieuDoCaseServlet"
					class="btn btn-success">Biểu đồ cây</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Tên</th>
						<th>Giới tính</th>
						<th>Số điện thoại</th>
						<th>Chức vụ</th>
						<th>Email</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach var="teacher" items="${teachers}">
						<tr>
							<td>${teacher.name}</td>
							<td>${teacher.gender}</td>
							<td>${teacher.phoneNumber}</td>
							<td>${teacher.position}</td>
							<td>${teacher.email}</td>
							<td><a
								href="ShowTeacherServlet?id=<c:out value='${teacher.id}' />">Sửa</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="DeleteTeacher?id=<c:out value='${teacher.id}' />">Xóa</a></td>
						</tr>
					</c:forEach>

				</tbody>

			</table>
		</div>
	</div>
</body>
</html>