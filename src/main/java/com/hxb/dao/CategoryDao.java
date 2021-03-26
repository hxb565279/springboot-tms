package com.hxb.dao;

import com.hxb.pojo.EASYBUY_PRODUCT_CATEGORY;

import java.util.List;

/**
 * @author 和学博
 */
public interface CategoryDao {

    public List<EASYBUY_PRODUCT_CATEGORY> findAll();
}
