package com.pedro.workshop_springboot_jpa.repositories;

import com.pedro.workshop_springboot_jpa.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {



}
