package com.example.ocean_spring_data_jdbc_mybatis.mapper;

import com.example.ocean_spring_data_jdbc_mybatis.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author ocean_wll
 * @date 2021/6/3
 */
@Repository
public interface UserMapper {


    /**
     * 根据名字查询
     *
     * @param name
     * @return
     */
    User findByNameA(String name);
}
