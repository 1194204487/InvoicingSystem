package com.pinker.controller;

import com.github.pagehelper.PageInfo;
import com.pinker.entity.Product;
import com.pinker.entity.Sale;
import com.pinker.entity.SaleCustom;
import com.pinker.entity.User;
import com.pinker.mapper.ProductMapper;
import com.pinker.mapper.SaleMapper;
import com.pinker.service.ProductService;
import com.pinker.service.SaleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class SaleController {

    @Resource
    private ProductService productService;
    @Resource
    private SaleService saleService;

    @RequestMapping("/toAddSale")
    public String toAddSale(Model model){
        model.addAttribute("sale",new Sale());
        return "/addSale";
    }

    @RequestMapping("/addSale")
    public String addSale( HttpSession session,Sale sale,Model model){
        User user= (User) session.getAttribute("user");
        saleService.sale(sale.getProductid(),sale.getQuantity(),user,sale.getPrice());
        model.addAttribute("msg","添加销售成功");
        return "/addSale";
    }


    @RequestMapping("/findSalePage")
    public String findSalePage(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                               @RequestParam(value = "label",required = false) String label
                               ,Model model){
        PageInfo<SaleCustom> page = saleService.getAllPage(pageNum, 5, 0, label);
        model.addAttribute("page",page);

        return "/saleList";

    }


    @ModelAttribute(value = "productList")
    public void getProduct(Model model){
        List<Product> productList = productService.findProductList(null);
        model.addAttribute("productList",productList);
    }
}
