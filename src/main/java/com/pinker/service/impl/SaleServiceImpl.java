package com.pinker.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pinker.entity.Product;
import com.pinker.entity.Sale;
import com.pinker.entity.SaleCustom;
import com.pinker.entity.User;
import com.pinker.mapper.ProductMapper;
import com.pinker.mapper.SaleMapper;
import com.pinker.service.SaleService;
import com.pinker.utils.OrderUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;


@Service
public class SaleServiceImpl implements SaleService{
    @Resource
    private SaleMapper saleMapper;

    @Resource
    private ProductMapper productMapper;

    @Override
    public void sale(Long productid, Long quantity, User user,Double price) {
        Sale sale=new Sale();
        sale.setProductid(productid);
        sale.setQuantity(quantity);
        sale.setUserid(user.getId());
        sale.setSaledate(new Date(System.currentTimeMillis()));
        sale.setPrice(price);
        sale.setTotalprice(quantity*price);
        saleMapper.insertSale(sale);

        //销售后产品表数量减少
        Product product=new Product();
        Long currentQuantity = productMapper.findProduct(Math.toIntExact(productid)).getQuantity();
        product.setId(productid);
        product.setQuantity(currentQuantity-quantity);
        productMapper.updateProduct(product);

    }

    @Override
    public PageInfo<SaleCustom> getAllPage (Integer pageNum, Integer pageSize, Integer orderId, String label) {
        PageHelper.startPage(pageNum,pageSize, OrderUtil.getOrder(orderId,label));
        List<SaleCustom> list = saleMapper.getSaleList(null);
        PageInfo<SaleCustom> page=new PageInfo<>(list);
        return page;
    }
}
