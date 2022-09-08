package com.training.web.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.web.entities.Product;
import com.training.web.exception.ProductNotFoundException;
import com.training.web.repository.ProductRepository;

@Service
public class ProductService implements IProductService{
	
	@Autowired
	private ProductRepository repo;

	@Override
	public Product addProduct(Product p) {
		return repo.save(p);
	}	

	@Override
	public void deleteProduct(Long id) {
		repo.deleteById(id);		
	}

	@Override
	public List<Product> listAllProducts() {
		return repo.findAll();
	}

	@Override
	public Product listById(Long Id) throws ProductNotFoundException {
		Optional<Product> prod = repo.findById(Id);
		return prod.orElseThrow(()->new ProductNotFoundException("Product not Found"));
	}
	
	@Override
	public Product findByName(String ProdName) throws ProductNotFoundException{
		Optional<Product> prod = Optional.ofNullable(repo.findByName(ProdName));
		return prod.orElseThrow(()->new ProductNotFoundException("Product not Found"));
	}
	
	@Override
	public Double findPriceByName(String prodName) throws ProductNotFoundException {
		Product p1 = findByName(prodName);
		return p1.getPrice();
	}
	
}
