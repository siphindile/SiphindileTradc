package com.SiphindileTradClothing.services.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.SiphindileTradClothing.Repository.CategoryRepo;
import com.SiphindileTradClothing.Repository.ProductRepo;
import com.SiphindileTradClothing.model.Category;
import com.SiphindileTradClothing.model.Products;



@Component
public class ProductServices {

	@Autowired(required = false)
	private ProductRepo productRepo;
	/*@Autowired
	CategoryRepo cateRepo;
	*/
	public List<Products>getAllProducts(){
		return productRepo.findAll();
	}
/*	public List<Products>getProductsByCategory(String product_id){
		return productRepo.getByCategoryId(product_id);
	}*/
	
	/*public List<Category>getAllCategory(){
		return cateRepo.findAll();
	}
	*/
	public Products getProductsById(long productId) throws Exception {
		return productRepo.findById(productId).orElseThrow(() ->new Exception("Product is not found"));
	}
}
