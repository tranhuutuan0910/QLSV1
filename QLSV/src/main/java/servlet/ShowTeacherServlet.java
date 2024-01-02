package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DBConnect;
import dao.StudentDAO;
import dao.TeacherDAO;
import model.Student;
import model.Teacher;

/**
 * Servlet implementation class ShowTeacherServlet
 */
@WebServlet("/ShowTeacherServlet")
public class ShowTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowTeacherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		TeacherDAO teacherDAO  = new TeacherDAO(DBConnect.getCon());
		Teacher teacher = teacherDAO.getTeacherById(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("view/teacher/teacher_form.jsp");
		request.setAttribute("teacher", teacher);
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
