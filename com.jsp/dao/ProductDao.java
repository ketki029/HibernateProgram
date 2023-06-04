package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Product;

public class ProductDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Ketki");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();	
	
	
	//update
	public Product updateProduct(int id , Product product) {
		if(product!=null) {
			entityTransaction.begin();
			entityManager.merge(product);
			entityTransaction.commit();
			return product;
		}else {
			return null;
		}
	
	}
	
    //get all product
	public List<Product> getAllProduct(){
		String jpql="SELECT p FROM Product p";
	Query query=	entityManager.createQuery(jpql);
	List<Product> products=query.getResultList();
	return products;
	}
	
	
	//delete
	public boolean deleteProductById(int id) {
	Product product= entityManager.find(Product.class, id);
	entityTransaction.begin();
	entityManager.remove(product);
	entityTransaction.commit();
	return true;
	}
	
	
	//get by id
	public Product getProductById(int id) {
		return entityManager.find(Product.class,id);
		
	}
	
	
	
	// To save product
	public Product saveProduct(Product product) {
		
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		return product;
		
	}

}
