package com.example.ocean_spring_data_jdbc_mybatis;

import org.springframework.data.jdbc.mybatis.NamespaceStrategy;

/**
 * @author ocean_wll
 * @date 2021/6/3
 */
public class MyBatisNamespaceStrategy implements NamespaceStrategy {

    @Override
    public String getNamespace(Class<?> domainType) {
        return "com.example.ocean_spring_data_jdbc_mybatis.mapper.".concat(domainType.getSimpleName()).concat("Mapper");
    }
}
