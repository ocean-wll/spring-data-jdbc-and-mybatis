package com.example.ocean_spring_data_jdbc_mybatis.dao;

import com.example.ocean_spring_data_jdbc_mybatis.entity.User;
import com.example.ocean_spring_data_jdbc_mybatis.mapper.UserMapper;
import org.springframework.data.repository.CrudRepository;

/**
 * @author ocean_wllØ
 * @date 2021/6/3
 */
public interface UserDao extends CrudRepository<User, Long>, UserMapper {

    /**
     * 根据名字查询
     *
     * @param name
     * @return
     */
    User findByName(String name);


}
