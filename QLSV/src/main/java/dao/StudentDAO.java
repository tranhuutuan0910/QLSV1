package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Student;
import model.Teacher;

public class StudentDAO {
	private Connection con;

	public StudentDAO(Connection con) {
		super();
		this.con = con;
	}
	public List<Student> getAllStudents(int khoa) {

		List<Student> students = new ArrayList<>();
		String sql = "SELECT s.student_id, s.name, s.gender, s.address, s.graduation_status from students s where s.course =?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
		    ps.setInt(1, khoa);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setStudentId(rs.getString("student_id"));
				student.setName(rs.getString("name"));
				student.setGender(rs.getString("gender"));
				student.setAddress(rs.getString("address"));
				student.setGraduationStatus(rs.getBoolean("graduation_status"));
				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return students;
	}
	public void addStudent(Student student) {
		String sql = "INSERT INTO students (student_id, name, gender, address, graduation_status, course, photoPath) VALUES (?, ?, ?, ?, ?,?,?)";
        try  {
        	PreparedStatement preparedStatement = con.prepareStatement(sql);
        	
            preparedStatement.setString(1, student.getStudentId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setString(3, student.getGender());
            preparedStatement.setString(4, student.getAddress());
            preparedStatement.setBoolean(5, student.isGraduationStatus());
            preparedStatement.setInt(6, student.getCourse());
            preparedStatement.setString(7, student.getPhotoPath());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	public void deleteStudent(String id) {
		String sql = "delete from students where student_id =?";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.executeUpdate();
		}catch (SQLException e) {
            e.printStackTrace();
        }
	}
	public Student getStudentById(String studentId) {
		String sql = "select * from students where student_id = ?";
		Student s = new Student();
        try {
             PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, studentId);
            ResultSet resultSet = preparedStatement.executeQuery();
            
                if (resultSet.next()) {
                    s.setStudentId(resultSet.getString("student_id"));
                    s.setName(resultSet.getString("name"));;
                    s.setGender(resultSet.getString("gender"));
                    s.setAddress(resultSet.getString("address"));
                    s.setGraduationStatus(resultSet.getBoolean("graduation_status"));
                    s.setPhotoPath(resultSet.getString("photoPath"));
                }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return s;
    }

	public void updateStudent(Student student) {
		String sql = "update students set name = ?, gender = ?, address = ?, graduation_status = ? , photoPath = ? where student_id = ?;";
	
		try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
        	
           
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getGender());
            preparedStatement.setString(3, student.getAddress());
            preparedStatement.setBoolean(4, student.isGraduationStatus());
            preparedStatement.setString(5, student.getPhotoPath());
            preparedStatement.setString(6, student.getStudentId());
            preparedStatement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
