package application;

import java.time.LocalDate;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();
				
		System.out.println("*********** Seller: FindById ***********");
		System.out.println(sellerDao.findById(2));
		
		System.out.println();
		
		System.out.println("*********** Seller: FindByDepartment ***********");
		Department department = new Department(2, null);
		sellerDao.findByDepartment(department).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("*********** Seller: FindAll ***********");
		sellerDao.findAll().forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("*********** Seller: Insert Data ***********");
		Seller newSeller = new Seller(null, "Matheus", "matheus@gmail.com", LocalDate.now(), 7000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id: " + newSeller.getId());
		
		System.out.println();
		
		System.out.println("*********** Seller: Updated ***********");
		Seller seller = new Seller();
		seller = sellerDao.findById(2);
		seller.setName("Bob");
		sellerDao.update(seller);
		System.out.println("Updated complete!");
		
		System.out.println();
		
		System.out.println("*********** Seller: Delete ***********");
		System.out.print("Enter with you id to delete: ");
		int id = sc.nextInt();
		sellerDao.deleteBy(id);
		System.out.println("Delete complete!");
		
	}

}
