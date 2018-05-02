package com.invoicingsystem.service.impl;

import com.invoicingsystem.mapper.ProductMapper;
import com.invoicingsystem.entity.Product;
import com.invoicingsystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by FLC on 2018/4/18.
 */

@Service("productServices")
@Transactional(readOnly=true,rollbackFor=Exception.class)
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getProductList() {
        return productMapper.getProductList();
    }

    @Override
    public Product getProductById(Integer id) {
        return productMapper.getProductById(id);
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,isolation= Isolation.DEFAULT,readOnly=false)
    public int updateProduct(Integer quantity,Integer id) {
        return productMapper.updateProduct(quantity,id);
    }
}
