package com.training.web.service;

import java.util.List;

import com.training.web.entities.Product;
import com.training.web.exception.ProductNotFoundException;

public interface IProductService {
	Product addProduct(Product p);
	Double findPriceByName(String prodName) throws ProductNotFoundException;
	void deleteProduct(Long id);
	List<Product> listAllProducts();
	Product listById(Long Id) throws ProductNotFoundException;
	Product findByName(String ProdName) throws ProductNotFoundException;
}
