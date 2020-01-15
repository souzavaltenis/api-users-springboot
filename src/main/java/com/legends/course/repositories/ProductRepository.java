package com.legends.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.legends.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
