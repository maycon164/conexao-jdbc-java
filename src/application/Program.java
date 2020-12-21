package application;

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
		
		System.out.println("Teste 2 = Seller findByDepartment");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		System.out.println(seller);
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		
		System.out.println("Teste 3 = Seller findAll");
		
		List<Seller> list2 = sellerDao.findAll();
		System.out.println(seller);
		for(Seller obj: list2) {
			System.out.println(obj);
		}
	}
}
