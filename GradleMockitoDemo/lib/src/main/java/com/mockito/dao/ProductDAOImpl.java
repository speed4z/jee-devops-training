package com.mockito.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mockito.entities.Product;
import com.mockito.exception.ProductNotFoundException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;


public class ProductDAOImpl implements ProductDAO {

	@Override
	public Product addProduct(Product p) {
		// TODO Auto-generated method stub
		return p;
	}

	@Override
	public Product updateProduct(int id) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(int id) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Product listProductById(int id) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> listAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}