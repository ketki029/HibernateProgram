	package com.jsp.service;

import java.util.List;

import com.jsp.dao.ProductDao;
import com.jsp.dto.Product;

public class ProductService {
	ProductDao productDao=new ProductDao();
	
	//save
	public Product saveProduct(Product product) {
		return  productDao.saveProduct(product);
		}
	//get by id
	public Product getProductById(int id) {
		if(id>0) {
			return productDao.getProductById(id);
			}
		else {
			return null;
		}
	}
	
	
	//delete
	public boolean deleteProductById(int id) {
		if(id>0) {
			return productDao.deleteProductById(id);
		}else {
			return false;
		}
	}
	
	
	//get all product
	public List<Product> getAllProduct(){
		return productDao.getAllProduct();
		
	}
	
	
	
	//update
	public Product updateProduct(int id ,String name) {
	Product product =	productDao.getProductById(id);
	product.setName(name);
	return productDao.updateProduct(id, product);
	}

}
