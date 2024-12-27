package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.exceptions.DbException;
import db.exceptions.EntityNotFoundException;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao {

	private Connection conn;

	public SellerDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Seller obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Seller obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBy(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Seller findById(Integer id) {
	    String query = "SELECT seller.*, department.Name as DepName " 
	                 + "FROM seller INNER JOIN department " 
	                 + "ON seller.DepartmentId = department.Id " 
	                 + "WHERE seller.Id = ?";

	    try (PreparedStatement st = conn.prepareStatement(query)) {
	        st.setInt(1, id);
	        ResultSet rs = st.executeQuery();

	        if (rs.next()) {
	            Department dep = new Department(rs.getInt("DepartmentId"), rs.getString("DepName"));
	            Seller obj = new Seller();
	            obj.setId(rs.getInt("id"));
	            obj.setName(rs.getString("Name"));
	            obj.setEmail(rs.getString("Email"));
	            obj.setBirthDate(rs.getDate("BirthDate") != null ? rs.getDate("BirthDate").toLocalDate() : null);
	            obj.setBaseSalary(rs.getDouble("BaseSalary"));
	            obj.setDepartment(dep);
	            return obj;
	        }
	       
	        throw new EntityNotFoundException("Seller with ID " + id + " not found.");

	    } catch (SQLException e) {
	        throw new DbException(e.getMessage());
	    }
	}



	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
