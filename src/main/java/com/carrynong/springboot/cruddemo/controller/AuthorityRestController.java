package com.carrynong.springboot.cruddemo.controller;

import com.carrynong.springboot.cruddemo.entity.Authority;
import com.carrynong.springboot.cruddemo.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthorityRestController {

    private AuthorityService authorityService;

    @Autowired
    public AuthorityRestController(AuthorityService authorityService) {
        this.authorityService = authorityService;
    }

    // add mapping for POST /employees - add new employee

    @PostMapping("/authorities")
    public Authority addAuthority(@RequestBody Authority theAuthority) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        Authority dbAuthority = authorityService.save(theAuthority);

        return dbAuthority;
    }

}














