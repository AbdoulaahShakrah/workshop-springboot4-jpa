package com.abdullah.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdullah.course.entities.Category;
import com.abdullah.course.entities.Order;
import com.abdullah.course.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
