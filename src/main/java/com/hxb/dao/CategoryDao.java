package com.hxb.dao;

import com.cui.springboot_tms.pojo.EASYBUY_PRODUCT_CATEGORY;

import java.util.List;

public interface CategoryDao {

    public List<EASYBUY_PRODUCT_CATEGORY> findAll();
}
