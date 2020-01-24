package com.legends.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.legends.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
