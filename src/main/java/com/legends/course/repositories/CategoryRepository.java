package com.legends.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.legends.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
