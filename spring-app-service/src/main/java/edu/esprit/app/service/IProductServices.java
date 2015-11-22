package edu.esprit.app.service;

import java.util.List;

import edu.esprit.app.entities.Product;

public interface IProductServices {
	
	
	
	

	void addProduct (Product p);
	void deleteProduct(int id);
	void updateProduct(Product p);
	Product findProductById(int id);
	List<Product> getList();
	

}
