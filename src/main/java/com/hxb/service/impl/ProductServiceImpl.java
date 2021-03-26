package com.hxb.service.impl;

import com.hxb.dao.ProductDao;
import com.hxb.pojo.EASYBUY_PRODUCT;
import com.hxb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public List<EASYBUY_PRODUCT> findByCid(int cid) {
        return productDao.findByCid(cid);
    }
}
