package edu.esprit.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import edu.esprit.app.entities.Product;
@Transactional
public class ProductDao implements IProductDao {
	
	@PersistenceContext
	EntityManager em;
	
	
	

	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
     em.persist(p);
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
  em.remove(findProductById(id));
	}

	@Override
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
   em.merge(p);
	}

	@Override
	public Product findProductById(int id) {
		// TODO Auto-generated method stub
		return em.find(Product.class, id);
	}

	@Override
	public List<Product> getList() {
		// TODO Auto-generated method stub
		return em.createQuery("select p from Product p", Product.class).getResultList();
	}

}
