package com.saswat.spring.boot.springdatajpa.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.saswat.spring.boot.springdatajpa.data.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
