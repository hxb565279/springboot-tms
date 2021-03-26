package com.hxb.controller;

import com.hxb.dao.UserDao;
import com.hxb.pojo.EASYBUY_USER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 和学博
 */
@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/")
    public String index(){
        return "login.html";
    }

    @RequestMapping("/login")

    public String login(String uname,String upass){
        System.out.println(uname+","+upass);
        EASYBUY_USER user = userDao.login(uname, upass);
        if(user!=null){
            return "redirect:/main.html";
        }
        return "redirect:/error.html";
    }
}
