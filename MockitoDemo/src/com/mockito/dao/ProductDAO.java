package com.mockito.dao;

import java.util.List;
import com.mockito.entities.Product;
import com.mockito.exception.ProductNotFoundException;

public interface ProductDAO {
	
	Product addProduct(Product p);
	Product updateProduct(int id) throws  ProductNotFoundException;
	void deleteProduct(int id) throws ProductNotFoundException;
	Product listProductById(int id) throws ProductNotFoundException;
	List<Product> listAllProducts();
	
}