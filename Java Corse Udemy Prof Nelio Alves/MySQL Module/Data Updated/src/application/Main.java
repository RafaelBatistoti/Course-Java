package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entities.db.DB;
import entities.db.DbException;

public class Main {

	public static void main(String[] args) {

		try (Connection conn = DB.getConnection();
				PreparedStatement st = conn.prepareStatement(
						"UPDATE seller " 
						+ "SET BaseSalary = BaseSalary + ? " 
						+ "WHERE " 
						+ "(DepartmentId = ?)")) {

			st.setDouble(1, 200.0);
			st.setInt(2, 2);
			
			int rowsAffected = st.executeUpdate();
			System.out.println("Done! Rows affected: " + rowsAffected);
			

		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}

	}

}
