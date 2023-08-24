package com.carrynong.springboot.cruddemo.repository;

import com.carrynong.springboot.cruddemo.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}
