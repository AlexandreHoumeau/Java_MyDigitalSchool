package fr.mds.supcormmerce.dao;

import java.util.List;

import fr.mds.supcommerce.entity.Product;

public interface ProductDao {
	
	List<Product> getAllProducts();

	void addProduct(Product product);
}
