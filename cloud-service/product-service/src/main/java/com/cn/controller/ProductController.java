package com.cn.controller;

import com.cn.product.pojo.Product;
import com.cn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("test")
    public String getString(){
        return  "product 连接成功";
    }
    @GetMapping("/findproduct/{pid}")
    public Product findproduct(@PathVariable("pid") Integer pid){
        return productService.findproduct(pid);
    }

}
