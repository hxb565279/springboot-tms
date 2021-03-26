package com.hxb.dao;

import com.cui.springboot_tms.pojo.EASYBUY_USER;

public interface UserDao {

    public EASYBUY_USER login(String name,String password);
}
