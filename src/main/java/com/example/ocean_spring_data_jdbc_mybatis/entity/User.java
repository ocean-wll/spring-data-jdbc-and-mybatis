package com.example.ocean_spring_data_jdbc_mybatis.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;

/**
 * @author ocean_wll
 * @date 2021/6/2
 */
@Data
@Table("user")
public class User implements Serializable {

    @Id
    private Long id;

    @Column("name")
    private String name;

    @Column("age")
    private Integer age;
}
