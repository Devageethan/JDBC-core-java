package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Deletethedata {
				public static void main(String[] args) {
					
					try {
						//step-1 load driver
						Class.forName("com.mysql.cj.jdbc.Driver");
						//step-2 get connection
						Connection connection=DriverManager.getConnection("jdbc:mysql://LocalHost:3306/employee","root","root");
						//step-3 issue query
						Statement s=connection.createStatement();
						//step-4
						int i=s.executeUpdate("Delete from emp where id=1");
						if(i!=0)
						System.out.println("delete sucessfully");
						
					} catch (ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("delete unsucessfully");
					}
				}
}
