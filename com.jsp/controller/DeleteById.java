package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class DeleteById {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		boolean flag= productService.deleteProductById(2);
		if (flag==true) {
		    System.out.println("Product Deleted");
		}else {
			System.out.println("Product not deleted");
		}
		
		
	}
 
}
