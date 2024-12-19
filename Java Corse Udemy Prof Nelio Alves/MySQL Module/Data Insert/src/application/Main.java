package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.db.DB;
import entities.db.DbException;

public class Main {

	public static void main(String[] args) {

		DateTimeFormatter formatDate     = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime     localBirthDate = LocalDateTime.parse("02/03/1992 00:00:00", formatDate);
		java.sql.Date     birthDate      = java.sql.Date.valueOf(localBirthDate.toLocalDate());

		try (Connection conn = DB.getConnection();
				PreparedStatement st = conn.prepareStatement(
						"INSERT INTO seller "
						+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) " 
						+ "VALUES " 
						+ "(?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS)) {

			st.setString(1, "Rafael Batistoti");
			st.setString(2, "rafael@gmail.com");
			st.setDate(3, birthDate);
			st.setDouble(4, 5000.0);
			st.setInt(5, 2);
						
			int rowsAffected = st.executeUpdate();
			
			
//			Retorna o número do Id 
//			Do novo objeto inserido
			if(rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id: " + id);
				}
			}else
				System.out.println("No rows affected!");

		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}

	}

}
