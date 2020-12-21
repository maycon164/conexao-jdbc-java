package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println("Teste 1 = Seller findById");
		System.out.println(seller);
		
		 Department dep = new Department(2, null);
		/*
		 * System.out.println("Teste 2 = Seller findByDepartment"); List<Seller> list = sellerDao.findByDepartment(dep);
		 * System.out.println(seller); for(Seller obj: list) { System.out.println(obj);
		 * }
		 * 
		 * 
		 * System.out.println("Teste 3 = Seller findAll");
		 * 
		 * List<Seller> list2 = sellerDao.findAll(); System.out.println(seller);
		 * for(Seller obj: list2) { System.out.println(obj); } }
		 */
		
		System.out.println("Teste 4 = Insert Seller");
		Seller newSeller = new Seller(null, "David StrongMan", "stron@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new id = " + newSeller.getId());
		
		
		System.out.println("Teste 5 = Seller update ======");
		seller = sellerDao.findById(1);
		seller.setName("Camila Carajo");
		sellerDao.update(seller);
		System.out.println("Update completed");
	}
	
}
