package com.hxb.controller;

import com.hxb.dao.CategoryDao;
import com.hxb.pojo.EASYBUY_PRODUCT_CATEGORY;
import com.hxb.service.CategoryService;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll(){
        List<EASYBUY_PRODUCT_CATEGORY> list = categoryService.findAll();
        JSONArray array = new JSONArray(list);
        return array.toString();

    }
}
