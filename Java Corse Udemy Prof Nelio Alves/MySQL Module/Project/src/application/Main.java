package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("*********** Seller: FindById ***********");
		System.out.println(sellerDao.findById(2));
		
		System.out.println();
		
		System.out.println("*********** Seller: FindByDepartment ***********");
		sellerDao.findByDepartment(new Department(2, null)).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("*********** Seller: FindAll ***********");
		sellerDao.findAll().forEach(System.out::println);
		
		
		
		


	}

}
