package com.carrynong.springboot.cruddemo.service;

import com.carrynong.springboot.cruddemo.entity.Authority;
import com.carrynong.springboot.cruddemo.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityServiceImpl implements AuthorityService {

    private AuthorityRepository authorityRepository;

    @Autowired
    public AuthorityServiceImpl(AuthorityRepository authorityRepository) {
        this.authorityRepository = authorityRepository;
    }

    @Override
    public Authority save(Authority theAuthority) {
        return authorityRepository.save(theAuthority);
    }

}
