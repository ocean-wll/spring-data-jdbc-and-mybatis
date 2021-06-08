package com.example.ocean_spring_data_jdbc_mybatis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

import javax.sql.DataSource;

@MapperScan("com.example.ocean_spring_data_jdbc_mybatis.mapper")
@SpringBootApplication
@EnableJdbcRepositories
public class OceanSpringDataJdbcMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(OceanSpringDataJdbcMybatisApplication.class, args);
    }

//    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:mybatis/*Mapper.xml"));
        sqlSessionFactoryBean.setTypeAliasesPackage("com.example.ocean_spring_data_jdbc_mybatis.entity");
        return sqlSessionFactoryBean.getObject();
    }

}
