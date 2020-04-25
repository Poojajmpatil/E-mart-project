package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.CategoryRepository;
import com.cts.model.Category;

@Service

public class CategoryService {
	@Autowired
	
	CategoryRepository repo;
	
	public List<Category> getAllCategories(){
		return (List<Category>)repo.findAll();
		
	}
	public void addCategory(Category category) {
		
		repo.save(category);
	}
public void updateCategory(Category category) {
		
		repo.save(category);
	}

public void deleteCategory(int id) {
	
	repo.deleteById(id);
}


public Category getCategoryByCategoryName(String categoryName) {
	
	return repo.findByCategoryName(categoryName);
}
public Optional<Category> getCategoryDetailsById(int id){
	return repo.findById(id);
	
	
}

}
