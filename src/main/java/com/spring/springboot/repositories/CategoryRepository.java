package com.spring.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
