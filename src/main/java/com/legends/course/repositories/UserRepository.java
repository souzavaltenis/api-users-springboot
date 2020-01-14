package com.legends.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.legends.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
