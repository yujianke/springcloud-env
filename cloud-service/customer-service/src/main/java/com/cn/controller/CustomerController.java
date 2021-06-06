package com.cn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/customer")
public class CustomerController {
    @RequestMapping("testget")
    public String testGatway(){
        return "收到请求了";
    }
}
