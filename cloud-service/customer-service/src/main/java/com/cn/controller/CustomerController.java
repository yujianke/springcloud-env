package com.cn.controller;

import com.cn.customer.pojo.Customer;
import com.cn.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @RequestMapping("testget")
    public String testGatway(){
        return "收到请求了";
    }

    @RequestMapping("findCustomer")
    public Customer findCustomer(){
        return customerService.findCustomer();
    }

    @GetMapping("/findcp/{pid}")
    public Map<String,Object> findcp(@PathVariable("pid") Integer pid){
        return  customerService.findcp(pid);
    }
}
