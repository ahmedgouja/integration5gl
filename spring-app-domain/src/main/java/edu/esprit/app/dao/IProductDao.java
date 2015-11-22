package edu.esprit.app.dao;

import java.util.List;

import edu.esprit.app.entities.Product;

public interface IProductDao {
	
	
	
	void addProduct (Product p);
	void deleteProduct(int id);
	void updateProduct(Product p);
	Product findProductById(int id);
	List<Product> getList();
	

}
