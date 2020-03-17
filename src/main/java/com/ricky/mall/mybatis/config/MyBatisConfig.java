package com.ricky.mall.mybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

// 这个配置类用于统一扫描com.ricky.mall.mybatis.mapper，
// 如果不配置的话@Autowired mapper类的时候会报`Consider defining a bean of type`错误
@Configuration
@MapperScan("com.ricky.mall.mybatis.mapper")
public class MyBatisConfig {

}
