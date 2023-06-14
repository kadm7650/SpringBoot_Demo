package com.jbk.service;

import java.util.List;

import com.jbk.entity.Product;

public interface ProductService {

	public boolean saveProduct(Product product);
	
	public List<Product> getAllProducts();
}
