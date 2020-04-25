package com.cts.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.model.Category;

public interface CategoryRepository extends CrudRepository<Category,Integer>{
	Category findByCategoryId(int id);
	Category findByCategoryName(String categoryName);



	
}
