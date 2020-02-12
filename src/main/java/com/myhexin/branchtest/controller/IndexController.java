package com.myhexin.branchtest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IndexController {

    @RequestMapping("index")
    public String index() {
        return "Hello Spring";
    }
}
