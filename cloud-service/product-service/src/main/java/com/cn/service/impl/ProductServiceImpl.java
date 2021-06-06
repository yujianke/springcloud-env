package com.cn.service.impl;

import com.cn.mapper.ProducrMapper;
import com.cn.product.pojo.Product;
import com.cn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProducrMapper producrMapper;

    @Override
    public Product findproduct(Integer pid) {
        return producrMapper.findproduct(pid);
    }
}
