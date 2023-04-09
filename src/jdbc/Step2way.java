package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Step2way {
			public static void main(String[] args) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					DriverManager.getConnection("jdbc:mysql://localhost:3306/vedha?user=root&password=root");
					System.out.println("connection is suceesfull");
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
				}
			}
}
