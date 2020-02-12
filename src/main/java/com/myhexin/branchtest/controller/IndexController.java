package com.myhexin.branchtest.controller;

import com.myhexin.branchtest.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("index")
    public String index() {
        return indexService.index();
    }
}
