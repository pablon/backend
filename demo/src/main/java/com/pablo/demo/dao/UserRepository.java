package com.pablo.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pablo.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
