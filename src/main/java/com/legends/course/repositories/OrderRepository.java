package com.legends.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.legends.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
