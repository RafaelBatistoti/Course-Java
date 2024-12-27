package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import entities.db.DB;
import entities.db.DbException;

public class Main {

	public static void main(String[] args) {

		try (Connection conn = DB.getConnection()) {
			conn.setAutoCommit(false);

		    try (Statement st = conn.createStatement()) {
		        int rows_1 = st.executeUpdate(
		                 "UPDATE seller "
		                + "SET BaseSalary = 2090 "
		                + "WHERE DepartmentId = 1");
		        
				int x = 1;
				if (x < 2) {
					throw new SQLException("Fake Error!!");
				}
		        		

		        int rows_2 = st.executeUpdate(
		                 "UPDATE seller "
		                + "SET BaseSalary = 3090 "
		                + "WHERE DepartmentId = 2");

		        System.out.println("Done!");
		        System.out.println("Rows_1: " + rows_1);
		        System.out.println("Rows_2: " + rows_2);

		        conn.commit(); 
			}
			catch (SQLException e) {
				conn.rollback();
				throw new DbException(e.getMessage());
			}
		}
		catch (SQLException e) {
			throw new DbException("Erro ao processar a transação: " + e.getMessage());
		}

	}

}
