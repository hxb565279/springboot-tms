package com.hxb.dao;

import com.hxb.pojo.EASYBUY_USER;

public interface UserDao {

    public EASYBUY_USER login(String name, String password);
}
