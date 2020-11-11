package com.spring.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springboot.entities.OrderItem;
import com.spring.springboot.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
