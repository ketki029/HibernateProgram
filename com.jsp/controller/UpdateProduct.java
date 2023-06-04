package com.jsp.controller;


import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class UpdateProduct {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		String name="amruta";
         Product product = productService.updateProduct(3, name);
				System.out.println(product.getName());
	}

}
