package com.pedro.workshop_springboot_jpa.services;

import com.pedro.workshop_springboot_jpa.entities.Order;
import com.pedro.workshop_springboot_jpa.entities.User;
import com.pedro.workshop_springboot_jpa.repositories.OrderRepository;
import com.pedro.workshop_springboot_jpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
