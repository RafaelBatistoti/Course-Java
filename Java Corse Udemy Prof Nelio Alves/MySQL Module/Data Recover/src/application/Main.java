package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entities.db.DB;
import entities.db.DbException;

public class Main {

	public static void main(String[] args) {

		try (Connection conn = DB.getConnection();
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM department")) {

			while (rs.next()) {
				System.out.println(rs.getInt("id") + ", " + rs.getString("Name"));
			}

		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}

	}

}
