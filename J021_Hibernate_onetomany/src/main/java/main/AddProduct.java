package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;


public class AddProduct {
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Product.class)
				.addAnnotatedClass(Category.class).buildSessionFactory();

		Session s = sf.openSession();
		Transaction tx = null;
		tx = s.beginTransaction();

//		Category cat = new Category();
//		cat.setCatname("Cloths");
		
		Category cat = s.load(Category.class, 1);
		
		Product p1 = new Product();
		p1.setPname("Cap");
		p1.setCategory(cat);
		
		s.save(p1);
		tx.commit();

	}
}
