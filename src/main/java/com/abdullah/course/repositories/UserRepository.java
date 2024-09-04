package com.abdullah.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdullah.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
