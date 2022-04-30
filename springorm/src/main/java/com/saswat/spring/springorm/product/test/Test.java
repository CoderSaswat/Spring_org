package com.saswat.spring.springorm.product.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saswat.spring.springorm.product.dao.ProductDao;
import com.saswat.spring.springorm.product.entity.Product;

public class Test {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				" com/saswat/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDaoImpl");

		Product product = new Product();
		product.setId(519);
		product.setName("laptop");
		product.setDesc("best laptop");
		product.setPrice(13);

		productDao.insert(product);

	}
}
