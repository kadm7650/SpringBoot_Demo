package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Product;
import com.jbk.service.ProductService;
import com.jbk.serviceIMPL.ProductServiceIMPL;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	// ProductService service = new ProductServiceIMPL();
	@Autowired
	private ProductService service;

	@PostMapping("/save-product")
	public String saveProduct(@RequestBody Product product) {
		boolean isAdded = service.saveProduct(product);

		if (isAdded) {
			return "saved...";
		} else {
			return "Already Exist";
		}

	}

	@GetMapping("/get-all-product")

	public Object getAllProducts() {

		List<Product> list = service.getAllProducts();
		if (list.isEmpty()) {
			return "Product Not Exist";
		} else {
			return list;
		}

	}

	@GetMapping("/get-maxprice-product")
	public Product getMaxPriceProduct() {
		Product product = service.getMaxPriceProducts();
		return product;

	}

}
