package com.hxb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author 和学博
 */
@Configuration
public class JdbcConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public JdbcTemplate getTemplate(){
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(dataSource);
        return template;
    }

}
