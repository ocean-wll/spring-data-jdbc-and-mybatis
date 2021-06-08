package com.example.ocean_spring_data_jdbc_mybatis.repository.extension;

import com.example.ocean_spring_data_jdbc_mybatis.entity.User;

import java.util.List;

/**
 * TODO ocean_wll 就相当于 UserMapper
 *
 * @author ocean_wll
 * @date 2021/6/7
 */
public interface UserRepositoryExtension {

    List<User> list();
}
