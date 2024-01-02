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
import model.Student;

/**
 * Servlet implementation class AddStudentServlet
 */
@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static int khoa = 0;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddStudentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		khoa = Integer.parseInt(request.getParameter("khoa"));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("view/student/student_form.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String studentId = request.getParameter("studentId");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		boolean graduationStatus = Boolean.parseBoolean(request.getParameter("graduationStatus"));
		String image = request.getParameter("photo");
		Student student = new Student(studentId, name, gender, address, graduationStatus, khoa,image);
//        System.out.println(graduationStatus);
//        
//        System.out.println(student.isGraduationStatus());
		StudentDAO studentDAO = new StudentDAO(DBConnect.getCon());
		// Add the student to the database
		studentDAO.addStudent(student);
		
		// Redirect to the student list page
		response.sendRedirect("StudentManagement?khoa="+khoa);
	}

}
