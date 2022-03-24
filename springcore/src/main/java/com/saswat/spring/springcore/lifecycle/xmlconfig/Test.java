package com.saswat.spring.springcore.lifecycle.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/saswat/spring/springcore/lifecycle/xmlconfig/config.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		context.registerShutdownHook();//specially for destroy() method
		
	}

}
