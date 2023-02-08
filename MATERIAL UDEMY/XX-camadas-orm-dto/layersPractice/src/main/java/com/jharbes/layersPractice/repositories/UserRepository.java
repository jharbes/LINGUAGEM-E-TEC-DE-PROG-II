package com.jharbes.layersPractice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jharbes.layersPractice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
