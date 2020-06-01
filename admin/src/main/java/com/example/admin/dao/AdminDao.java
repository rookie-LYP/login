package com.example.admin.dao;

import com.example.admin.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminDao {
    Admin checkLogin(@Param("adminAccount") String adminAccount, @Param("adminPassword") String adminPassword);
}
