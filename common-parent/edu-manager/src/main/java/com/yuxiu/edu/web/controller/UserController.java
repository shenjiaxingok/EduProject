package com.yuxiu.edu.web.controller;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author star
 * @date 2019/1/6 0006-16:41
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;


    @RequestMapping("login")
    public String login(){
        System.out.println("====登录方法执行了======");
        return "Default";
    }

    @RequestMapping("find")
    public String find(Integer id){
        System.out.println("========find 方法执行了==========");
        User user = userService.findById(id);
        System.out.println("测试查询数据"+user);
        return null;
    }

    @RequestMapping("manage")
    public String manage() {
        System.out.println("========default页面=====");
        return "User/UserManage";
    }

    @RequestMapping("info")
    public String info() {
        System.out.println("========UserInfo页面=====");
        return "User/UserInfo";
    }

    @RequestMapping("edit")
    public String edit() {
        System.out.println("========UserEdit页面=====");
        return "User/UserEdit";
    }
}
