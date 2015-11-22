package edu.esprit.app.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import edu.esprit.app.dao.IProductDao;
import edu.esprit.app.entities.Product;

@Transactional
public class ProductService implements IProductServices {
	
	
	IProductDao productdao;
	
	
	
	


	public IProductDao getProductdao() {
		return productdao;
	}

	public void setProductdao(IProductDao productdao) {
		this.productdao = productdao;
	}

	@Override
	public void addProduct(Product p) {
		productdao.addProduct(p);

	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		productdao.deleteProduct(id);
	}

	@Override
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		productdao.updateProduct(p);
	}

	@Override
	public Product findProductById(int id) {
		// TODO Auto-generated method stub
		return productdao.findProductById(id);
	}

	@Override
	public List<Product> getList() {
		// TODO Auto-generated method stub
		return productdao.getList();
	}

}
