package com.cn.service;

import com.cn.customer.pojo.Customer;

import java.util.Map;

public interface CustomerService {
      public Customer findCustomer();

      Map<String, Object> findcp(Integer pid);
}
