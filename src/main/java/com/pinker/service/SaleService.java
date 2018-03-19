package com.pinker.service;

import com.github.pagehelper.PageInfo;
import com.pinker.entity.Sale;
import com.pinker.entity.SaleCustom;
import com.pinker.entity.User;


public interface SaleService {

    void sale(Long productid, Long quantity, User user,Double price);

    PageInfo<SaleCustom> getAllPage(Integer pageNum, Integer pageSize, Integer orderId, String label);
}
