package com.pinker.mapper;

import com.pinker.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {

     List<Product> findProductList(Product product);

    void updateProduct(Product product);

    Product findProduct(Integer id);
 }
