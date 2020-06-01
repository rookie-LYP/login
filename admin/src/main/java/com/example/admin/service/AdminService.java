package com.example.admin.service;

import com.example.admin.pojo.Admin;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {

    Admin checkLogin(String adminAccount,String adminPassword);
}
