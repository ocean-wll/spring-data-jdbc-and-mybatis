package com.example.ocean_spring_data_jdbc_mybatis.mapper.impl;

import com.example.ocean_spring_data_jdbc_mybatis.entity.User;
import com.example.ocean_spring_data_jdbc_mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author ocean_wll
 * @date 2021/6/7
 */
@Repository
public class UserMapperImpl implements UserMapper {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public User findByNameA(String name) {
        return sqlSession.selectOne("findByNameA", name);
    }
}
