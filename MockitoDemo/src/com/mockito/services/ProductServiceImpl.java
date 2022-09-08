package com.mockito.services;

import java.util.List;

import com.mockito.dao.ProductDAO;
import com.mockito.dao.ProductDAOImpl;
import com.mockito.entities.Product;
import com.mockito.exception.ProductNotFoundException;

public class ProductServiceImpl implements ProductService{


	//services has a dao
	private ProductDAO dao = new  ProductDAOImpl();
	
	@Override
	public Product addProduct(Product p) {
		// TODO Auto-generated method stub
		return dao.addProduct(p);
	}

	@Override
	public Product updateProduct(int id) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return dao.updateProduct(id);
	}

	@Override
	public Product deleteProduct(int id) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		Product p =  dao.listProductById(id);
		
		 dao.deleteProduct(p.getId());
		 return p;
	}

	@Override
	public Product listProductById(int id) throws ProductNotFoundException {
		// TODO Auto-generated method stub
				return dao.listProductById(id);
	}

	@Override
	public List<Product> listAllProducts() {
		// TODO Auto-generated method stub
		return dao.listAllProducts();
	}

}