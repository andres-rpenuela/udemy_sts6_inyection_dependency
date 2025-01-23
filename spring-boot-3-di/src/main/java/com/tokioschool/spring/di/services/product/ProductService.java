package com.tokioschool.spring.di.services.product;

import java.util.List;

import com.tokioschool.spring.di.models.Product;

public interface ProductService {
	
	List<Product> findAll();
	Product getById(Long id);
	
}
