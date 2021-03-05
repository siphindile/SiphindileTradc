package com.SiphindileTradClothing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SiphindileTradClothing.model.Products;
import com.SiphindileTradClothing.services.ProductServices.ProductServices;



@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductServices ProductServices;
	
	@RequestMapping("getAll")
	public List<Products> getAllPRoducts(){
		return ProductServices.getAllProducts();
	}

}
