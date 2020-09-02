package com.examplepoo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examplepoo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
