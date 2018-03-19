package com.pinker.controller;


import com.pinker.entity.User;
import com.pinker.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class UserController  {


    @Resource
    private UserService userService;


    @RequestMapping("/toLogin")
    public String toLogin(){
        return "/login";

    }

    @RequestMapping("/login")
    public String login(User user, HttpSession session,Model model){

        User user1= userService.login(user);
        if(user1!=null){
            session.setAttribute("user",user1);
            return "/core";
        }else {
            model.addAttribute("msg","用户名活密码错误");
            return "/login";
        }
    }

    @RequestMapping("/logout")
    public String loginOut(HttpSession session){
        session.removeAttribute("user");
        return "/login";
    }
}
