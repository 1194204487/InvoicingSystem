package com.pinker.service;

import com.github.pagehelper.PageInfo;
import com.pinker.entity.Product;

import java.util.List;

public interface ProductService {


    List<Product> findProductList(Product product);

    PageInfo<Product> findProductPage(Integer pageNum,Integer pageSize,String orderStand);

    Product findProdduct(Integer id);
}
