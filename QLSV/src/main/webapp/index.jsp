
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trang web mẫu</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <h1>
       Trang Chủ Khoa Tin Học
    </h1>
    <header>
        <div class="logo">
            <img src="logo.webp" alt="Logo">
        </div>
        <nav>
            <ul>
                <li> <button onclick="location.href='StudentHomeServlet'"
		class="button button2">Sinh Viên</button> </li>
                <li>  </li>
                <li>  	<button onclick="location.href='TeacherManagementServlet'"
		class="button button2">Giảng Viên</button> </li>
                 
            </ul>
        </nav>
    </header>
    <main>
    </main>
    <footer>
        <div class="footer-content">

            <ul>
                <li>Đại Học Sư Phạm Đà Nẵng</li>
                <li><a href="https://ued.udn.vn/"><i class="fa fa-phone"></i>(84) - 236 - 3841 323, Fax: (84) - 236 - 3842 953</a></li>
                <li><a href="https://ued.udn.vn/"><i class="fa fa-envelope"></i>ued..udn.vn</a></li>
                <li><i class="fa fa-map-marker"></i>459 Tôn Đức Thắng, Phường Hoà Khánh Nam, Quận Liên Chiểu, Thành Phố Đà Nẵng</a>
                </li>
            </ul>
        </div>

    </footer>
</body>

</html>