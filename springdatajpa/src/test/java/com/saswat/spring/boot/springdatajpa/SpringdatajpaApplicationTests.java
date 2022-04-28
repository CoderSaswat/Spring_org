package com.saswat.spring.boot.springdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.saswat.spring.boot.springdatajpa.data.repos.ProductRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {
	@Autowired
	ApplicationContext context;

	@Test
	void saveProduct() {
		ProductRepository repository = context.getBean(ProductRepository.class);

//		insert a record
//		Product product = new Product();
//		product.setId(2l);
//		product.setName("mac book pro");
//		product.setPrice(80d);
//		product.setDescription("i will buy a mac book pro in 2023");
//		repository.save(product);

//		fetch one record by id
//		Optional<Product> optional = repository.findById(1l);
//		if(optional.isPresent()){
//			Product newProduct = optional.get();
//			System.out.println(newProduct);
//		}else {
//			System.out.println("table is empty");
//		}

//		update and set new values of the object overiding the old values
//		product.setPrice(100d);
//		repository.save(product);

//		fetch all records
//		Iterable<Product> findAll = repository.findAll();
//		findAll.forEach(product->System.out.println(product));

//		delete by id
//		repository.deleteById(2L);

	}

}
