package com.saswat.spring.springcoreadvanced.stereotype.annotaion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	@Value("10")
	private int noOfCourses;
	@Value("500")
	private int noOfVideos;
	@Value("thoughtclan")
	private String companyName;

	public int getNoOfCourses() {
		return noOfCourses;
	}

	public void setNoOfCourses(int noOfCourses) {
		this.noOfCourses = noOfCourses;
	}

	public int getNoOfVideos() {
		return noOfVideos;
	}

	public void setNoOfVideos(int noOfVideos) {
		this.noOfVideos = noOfVideos;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Profile [noOfCourses=" + noOfCourses + ", noOfVideos=" + noOfVideos + ", companyName=" + companyName
				+ "]";
	}

}
