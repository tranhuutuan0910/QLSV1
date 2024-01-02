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
import dao.StudentDAO;
import model.Student;

/**
 * Servlet implementation class StudentManagement
 */
@WebServlet("/StudentManagement")
public class StudentManagement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentManagement() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int khoa = Integer.parseInt(request.getParameter("khoa"));
		StudentDAO studentDAO = new StudentDAO(DBConnect.getCon());
		List<Student> students = studentDAO.getAllStudents(khoa);
		request.setAttribute("khoa", khoa);
        request.setAttribute("students", students);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/student/students.jsp");
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
