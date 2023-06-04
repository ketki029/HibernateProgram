package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class GetAllProduct {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		List<Product> products= productService.getAllProduct();
		for(Product p:products) {
			System.out.println(p.getId());
			System.out.println(p.getBrand());
			System.out.println(p.getName());
			System.out.println("=============");
		}
	}

}
