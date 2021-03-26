package com.hxb.dao;

import com.hxb.pojo.EASYBUY_USER;

/**
 * @author 和学博
 */
public interface UserDao {

    public EASYBUY_USER login(String name,String password);
}
