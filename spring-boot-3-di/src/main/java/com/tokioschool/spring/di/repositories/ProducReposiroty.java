package com.tokioschool.spring.di.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tokioschool.spring.di.models.Product;

@Repository
public interface ProducReposiroty extends JpaRepository<Product, Long>{

}
