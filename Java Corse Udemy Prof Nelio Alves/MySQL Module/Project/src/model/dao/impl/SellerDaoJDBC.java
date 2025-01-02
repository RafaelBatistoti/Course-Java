package model.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
				
		try (PreparedStatement st = conn
				.prepareStatement(
						"INSERT INTO seller "
						+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) " 
						+ "VALUES "
						+ "(?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS)) {
			
			
			st.setString(1, obj.getName());
			st.setString(2, obj.getEmail());
			st.setDate(3, Date.valueOf(obj.getBirthDate()));
			st.setDouble(4, 7000.0);
			st.setInt(5, obj.getDepartment().getId());
			
			int rowsAffected = st.executeUpdate();

			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
			}else
				throw new EntityNotFoundException("Unexpected error! No rows affected");
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}

	}

	@Override
	public void update(Seller obj) {

		try (PreparedStatement st = conn.prepareStatement(
				"UPDATE seller "
				+ "SET Name = ?, Email = ?, BirthDate = ?, BaseSalary = ? , DepartmentId = ? " 
				+ "WHERE id = ?")) {

			st.setString(1, obj.getName());
			st.setString(2, obj.getEmail());
			st.setDate(3, Date.valueOf(obj.getBirthDate()));
			st.setDouble(4, 7000.0);
			st.setInt(5, obj.getDepartment().getId());
			st.setInt(6, obj.getId());
			
			st.executeUpdate();

		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}

	}

	@Override
	public void deleteById(Integer id) {
		try (PreparedStatement st = conn.prepareStatement(
				"DELETE FROM seller "
				+ "WHERE id = ?")) {

			st.setInt(1, id);			
			
			int rows = st.executeUpdate();
			if(rows == 0) {
				throw new EntityNotFoundException("This id not Exist. No rows affected!");
			}

		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}

	}

	@Override
	public Seller findById(Integer id) {

		try (PreparedStatement st = conn
				.prepareStatement(
						"SELECT seller.*,department.Name as DepName " 
						+ "FROM seller "
						+ "INNER JOIN department "
						+ "ON seller.DepartmentId = department.Id " 
						+ "WHERE seller.Id = ?")) {

			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				Department dep = instantiateDepartment(rs);
				Seller     obj = instantiateSeller(rs, dep);
				return obj;
			}
			throw new EntityNotFoundException("Seller with ID " + id + " not found.");
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}

	}

	@Override
	public List<Seller> findAll() {
		try (PreparedStatement st = conn.prepareStatement(
				"SELECT seller.*,department.Name as DepName "
				+ "FROM seller INNER JOIN department " 
				+ "ON seller.DepartmentId = department.Id " 
				+ "ORDER BY Name")) {

			ResultSet rs = st.executeQuery();

			List<Seller>             listSeller = new ArrayList<>();
			Map<Integer, Department> mapDep     = new HashMap<>();

			findInformation(rs, listSeller, mapDep);
			return listSeller;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}

	@Override
	public List<Seller> findByDepartment(Department department) {

		try (PreparedStatement st = conn
				.prepareStatement("SELECT seller.*,department.Name as DepName " + "FROM seller INNER JOIN department "
						+ "ON seller.DepartmentId = department.Id " + "WHERE DepartmentId = ? " + "ORDER BY Name")) {

			st.setInt(1, department.getId());
			ResultSet rs = st.executeQuery();

			List<Seller>             listSeller = new ArrayList<>();
			Map<Integer, Department> mapDep     = new HashMap<>();

			findInformation(rs, listSeller, mapDep);

			return listSeller;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
	}

	private Seller instantiateSeller(ResultSet rs, Department dep) throws SQLException {
		Seller obj = new Seller();
		obj.setId(rs.getInt("id"));
		obj.setName(rs.getString("Name"));
		obj.setEmail(rs.getString("Email"));
		obj.setBirthDate(rs.getDate("BirthDate") != null ? rs.getDate("BirthDate").toLocalDate() : null);
		obj.setBaseSalary(rs.getDouble("BaseSalary"));
		obj.setDepartment(dep);
		return obj;
	}

	private Department instantiateDepartment(ResultSet rs) throws SQLException {
		Department dep = new Department(rs.getInt("DepartmentId"), rs.getString("DepName"));
		return dep;
	}

	private void findInformation(ResultSet rs, List<Seller> listSeller, Map<Integer, Department> mapDep)
			throws SQLException {
		while (rs.next()) {

			Department dep = mapDep.get(rs.getInt("DepartmentId"));
			if (dep == null) {
				dep = instantiateDepartment(rs);
				mapDep.put(rs.getInt("DepartmentId"), dep);
			}

			Seller obj = instantiateSeller(rs, dep);
			listSeller.add(obj);
		}
	}
}
