package com.hxb.controller;

import com.hxb.dao.ProductDao;
import com.hxb.pojo.EASYBUY_PRODUCT;
import com.hxb.service.ProductService;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/findByCid")
    @ResponseBody
    public String findByCid(int cid){
        System.out.println(cid+"============cid");
        List<EASYBUY_PRODUCT> list = productService.findByCid(cid);
        JSONArray productArray = new JSONArray(list);
        return productArray.toString();
    }
}
