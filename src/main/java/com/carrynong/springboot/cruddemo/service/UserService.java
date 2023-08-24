package com.carrynong.springboot.cruddemo.service;

import com.carrynong.springboot.cruddemo.entity.Employee;
import com.carrynong.springboot.cruddemo.entity.User;

public interface UserService {
    User save(User theUser);
    void deleteById(int theId);
    User findById(int theId);
}
