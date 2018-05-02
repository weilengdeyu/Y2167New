package com.invoicingsystem.controller;

import com.github.pagehelper.PageInfo;
import com.invoicingsystem.entity.Product;
import com.invoicingsystem.entity.Sale;
import com.invoicingsystem.entity.Users;
import com.invoicingsystem.service.ProductService;
import com.invoicingsystem.service.SaleService;
import com.invoicingsystem.service.impl.SaleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by FLC on 2018/4/18.
 */
@Controller
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    private SaleService saleServices;
    @Autowired
    private ProductService productServices;

    @RequestMapping("/insertSale")
    public String insertSale(Sale sale, HttpServletResponse response, HttpServletRequest request,Model model) throws IOException {
        //验证库存
        Users user = (Users) request.getSession().getAttribute("user");
        List<Product> prolist = (List<Product>) request.getSession().getAttribute("prolist");
        model.addAttribute("usermodel", user);
        model.addAttribute("productList",prolist);
        Product productById = productServices.getProductById(sale.getProductId());
        System.out.println("productById============"+sale.getQuantitys());
        if (sale.getQuantitys() > productById.getQuantity()) {
            response.setContentType("text/html; charset=UTF-8"); //转码
            PrintWriter out = response.getWriter();
            out.flush();
            out.println("<script>");
            out.println("alert('库存不足！');");
            out.println("</script>");
            return "main";
        } else {
            //修改库存

            Integer number = productById.getQuantity() - sale.getQuantitys();
            productServices.updateProduct(number, sale.getProductId());
            //添加记录

            System.out.println("userid==============" + user.getId());
            Sale sales = new Sale();
            sales.setPrice(sale.getPrice());
            sales.setQuantitys(sale.getQuantitys());

            sales.setProductId(sale.getProductId());

            sales.setSaleDate(new Date());
            sales.setTotalPrice(sale.totalPrices(sale.getQuantitys(),sale.getPrice()));
            sales.setUserId(user.getId());
            int i = saleServices.insertSale(sales);
            if(i>=0)
            {
                response.setContentType("text/html; charset=UTF-8"); //转码
                PrintWriter out = response.getWriter();
                out.flush();
                out.println("<script>");
                out.println("alert('添加成功！');");
                out.println("</script>");
                return "main";
            }
            else{
                response.setContentType("text/html; charset=UTF-8"); //转码
                PrintWriter out = response.getWriter();
                out.flush();
                out.println("<script>");
                out.println("alert('添加失败！');");
                out.println("</script>");
                return "main";
            }

        }


    }
    @RequestMapping("/salelist")
    @ResponseBody
    public Object saleList(@RequestParam(value="order", defaultValue="销售日期")String order, @RequestParam(required = false, defaultValue="1")int pageNum, @RequestParam(required = false, defaultValue="5")int pageSize)
    {
        System.out.println(order+"===========>order");
        System.out.println(pageNum+"============>"+pageNum);
        PageInfo<Sale> saleList = saleServices.getSaleList(order, (pageNum+1), pageSize);

        System.out.println("当前页数"+saleList.getPageNum());
        System.out.println("记录数："+saleList.getSize());
        for (Sale u : saleList.getList())
        {
            System.out.println("查询出来的id:"+u.getId());

        }
        for(Sale u : saleList.getList()){
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            String format1 = format.format(u.getSaleDate());
            u.setDatetime(format1);
        }
        return saleList;

    }
}
