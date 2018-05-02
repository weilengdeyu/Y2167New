package com.invoicingsystem.mapper;

/**
 * Created by FLC on 2018/4/18.
 */

import com.invoicingsystem.entity.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * 商品Dao
 */
@Repository
public interface ProductMapper {
    //查询
    public List<Product> getProductList();
    //查询库存
    public Product getProductById(Integer id);
    //修改库存
    int updateProduct(@Param("quantity") Integer quantity, @Param("id") Integer id);
}
