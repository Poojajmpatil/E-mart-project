package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "category")

public class Category {
	private int id;
	private String categoryName;
	private String description;
	public int getCategoryId() {
		return id;
	}
	public void setCategoryId(int categoryId) {
		this.id = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Category(int categoryId, String categoryName, String description) {
		super();
		this.id = categoryId;
		this.categoryName = categoryName;
		this.description = description;
	}
	public Category() {
		super();
	}
	
	
	

}
