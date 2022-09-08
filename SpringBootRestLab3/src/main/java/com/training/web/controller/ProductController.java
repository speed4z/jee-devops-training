package com.training.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.web.entities.Product;
import com.training.web.exception.ProductNotFoundException;
import com.training.web.service.IProductService;

@RestController
public class ProductController {
	
	@Autowired
	private IProductService service;

	
	@GetMapping("/products")
	public List<Product> getProds(){
		return service.listAllProducts();
	}
	
	@PostMapping("/products")
    public Product addProduct(@Valid @RequestBody Product p) {

        return service.addProduct(p);
    }
	
	@GetMapping("/products/{id}")
	public Product getProds(@PathVariable("id") Long id) throws ProductNotFoundException{
		return service.listById(id);
	}
	
	@GetMapping("/products/findPriceByName/{name}")
	public Double getPriceByName(@PathVariable("name")String name) throws ProductNotFoundException{
		return service.findPriceByName(name);
	}
	
	@DeleteMapping("/products/{id}")
	public String deleteProduct(@PathVariable("id") Long id) {
		service.deleteProduct(id);
		return "Deleted";
	}
	
}
