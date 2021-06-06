package com.cn.mapper;

import com.cn.customer.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {
    public Customer findCustomer();
}
