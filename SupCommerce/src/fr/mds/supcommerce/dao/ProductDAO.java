package fr.mds.supcommerce.dao;

import java.util.ArrayList;

import fr.mds.supcommerce.model.Product;

public class ProductDAO {

	static ArrayList<Product> products = new ArrayList<>();
	static long idCounter = 0;

	public static void addProduct(Product p) {
		p.setId(idCounter);
		idCounter++;
		products.add(p);

	}

	public static ArrayList<Product> getAllProducts() {
		return products;
	}

	static Product findProductById(long id) {
		for (Product p : products) {
			if (p.getId() == id) {
				return p;
			}
		}
		return null;
	}

}
