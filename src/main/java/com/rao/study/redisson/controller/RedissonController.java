package com.rao.study.redisson.controller;

import com.rao.study.redisson.service.RedissonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedissonController {

    @Autowired
    private RedissonService redissonService;

    @GetMapping(value = "/testRedisson")
    public void testRedisson(){
        redissonService.testRedisson();
    }
}
