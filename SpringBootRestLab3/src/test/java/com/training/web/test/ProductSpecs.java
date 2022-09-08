package com.training.web.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.training.web.entities.Product;
import com.training.web.exception.ProductNotFoundException;
import com.training.web.repository.ProductRepository;
import com.training.web.service.IProductService;
import com.training.web.service.ProductService;

@SpringBootTest
public class ProductSpecs {
	
	@Mock
	ProductRepository repo;
	
	@InjectMocks
	IProductService service = new ProductService();
	List<Product> products = new ArrayList<>();
	
	Product p1,p2,p3;
	@SuppressWarnings("deprecation")
	@Before(value="")
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	@BeforeEach
	void setUp() throws Exception {
		p1 = new Product("Laptop",45678.34);
		p2 = new Product("Ipad",65678.84);
		p3 = new Product("Iphone",84678.34);
		
		products.add(p1);
		products.add(p2);
		products.add(p3);		
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testAddDepartment() {
		when(repo.save(p1)).thenReturn(p1);
		Product retVal = service.addProduct(p1);
		assertEquals(p1, retVal);
	}
	
	@Test
	void getAllProducts() {
		when(repo.findAll()).thenReturn(products);
		List<Product> lst = service.listAllProducts();
		assertEquals(products, lst);
	}
	
	@Test
	void getById() throws ProductNotFoundException {
		when(repo.findById(p1.getId())).thenReturn(Optional.of(p1));
		Product prod = service.listById(p1.getId());
		assertEquals(prod, p1);
	}
	
	
}
