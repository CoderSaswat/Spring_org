package com.saswat.spring.springcoreadvanced.stereotype.annotaion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {
	@Value("10")
	private int id;
	@Value("saswat kumar")
	private String name;
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
