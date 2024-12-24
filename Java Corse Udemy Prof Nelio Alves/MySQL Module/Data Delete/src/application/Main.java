package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entities.db.DB;
import entities.db.DbException;
import entities.db.DbIntegrityException;

public class Main {

	public static void main(String[] args) {

		try (Connection conn = DB.getConnection();
				PreparedStatement st = conn.prepareStatement(""
						+ "DELETE FROM seller "
						+ "WHERE "
						+"Id = ? "
						)){
			
			st.setInt(1, 11);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Id: " + rowsAffected);

		}
		catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		}

	}

}
