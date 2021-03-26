package com.hxb.dao;

import com.hxb.pojo.EASYBUY_PRODUCT;

import java.util.List;

public interface ProductDao {
//    根据类别ID查询商品
    public List<EASYBUY_PRODUCT> findByCid(int categoryID);
}
