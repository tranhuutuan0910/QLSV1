package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private static Connection con = null;

    public static Connection getCon(){
       
            String dbUrl = "jdbc:mysql://localhost:3306/qlsv";
            String dbClass = "com.mysql.cj.jdbc.Driver";
            try {
                Class.forName(dbClass);
                con = DriverManager.getConnection(dbUrl, "root", "Abcxyz123@");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return con;
        
    }
}
