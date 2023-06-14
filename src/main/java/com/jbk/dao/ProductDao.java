package com.jbk.dao;

import java.util.List;

import com.jbk.entity.Product;

public interface ProductDao {

	public boolean saveProduct(Product product);

	public List<Product> getAllProducts();
	
	public Product getMaxPriceProducts();
	
	
}
