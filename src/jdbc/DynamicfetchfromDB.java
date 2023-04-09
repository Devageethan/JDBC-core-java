package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DynamicfetchfromDB {
			static Connection c;
			public static void main(String[] args) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
					String query="select * from emp where name=?";
					PreparedStatement p=c.prepareStatement(query);
					p.setString(1, "naveen");
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
}
