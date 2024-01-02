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
 * Servlet implementation class ShowStudentServlet
 */
@WebServlet("/ShowStudentServlet")
public class ShowStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		int khoa = Integer.parseInt(request.getParameter("khoa"));
		System.out.println("-----------");
		System.out.println(khoa);
		StudentDAO studentDAO = new StudentDAO(DBConnect.getCon());
		Student student = studentDAO.getStudentById(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("view/student/student_form.jsp");
		request.setAttribute("student", student);
		request.setAttribute("khoa", khoa);
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
