package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Teacher;

public class TeacherDAO {
	private Connection con;

	public TeacherDAO(Connection con) {
		super();
		this.con = con;
	}

	public List<Teacher> getAllTeachers() {

		List<Teacher> teachers = new ArrayList<>();
		String sql = "SELECT * from teachers";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Teacher teacher = new Teacher();
				teacher.setId(rs.getInt("id"));
				teacher.setName(rs.getString("name"));
				teacher.setGender(rs.getString("gender"));
				teacher.setPhoneNumber(rs.getString("phone_number"));
				teacher.setPosition(rs.getString("position"));
				teacher.setEmail(rs.getString("email"));
				teachers.add(teacher);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return teachers;
	}

	public void addTeacher(Teacher teacher) {
		String sql = "INSERT INTO Teachers (name, gender, phone_number, position, email, photoPath) VALUES (?, ?, ?, ?, ?,?)";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);

			preparedStatement.setString(1, teacher.getName());
			preparedStatement.setString(2, teacher.getGender());
			preparedStatement.setString(3, teacher.getPhoneNumber());
			preparedStatement.setString(4, teacher.getPosition());
			preparedStatement.setString(5, teacher.getEmail());
            preparedStatement.setString(6,  teacher.getPhotoPath());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteTeacher(int id) {
		String sql = "delete from teachers where id =?";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Teacher getTeacherById(int id) {
		String sql = "select * from teachers where id = ?";
		Teacher s = new Teacher();
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				s.setId(resultSet.getInt("id"));
				s.setName(resultSet.getString("name"));
				;
				s.setGender(resultSet.getString("gender"));
				s.setPhoneNumber(resultSet.getString("phone_number"));
				s.setPosition(resultSet.getString("position"));
				s.setEmail(resultSet.getString("email"));
				s.setPhotoPath(resultSet.getString("photoPath"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return s;
	}

	public void updateTeacher(Teacher teacher) {
		String sql = "update teachers set name = ?, gender = ?, phone_number = ?, position = ?,email= ?, photoPath = ? where id = ?;";
		boolean rowUpdate;
		try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
        	
            preparedStatement.setString(1, teacher.getName());
            preparedStatement.setString(2, teacher.getGender());
            preparedStatement.setString(3, teacher.getPhoneNumber());
            preparedStatement.setString(4, teacher.getPosition());
            preparedStatement.setString(5, teacher.getEmail());
            preparedStatement.setString(6, teacher.getPhotoPath());
            preparedStatement.setInt(7, teacher.getId());
            preparedStatement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public List<Teacher> getTeacherTruongKhoa() {
		List<Teacher> teachers = new ArrayList<>();
		String sql = "select * from teachers where position = 'Trưởng Khoa'";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Teacher teacher = new Teacher();
				teacher.setId(rs.getInt("id"));
				teacher.setName(rs.getString("name"));
				teacher.setGender(rs.getString("gender"));
				teacher.setPhoneNumber(rs.getString("phone_number"));
				teacher.setPosition(rs.getString("position"));
				teacher.setEmail(rs.getString("email"));
				teachers.add(teacher);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return teachers;
	}
	public List<Teacher> getTruongKhoa() {
		List<Teacher> teachers = new ArrayList<>();
		String sql = "select * from teachers where position = 'Trưởng Khoa'";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Teacher teacher = new Teacher();
				teacher.setId(rs.getInt("id"));
				teacher.setName(rs.getString("name"));
				teacher.setGender(rs.getString("gender"));
				teacher.setPhoneNumber(rs.getString("phone_number"));
				teacher.setPosition(rs.getString("position"));
				teacher.setEmail(rs.getString("email"));
				teachers.add(teacher);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return teachers;
	}
	public List<Teacher> getPhoKhoa() {
		List<Teacher> teachers = new ArrayList<>();
		String sql = "select * from teachers where position = 'Phó Khoa'";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Teacher teacher = new Teacher();
				teacher.setId(rs.getInt("id"));
				teacher.setName(rs.getString("name"));
				teacher.setGender(rs.getString("gender"));
				teacher.setPhoneNumber(rs.getString("phone_number"));
				teacher.setPosition(rs.getString("position"));
				teacher.setEmail(rs.getString("email"));
				teachers.add(teacher);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return teachers;
	}
	public List<Teacher> getTruongBoMon() {
		List<Teacher> teachers = new ArrayList<>();
		String sql = "select * from teachers where position = 'Trưởng bộ môn'";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Teacher teacher = new Teacher();
				teacher.setId(rs.getInt("id"));
				teacher.setName(rs.getString("name"));
				teacher.setGender(rs.getString("gender"));
				teacher.setPhoneNumber(rs.getString("phone_number"));
				teacher.setPosition(rs.getString("position"));
				teacher.setEmail(rs.getString("email"));
				teachers.add(teacher);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return teachers;
	}
	public List<Teacher> getGiangVien() {
		List<Teacher> teachers = new ArrayList<>();
		String sql = "select * from teachers where position = 'Giảng viên'";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Teacher teacher = new Teacher();
				teacher.setId(rs.getInt("id"));
				teacher.setName(rs.getString("name"));
				teacher.setGender(rs.getString("gender"));
				teacher.setPhoneNumber(rs.getString("phone_number"));
				teacher.setPosition(rs.getString("position"));
				teacher.setEmail(rs.getString("email"));
				teachers.add(teacher);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return teachers;
	}

}
