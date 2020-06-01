package com.example.admin.serviceImpl;

import com.example.admin.dao.AdminDao;
import com.example.admin.pojo.Admin;
import com.example.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Override
    public Admin checkLogin(String adminAccount,String adminPassword) {
        Admin admin=new Admin();
        if(adminAccount!=null&&adminPassword!=null){
            admin=adminDao.checkLogin(adminAccount,adminPassword);
        }
        return admin;
    }
}
