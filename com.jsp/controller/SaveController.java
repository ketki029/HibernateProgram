package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class SaveController {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		Product product=new Product();
		product.setBrand("hdj");
		product.setName("jfbf");
		
		Product p2=productService.saveProduct(product);
		if(p2!=null) {
			System.out.println("Product saved");
		}
	}
	


}
