package com.pedro.workshop_springboot_jpa.repositories;

import com.pedro.workshop_springboot_jpa.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
