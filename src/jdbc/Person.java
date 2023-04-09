package jdbc;

import java.sql.*;

public class Person {
				public static void main(String[] args) {
					try {
				 // Class<?> c=Class.forName("com.mysql.cj.jdbc.Driver");
						
					Driver c = new com.mysql.cj.jdbc.Driver();
					DriverManager.registerDriver(c);
						
						System.out.println(c+ ":load and register is succesfull");
					} catch ( SQLException e) {
						System.out.println("pls provide qualified name");
					}
				}
}
