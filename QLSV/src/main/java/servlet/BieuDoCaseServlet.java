package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DBConnect;
import dao.TeacherDAO;
import model.Teacher;

/**
 * Servlet implementation class BieuDoCaseServlet
 */
@WebServlet("/BieuDoCaseServlet")
public class BieuDoCaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BieuDoCaseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TeacherDAO teacherDAO = new TeacherDAO(DBConnect.getCon());
		List<Teacher> teachers = teacherDAO.getTeacherTruongKhoa();
		List<Teacher> phoKhoa = teacherDAO.getPhoKhoa();
		List<Teacher> truongBoMon = teacherDAO.getTruongBoMon();
		List<Teacher> giangVien = teacherDAO.getGiangVien();
		request.setAttribute("teachers", teachers);
		request.setAttribute("phoKhoa", phoKhoa);
		request.setAttribute("truongBoMon", truongBoMon);
		request.setAttribute("giangVien", giangVien);
		RequestDispatcher dispatcher = request.getRequestDispatcher("view/teacher/bieu_do_cay.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
