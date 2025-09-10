package com.pedro.workshop_springboot_jpa.repositories;

import com.pedro.workshop_springboot_jpa.entities.OrderItem;
import com.pedro.workshop_springboot_jpa.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
