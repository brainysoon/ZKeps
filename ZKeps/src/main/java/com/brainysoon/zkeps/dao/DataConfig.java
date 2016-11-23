package com.brainysoon.zkeps.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by brainy on 16-11-7.
 */
@Configuration
@ComponentScan(basePackageClasses = {DataConfig.class})
public class DataConfig {

    private static final String MYSQL_DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
    private static final String MYSQL_HOST = "192.168.1.111";
    private static final String MYSQL_URL = "jdbc:mysql://" + MYSQL_HOST + ":3306/zkeps?useUnicode=true&characterEncoding=UTF-8";
    private static final String MYSQL_USER_NAME = "dbworker";
    private static final String MYSQL_USER_PASSWORD = "dbroom1411DB-";

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {

        return new JdbcTemplate(dataSource);
    }

    @Bean
    public DataSource mysqlDataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName(MYSQL_DRIVER_CLASS_NAME);
        dataSource.setUrl(MYSQL_URL);
        dataSource.setUsername(MYSQL_USER_NAME);
        dataSource.setPassword(MYSQL_USER_PASSWORD);

        return dataSource;
    }
}
