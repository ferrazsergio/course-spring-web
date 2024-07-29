package com.educandoweb.course.entities;

public class Category {
	
	private Long id;
	private String nameString;
	
	public Category() {
		
	}

		
		
	public Category(Long id, String nameString) {
		super();
		this.id = id;
		this.nameString = nameString;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	
	
}
