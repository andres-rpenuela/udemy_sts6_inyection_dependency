package com.tokioschool.spring.di.models;

import java.math.BigDecimal;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Table(name="products")
@Entity
@Getter @Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY	)
	private Long id;	
	
	private String name;
	
	private String description;
	
	private BigDecimal price;
	
}
	