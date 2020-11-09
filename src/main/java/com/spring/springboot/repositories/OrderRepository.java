package com.spring.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springboot.entities.Order;



public interface OrderRepository extends JpaRepository<Order, Long> {

}
