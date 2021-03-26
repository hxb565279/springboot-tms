package com.hxb.service.impl;

import com.hxb.dao.CategoryDao;
import com.hxb.pojo.EASYBUY_PRODUCT_CATEGORY;
import com.hxb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 和学博
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;
    @Override
    public List<EASYBUY_PRODUCT_CATEGORY> findAll() {
        return categoryDao.findAll();
    }
}
