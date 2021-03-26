package com.hxb.service.impl;

import com.hxb.dao.UserDao;
import com.hxb.pojo.EASYBUY_USER;
import com.hxb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 和学博
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public EASYBUY_USER login(String name, String password) {
        return userDao.login(name,password);
    }
}
