package com.jharbes.ecommerceapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jharbes.ecommerceapp.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
