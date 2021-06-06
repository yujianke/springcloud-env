package com.cn.service.impl;

import com.cn.customer.pojo.Customer;
import com.cn.mapper.CustomerMapper;
import com.cn.product.feign.ProductFeign;
import com.cn.product.pojo.Product;
import com.cn.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    ProductFeign productFeign;
    @Override
    public Customer findCustomer() {
        return customerMapper.findCustomer();
    }

    @Override
    public Map<String, Object> findcp(Integer pid) {
        Map<String,Object> mapvalue=new HashMap<>();
        Customer customer = customerMapper.findCustomer();
        mapvalue.put("customer",customer);
        Product product = productFeign.findproduct(pid);
        mapvalue.put("product",product);
        return mapvalue;
    }
}
