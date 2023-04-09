package jdbc;

import java.sql.*;

import com.mysql.cj.xdevapi.Statement;

public class InsertTable {
				public static void main(String[] args) {
					//step-1 register the driver
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						//step-2 get the connection
					Connection c=DriverManager.getConnection("jdbc:mysql://LocalHost:3306/employee","root","root");
					//System.out.println(c);
					//step-3 issue the query
					java.sql.Statement s=  c.createStatement();
					//System.out.println(s);
					//step-4 process the result
					int i=s.executeUpdate("insert into emp values(1,'deva',30000,'developer')");
					//int i=s.executeUpdate("insert into emp values(2,'Naveen',34000,'Data Analyst')");
					System.out.println(i+"rows get affected");
					System.out.println("data has inserted sucessfully");
					} catch (ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
}
