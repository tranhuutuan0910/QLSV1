

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
				<c:if test="${student != null}">
					<form action="EditStudentServlet?khoa=${khoa}" method="post">
				</c:if>
				<c:if test="${student == null}">
					<form action="AddStudentServlet" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${student != null}">
            			Chỉnh sửa sinh viên
            		</c:if>
						<c:if test="${student == null}">
            			Thêm mới sinh viên
            		</c:if>
					</h2>
				</caption>

				<c:choose>
					<c:when test="${student != null}">
						<input type="hidden" name="studentId"
							value="<c:out value='${student.studentId}' />" />
						<fieldset class="form-group">
							<label>Mã sinh viên</label> <input type="text"
								value="<c:out value='${student.studentId}' />"
								class="form-control" name="studentId" readonly
								required="required">
						</fieldset>
					</c:when>
					<c:otherwise>
						<fieldset class="form-group">
							<label>Mã sinh viên</label> <input type="text"
								class="form-control" name="studentId" required="required">
						</fieldset>
					</c:otherwise>
				</c:choose>


				<fieldset class="form-group">
					<label>Tên sinh viên</label> <input type="text"
						value="<c:out value='${student.name}' />" class="form-control"
						name="name">
				</fieldset>

				<fieldset class="form-group">
					<label>Giới tính</label> <input type="text"
						value="<c:out value='${student.gender}' />" class="form-control"
						name="gender">
				</fieldset>
				<fieldset class="form-group">
					<label>Địa chỉ</label> <input type="text"
						value="<c:out value='${student.address}' />" class="form-control"
						name="address" required="required">
				</fieldset>
				<fieldset class="form-group">
					<label>Ảnh</label> <input type="file" accept="image/*"
						class="form-control" name="photo">
				</fieldset>

				<!-- Thêm một thẻ img để hiển thị ảnh -->
				<c:if test="${student != null && not empty student.photoPath}">
					<fieldset class="form-group">
						<label>Ảnh hiện tại</label> <img
							src="view/images/${student.photoPath}" alt="Ảnh sinh viên"
							style="max-width: 100%;">
					</fieldset>
				</c:if>
				<fieldset class="form-group">
					<label>Tình trạng tốt nghiệp</label>
					<div class="form-check">
						<input type="checkbox" id="graduationStatusCheckbox"
							onchange="updateGraduationStatus()"
							${empty student.graduationStatus || student.graduationStatus == false ? '' : 'checked'}>
						Đã tốt nghiệp <input type="hidden" id="graduationStatusField"
							name="graduationStatus"
							value="${empty student.graduationStatus || student.graduationStatus == false ? 'false' : 'true'}">
					</div>
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				<a href="javascript:history.go(-1);" class="btn btn-primary">Quaylại</a>
				</form>


			</div>
		</div>
	</div>
</body>
<script>
	function updateGraduationStatus() {
		var checkbox = document.getElementById("graduationStatusCheckbox");
		var graduationStatusField = document
				.getElementById("graduationStatusField");

		// Set the value of the hidden field based on the checkbox status
		graduationStatusField.value = checkbox.checked;
	}
</script>
</html>