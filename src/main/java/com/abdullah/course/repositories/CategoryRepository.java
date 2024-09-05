package com.abdullah.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdullah.course.entities.Category;
import com.abdullah.course.entities.Order;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
