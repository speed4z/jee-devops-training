package com.training.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.web.entities.Product;
import com.training.web.exception.ProductNotFoundException;

public interface ProductRepository extends JpaRepository<Product , Long>{
	public Product findByName(String ProdName) throws ProductNotFoundException;
}
