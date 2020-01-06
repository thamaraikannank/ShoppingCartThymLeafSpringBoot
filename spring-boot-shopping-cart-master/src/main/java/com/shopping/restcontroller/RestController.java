package com.shopping.restcontroller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.shopping.model.Product;
import com.shopping.service.ProductService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	ProductService productService;
	
	@GetMapping("/getAllProducts")
	public List<Product> findAllProduct(){
		List<Product> prod = productService.findAllProduct();
		Comparator<Product> priceComp = (p1,p2) -> p1.getPrice().compareTo(p2.getPrice());
		Collections.sort(prod,priceComp);
		return prod;
	}
   
}
