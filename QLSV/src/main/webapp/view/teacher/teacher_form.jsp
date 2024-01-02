

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
</head>
<body>


	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${teacher != null}">
					<form action="UpdateTeacher" method="post" accept-charset="UTF-8">
				</c:if>
				<c:if test="${teacher == null}">
					<form action="AddTeacher" method="post" accept-charset="UTF-8">
				</c:if>

				<caption>
					<h2>
						<c:if test="${teacher != null}">
            			Chỉnh sửa giảng viên
            		</c:if>
						<c:if test="${teacher == null}">
            			Thêm mới giảng viên
            		</c:if>
					</h2>
				</caption>

				<c:if test="${teacher != null}">
					<input type="hidden" name="id"
						value="<c:out value='${teacher.id}' />" />
				</c:if>


				<fieldset class="form-group">
					<label>Tên giảng viên</label> <input type="text"
						value="<c:out value='${teacher.name}' />" class="form-control"
						name="name">
				</fieldset>

				<fieldset class="form-group">
					<label>Giới tính</label> <input type="text"
						value="<c:out value='${teacher.gender}' />" class="form-control"
						name="gender">
				</fieldset>
				<fieldset class="form-group">
					<label>Điện thoại</label> <input type="text"
						value="<c:out value='${teacher.phoneNumber}' />"
						class="form-control" name="phone_number" required="required">
				</fieldset>
				<fieldset class="form-group">
					<label>Chức vụ</label> <select class="form-control" name="position">
						<option value="Trưởng Khoa"
							<c:if test="${teacher.position eq 'Trưởng Khoa'}">selected</c:if>>Trưởng
							Khoa</option>
						<option value="Phó Khoa"
							<c:if test="${teacher.position eq 'Phó Khoa'}">selected</c:if>>Phó
							Khoa</option>
						<option value="Trưởng Bộ Môn"
							<c:if test="${teacher.position eq 'Trưởng Bộ Môn'}">selected</c:if>>Trưởng
							Bộ Môn</option>
						<option value="Giảng Viên"
							<c:if test="${teacher.position eq 'Giảng Viên'}">selected</c:if>>Giảng
							Viên</option>
						<option value="Thư Ký Khoa"
							<c:if test="${teacher.position eq 'Thư Ký Khoa'}">selected</c:if>>Thư
							Ký Khoa</option>
					</select>
				</fieldset>
				<fieldset class="form-group">
					<label>Email</label> <input type="text"
						value="<c:out value='${teacher.email}' />" class="form-control"
						name="email" required="required">
				</fieldset>
				<fieldset class="form-group">
					<label>Ảnh</label> <input type="file" accept="image/*"
						class="form-control" name="photo">
				</fieldset>

				<!-- Thêm một thẻ img để hiển thị ảnh -->
				<c:if test="${teacher != null && not empty teacher.photoPath}">
					<fieldset class="form-group">
						<label>Ảnh hiện tại</label> <img
							src="view/images/${teacher.photoPath}" alt="Ảnh giảng viên"
							style="max-width: 100%;">
					</fieldset>
				</c:if>
				<button type="submit" class="btn btn-success">Save</button>
				<a href="javascript:history.go(-1);" class="btn btn-primary">Quaylại</a>
				</form>
			</div>
		</div>
	</div>
</body>

</html>