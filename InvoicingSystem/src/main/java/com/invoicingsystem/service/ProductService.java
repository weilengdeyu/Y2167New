package com.invoicingsystem.service;

import com.invoicingsystem.entity.Product;

import java.util.List;

/**
 * Created by FLC on 2018/4/19.
 */
public interface ProductService {
    //查询
    List<Product> getProductList();
    //查询库存
    Product getProductById(Integer id);

    int updateProduct(Integer quantity,Integer id);
}
