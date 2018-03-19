package com.pinker.mapper;

import com.pinker.entity.Sale;
import com.pinker.entity.SaleCustom;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleMapper {

    void insertSale(Sale sale);

    List<SaleCustom> getSaleList(Sale sale);
}
