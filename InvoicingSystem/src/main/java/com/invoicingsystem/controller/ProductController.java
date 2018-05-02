package com.invoicingsystem.controller;

import com.invoicingsystem.entity.Product;
import com.invoicingsystem.service.ProductService;
import com.invoicingsystem.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by FLC on 2018/4/18.
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productServices;
    @RequestMapping("/getProductById")
    @ResponseBody
    public Integer getProductById(Integer id)
    {
        Product productById = productServices.getProductById(id);
        Integer quantity = productById.getQuantity();
        return quantity;

    }
}
