package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchdatafromDataBase {
	static Connection c;
	public static void main(String[] args) {
		//Connection c;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 c = DriverManager.getConnection("jdbc:mysql://LocalHost:3306/employee", "root", "root");
			// String query="select* from emp";
			//String query = "select * from emp where id=2";
			String query="select name,sal from emp";
			Statement statement = c.createStatement();
			ResultSet resultset = statement.executeQuery(query);

			while (resultset.next()) {
				//System.out.println(resultset.getInt(1));
				System.out.println(resultset.getString(1));
				System.out.println(resultset.getDouble(2));
				//System.out.println(resultset.getString(3));
				System.out.println("*************");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(c!=null) {
				try {
					c.close();
					System.out.println("connection is closed");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
