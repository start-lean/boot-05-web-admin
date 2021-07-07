package com.atguigu.controller;

import com.atguigu.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * @author Hello
 * 2021/7/7 0007-14:02
 */
@Controller
public class IndexController {

    /**
     * 来登录页面
     * @return
     */
    @GetMapping(value = {"/","login"})
    public String loginPage(){

        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session){



        //登录成功重定向到main.html.重定向可以防止页面重复提交
        return "redirect:/main.html";
    }

    /**
     * 去main页面
     * @return
     */
    @GetMapping("/main.html")
    public String mainPage(){

        return "main";
    }
}
