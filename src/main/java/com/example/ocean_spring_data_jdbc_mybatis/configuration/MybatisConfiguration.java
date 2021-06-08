package com.example.ocean_spring_data_jdbc_mybatis.configuration;

import com.example.ocean_spring_data_jdbc_mybatis.MyBatisNamespaceStrategy;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.data.jdbc.core.convert.DataAccessStrategy;
import org.springframework.data.jdbc.core.convert.JdbcConverter;
import org.springframework.data.jdbc.core.mapping.JdbcMappingContext;
import org.springframework.data.jdbc.mybatis.MyBatisDataAccessStrategy;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jdbc.repository.config.MyBatisJdbcConfiguration;
import org.springframework.data.relational.core.dialect.Dialect;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;

import javax.sql.DataSource;

/**
 * @author ocean_wll
 * @date 2021/6/3
 */
//@Configuration
//@EnableJdbcRepositories
//@Import(MyBatisJdbcConfiguration.class)
public class MybatisConfiguration extends AbstractJdbcConfiguration {

    //    @Autowired
    private SqlSession session;

    //    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:mybatis/*Mapper.xml"));
        sqlSessionFactoryBean.setTypeAliasesPackage("com.example.ocean_spring_data_jdbc_mybatis.entity");
        return sqlSessionFactoryBean.getObject();
    }

//    @Bean
    @Override
//    @Primary
    public DataAccessStrategy dataAccessStrategyBean(NamedParameterJdbcOperations operations,
                                                     JdbcConverter jdbcConverter, JdbcMappingContext context,
                                                     Dialect dialect) {
        return MyBatisDataAccessStrategy.createCombinedAccessStrategy(context, jdbcConverter, operations, session,
                new MyBatisNamespaceStrategy(), dialect);
    }
}
