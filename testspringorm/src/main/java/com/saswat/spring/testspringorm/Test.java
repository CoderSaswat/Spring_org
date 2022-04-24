package com.saswat.spring.testspringorm;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/saswat/spring/testspringorm/config.xml");
			
	}
}
