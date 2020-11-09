package com.spring.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springboot.entities.User;



public interface UserRepository extends JpaRepository<User, Long> {

}
