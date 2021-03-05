package com.SiphindileTradClothing.model;
import javax.persistence.Id;

public class Category {
	@Id
	long category_id;
	String name;
	public long getId() {
		return category_id;
	}
	public void setId(long category_id) {
		this.category_id = category_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	
	
	

}
