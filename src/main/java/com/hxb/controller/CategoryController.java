package com.hxb.controller;

import com.hxb.dao.CategoryDao;
import com.hxb.pojo.EASYBUY_PRODUCT_CATEGORY;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 和学博
 */
@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryDao categoryDao;

    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll(){
        List<EASYBUY_PRODUCT_CATEGORY> list = categoryDao.findAll();
        JSONArray array = new JSONArray(list);
        return array.toString();

    }
}
