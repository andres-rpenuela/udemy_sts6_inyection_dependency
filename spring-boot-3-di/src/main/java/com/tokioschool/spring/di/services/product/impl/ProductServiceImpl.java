package com.tokioschool.spring.di.services.product.impl;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tokioschool.spring.di.models.Product;
import com.tokioschool.spring.di.repositories.ProducReposiroty;
import com.tokioschool.spring.di.services.product.ProductService;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

	private final ProducReposiroty producReposiroty;
	
	@PostConstruct
	public void postConstruct() {
		List<Product> products = Arrays.asList(
				Product.builder().name("Memory").description("Memory corsair 32").price(new BigDecimal(300)).build(),
				Product.builder().name("Cpu").description("C2").price(new BigDecimal(850)).build(),
				Product.builder().name("Keyword").description("KeyWord Razer Mini 60%").price(new BigDecimal(180)).build(),
				Product.builder().name("Motherboard").description("Motherboard Gigabyte").price(new BigDecimal(490)).build()
				);
		
		producReposiroty.saveAll(products);
	}
	
	public List<Product> findAll(){
		return producReposiroty.findAll();
	}
	
	public Product getById(Long id) {
		return producReposiroty.findById(id).orElseGet(() -> null);
	}
}
