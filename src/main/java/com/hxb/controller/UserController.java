package com.hxb.controller;

import com.hxb.dao.UserDao;
import com.hxb.pojo.EASYBUY_USER;
import com.hxb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(){
        return "login002.html";
    }

    @RequestMapping("/login")
//    @ResponseBody
    public String login(String uname,String upass){
        System.out.println(uname+","+upass);
        EASYBUY_USER user = userService.login(uname, upass);
        if(user!=null){
            return "redirect:/to_main.html";
        }
        return "redirect:/error.html";
    }
}
