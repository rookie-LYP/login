package com.example.admin.controller;

import com.example.admin.pojo.Admin;
import com.example.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("Admin")
public class AdminController {
    private static String URL = "500";

    @Autowired
    private AdminService adminService;

    @RequestMapping("checkLogin")
    public String checkLogin(Admin admin, Model model, HttpSession session){
        if(admin!=null){
            Admin checkLogin=adminService.checkLogin(admin.getAdminAccount(),admin.getAdminPassword());
            if(checkLogin!=null){
                session.setAttribute("user",checkLogin);
                model.addAttribute("loginMsg","登录成功");
                URL = "success";
            }else {
                model.addAttribute("loginMsg", "账号或密码错误");
                URL="500";
            }
        }else {
            model.addAttribute("loginMsg", "数据为空");
            URL="500";
        }
        return URL;
    }
}
