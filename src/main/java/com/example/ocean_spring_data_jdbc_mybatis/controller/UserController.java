package com.example.ocean_spring_data_jdbc_mybatis.controller;


import com.example.ocean_spring_data_jdbc_mybatis.dao.UserDao;
import com.example.ocean_spring_data_jdbc_mybatis.entity.User;
import com.example.ocean_spring_data_jdbc_mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ocean_wll
 * @date 2021/6/2
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserDao userDao;

    @RequestMapping("/")
    @Transactional(rollbackFor = RuntimeException.class)
    public ModelAndView index() {
//        System.out.println(userDao.hello());
        User user = new User();
        user.setName("zhangjianxiang");
        user.setAge(26);
        userDao.save(user);
//        User user1 = userMapper.findByName("zhangjianxiang");
//        System.out.println(user1.getName());

        if (true) {
//            throw new RuntimeException("111");
        }

        userDao.findByName("wll");

        ModelAndView modelAndView = new ModelAndView("/index");
//        modelAndView.addObject("dataSize", userMapper.findByName("wll"));
        return modelAndView;
    }
}
