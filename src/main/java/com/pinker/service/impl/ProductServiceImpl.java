package com.pinker.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pinker.entity.Product;
import com.pinker.mapper.ProductMapper;
import com.pinker.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {


    @Resource
    private ProductMapper productMapper;

    @Override
    public List<Product> findProductList(Product product) {
        return productMapper.findProductList(product);
    }

    @Override
    public PageInfo<Product> findProductPage(Integer pageNum, Integer pageSize,String orderStand) {
        PageHelper.startPage(pageNum,pageSize,orderStand);
        List<Product> list = productMapper.findProductList(null);
        PageInfo<Product> page=new PageInfo<>(list);
        return page;
    }

    @Override
    public Product findProdduct(Integer id) {
        return productMapper.findProduct(id);
    }


}
