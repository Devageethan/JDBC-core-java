package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Update {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step-2 get the connection
			Connection c = DriverManager.getConnection("jdbc:mysql://LocalHost:3306/employee", "root", "root");
			// System.out.println(c);
			// step-3 issue the query
			java.sql.Statement s = c.createStatement();
			// step-4
			int i = s.executeUpdate("update emp set name='Devageethan' where id= 1");
			System.out.println("updated sucessfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
