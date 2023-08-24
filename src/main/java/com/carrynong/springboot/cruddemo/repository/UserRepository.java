package com.carrynong.springboot.cruddemo.repository;

import com.carrynong.springboot.cruddemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
