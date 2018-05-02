package com.invoicingsystem.service;

import com.github.pagehelper.PageInfo;
import com.invoicingsystem.entity.Sale;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by FLC on 2018/4/19.
 */
public interface SaleService {
    //销售
    int insertSale(Sale sale);
    //查询
    PageInfo<Sale> getSaleList(String order,int pageNum,int pageSize);
}
