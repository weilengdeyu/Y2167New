package com.invoicingsystem.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.invoicingsystem.mapper.SaleMapper;
import com.invoicingsystem.entity.Sale;
import com.invoicingsystem.service.SaleService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by FLC on 2018/4/18.
 */
@Service("saleServices")
@Transactional(readOnly=true,rollbackFor=Exception.class)
public class SaleServiceImpl implements SaleService{
    @Autowired
    private SaleMapper saleMapper;

    @Override
    @Transactional(propagation= Propagation.REQUIRED,isolation= Isolation.DEFAULT,readOnly=false)
    public int insertSale(Sale sale) {
        return saleMapper.insertSale(sale);
    }

    @Override
    public PageInfo<Sale> getSaleList(String order, int pageNum, int pageSize) {
        Page<Sale> page = PageHelper.startPage(pageNum, pageSize);
        saleMapper.getSaleList(order);
        return page.toPageInfo();
    }
}
