package com.project;

import java.sql.*;

public class retrieveDetails {
	public static void main(String args[]) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

			PreparedStatement stmt = con.prepareStatement("select * from emp");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
