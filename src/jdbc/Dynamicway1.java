package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Dynamicway1 {
			public static void main(String[] args) { 
			Scanner s=new Scanner(System.in);
				try {
					//step-1
					Class.forName("com.mysql.cj.jdbc.Driver");
					//step-2
					Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
					String query="insert into emp values(?,?,?,?)";
					//step-3
					PreparedStatement p=c.prepareStatement(query);
					System.out.println("enter the id");
					int id=s.nextInt();
					System.out.println("enter the name");
					String name=s.next();
					System.out.println("enter the sal");
					double sal=s.nextDouble();
					System.out.println("enter the job");
					String job=s.next();
					p.setInt(1, id);
					p.setString(2, name);
					p.setDouble(3, sal);
					p.setString(4, job);
					//step-4
					int i=p.executeUpdate();
					if(i!=0) {
						System.out.println("data insertion success");
					}
					
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Autop-generated catch block
					e.printStackTrace();
					System.out.println("data not found");
				}
			}
}
