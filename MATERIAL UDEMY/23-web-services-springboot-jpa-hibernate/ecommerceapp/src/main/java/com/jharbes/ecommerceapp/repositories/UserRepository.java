package com.jharbes.ecommerceapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jharbes.ecommerceapp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
