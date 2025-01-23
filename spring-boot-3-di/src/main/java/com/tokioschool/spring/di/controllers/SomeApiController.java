package com.tokioschool.spring.di.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tokioschool.spring.di.models.Product;
import com.tokioschool.spring.di.services.product.ProductService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class SomeApiController {

	private final ProductService productService;
	
	@GetMapping
	public List<Product> listHandler(){
		return productService.findAll();
	}
	
	@GetMapping("/{id}")
	//@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Product byIdHandler(@PathVariable("id") Long id) {
		log.info("id {}",id);
		return productService.getById(id);
	}
}
