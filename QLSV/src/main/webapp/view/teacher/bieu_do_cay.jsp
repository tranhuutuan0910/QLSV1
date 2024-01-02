<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>User Management Application</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <style>
        .btn-container a {
            margin-right: 10px; /* Thay đổi giá trị này để điều chỉnh khoảng cách theo ý muốn */
        }
    </style>
</head>
<body class="text-center">

    <h3>Trưởng khoa:</h3>
    <div class="container text-left mx-auto d-flex justify-content-center btn-container">
        <c:forEach var="teacher" items="${teachers}" varStatus="loopStatus">
            <a href="<%=request.getContextPath()%>/BieuDoCaseServlet" class="btn btn-success">${teacher.name}</a>
        </c:forEach>
    </div>

    <h3>Phó khoa:</h3>
    <div class="container text-left mx-auto d-flex justify-content-center btn-container">
        <c:forEach var="teacher" items="${phoKhoa}" varStatus="loopStatus">
            <a href="<%=request.getContextPath()%>/BieuDoCaseServlet" class="btn btn-success">${teacher.name}</a>
        </c:forEach>
    </div>

    <h3>Trưởng bộ môn:</h3>
    <div class="container text-left mx-auto d-flex justify-content-center btn-container">
        <c:forEach var="teacher" items="${truongBoMon}" varStatus="loopStatus">
            <a href="<%=request.getContextPath()%>/BieuDoCaseServlet" class="btn btn-success">${teacher.name}</a>
        </c:forEach>
    </div>

    <h3>Giảng viên:</h3>
    <div class="container text-left mx-auto d-flex justify-content-center btn-container">
        <c:forEach var="teacher" items="${giangVien}" varStatus="loopStatus">
            <a href="<%=request.getContextPath()%>/BieuDoCaseServlet" class="btn btn-success">${teacher.name}</a>
        </c:forEach>
    </div>

</body>
</html>
