package com.myhexin.branchtest.service;

import org.springframework.stereotype.Service;

@Service
public class IndexService {
    public String index() {
        return "Hello Spring Boot";
    }
}
