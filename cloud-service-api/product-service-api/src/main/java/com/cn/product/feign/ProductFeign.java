package com.cn.product.feign;

import com.cn.product.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="cloud-product")
@RequestMapping("api/product")
public interface ProductFeign {
    @GetMapping("/findproduct/{pid}")
    Product findproduct(@PathVariable("pid") Integer pid);
}
