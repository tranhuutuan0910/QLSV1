<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
@charset "UTF-8";
h1 {
    text-align: center;
    /* Căn giữa text */
    margin-top: 5%;
    /* Khoảng cách giữa logo và h1 */
    margin-bottom: 10%;
    /* Khoảng cách giữa h1 và nav */
    font-size: 50px;
    /* Kích thước chữ */
}
nav {
    width: 100%;
    height: 95px;
    background-color: #f0f0f0;
    position: absolute;
    bottom: 0;
    left: 0;
    right: 0;
    top: 25%
}

ul {
    list-style-type: none;
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 30px;
}

li {
    margin-right: 30px;
     list-style-type: none;
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 50px;
}
button {
    animation: pulse 1s ease-in-out infinite;
}

@keyframes pulse {
    0% {
        transform: scale(1);
    }
    50% {
        transform: scale(1.05);
    }
    100% {
        transform: scale(1);
    }
}








</style>
</head>
<body>
	<h1>Trang Chủ Sinh Viên</h1>


	<div class="button-container">
		<nav>
			<ul>
			 <li> <button onclick="location.href='StudentManagement?khoa=2019'"
		class="button button2">Khoá Học 2019</button> </li>
		 <li> <button onclick="location.href='StudentManagement?khoa=2020'"
		class="button button2">Khoá Học 2020</button> </li>
		 <li> <button onclick="location.href='StudentManagement?khoa=2021'"
		class="button button2">Khoá Học 2021</button> </li>
		 <li> <button onclick="location.href='StudentManagement?khoa=2022'"
		class="button button2">Khoá Học 2022</button> </li>
		 <li> <button onclick="location.href='StudentManagement?khoa=2020'"
		class="button button2">Khoá Học 2023</button> </li>
			</ul>
		
		</nav>
		 
	</div>
</body>
</html>