package com.invoicingsystem.mapper;

/**
 * Created by FLC on 2018/4/18.
 */

import com.invoicingsystem.entity.Sale;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * 销售Dao
 */
@Repository
public interface SaleMapper {
    //销售
    public int insertSale(Sale sale);
    //查询
    public List<Sale> getSaleList(@Param("order")String order);
}
