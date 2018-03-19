package com.pinker.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.pinker.entity.Product;
import com.pinker.mapper.ProductMapper;
import com.pinker.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ProductController {

    @Resource
    private ProductService productService;

    @RequestMapping("/getProductPage")
    public String getProductPage(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, Model model,@RequestParam(value = "orderStand",defaultValue = "productname desc")String orderStand ) {
        PageInfo<Product> page = productService.findProductPage(pageNum, 5,orderStand);
        model.addAttribute("page",page);
        return "/productPage";
    }


    @RequestMapping("/toInventory")
    public String getProductList(Model model){
        List<Product> productList = productService.findProductList(null);
        model.addAttribute("productList",productList);
        model.addAttribute("product",new Product());
        return "/inventory";
    }

    @RequestMapping("/getInventory")
    @ResponseBody
    public String getInventory(Model model,Integer id){
        Product prodduct = productService.findProdduct(id);
        String quantity = JSON.toJSONString(prodduct.getQuantity());
        return quantity;
    }

}
