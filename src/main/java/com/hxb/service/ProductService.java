package com.hxb.service;

import com.hxb.pojo.EASYBUY_PRODUCT;

import java.util.List;

public interface ProductService {

    public List<EASYBUY_PRODUCT> findByCid(int cid);
}
