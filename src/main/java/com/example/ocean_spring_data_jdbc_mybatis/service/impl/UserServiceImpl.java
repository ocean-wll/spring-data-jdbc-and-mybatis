package com.example.ocean_spring_data_jdbc_mybatis.service.impl;

import com.example.ocean_spring_data_jdbc_mybatis.service.UserService;
import com.example.ocean_spring_data_jdbc_mybatis.service.UserServiceB;
import org.springframework.stereotype.Component;

/**
 * @author ocean_wll
 * @date 2021/6/7
 */
public class UserServiceImpl implements UserService {

    @Override
    public String hello() {
        return "hello";
    }

//    @Override
    public String hi() {
        return "ocean";
    }
}
