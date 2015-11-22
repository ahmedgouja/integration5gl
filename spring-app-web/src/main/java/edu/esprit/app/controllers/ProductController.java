package edu.esprit.app.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.esprit.app.dao.IProductDao;
import edu.esprit.app.entities.Product;
import edu.esprit.app.service.IProductServices;

@Controller
public class ProductController {
	
	@Autowired
	private IProductServices productServices;
	
	

	@RequestMapping(value = "/index")
	public String loadHomePage(Model model){
		model.addAttribute("product", new Product());
		model.addAttribute("products", productServices.getList());
		return "home";
}
	@RequestMapping(value = "/save")
	public String addProduct(@Valid Product product, BindingResult br,  Model model){
		
		if(br.hasErrors()) {
		
			model.addAttribute("products", productServices.getList());
			return "home";
		}
		
		//Use merge to save or update
		productServices.updateProduct(product);
		
		model.addAttribute("product", new Product());
		model.addAttribute("products", productServices.getList());
		return "home";
	}
	@RequestMapping(value = "/delete")
	public String deleteProduct(@RequestParam("selectedProd") int prodRef, Model model){

		productServices.deleteProduct(prodRef);
		model.addAttribute("product", new Product());
		model.addAttribute("products", productServices.getList());
		return "home";
	}
	@RequestMapping(value = "/selectForUpdate")
	public String updateProduct(@RequestParam("selectedProd") int prodRef, Model model){

		
		model.addAttribute("product", productServices.findProductById(prodRef));
		model.addAttribute("products", productServices.getList());
		return "home";
	}

	public IProductServices getProductServices() {
		return productServices;
	}



	public void setProductServices(IProductServices productServices) {
		this.productServices = productServices;
	}
	
	
	
	
	
}