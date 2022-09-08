package com.mockito.specs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.mockito.dao.ProductDAO;
import com.mockito.dao.ProductDAOImpl;
import com.mockito.entities.Product;
import com.mockito.services.ProductService;
import com.mockito.services.ProductServiceImpl;


class ProductTest {
	
	@Mock
	ProductDAO dao;
	
	//inject dao mock in the service object
	@InjectMocks
	ProductService applicantService = new ProductServiceImpl();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	@BeforeEach
	void setUp(){
		MockitoAnnotations.initMocks(this);
		Product p1 = new Product(1,"nike",20,3000.00);
	}	


	@Test
	void testAddProduct() {
		when(dao.addProduct(p1).thenReturn((p1));
		Assertions.assertEquals(p1, ProductService.addProduct(p1));
	}

}
