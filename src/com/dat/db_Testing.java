package com.dat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class db_Testing {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url ="jdbc:mysql://localhost:3306/db_employee";
		String username="root";
		String pass ="";
		String query ="Select * from tb_employee";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, pass);
		java.sql.Statement state = con.createStatement();
		ResultSet eq = state.executeQuery(query);
		while(eq.next()) {
			System.out.println("The first name is : "+eq.getString(1));
			System.out.println("The second name is  "+eq.getString(2));
			System.out.println("The age is : "+eq.getString(3));
			System.out.println("The mailId is :"+eq.getString(4));
			break;
			
		}

	}

}
