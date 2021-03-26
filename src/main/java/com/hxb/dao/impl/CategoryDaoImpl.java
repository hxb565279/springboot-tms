package com.hxb.dao.impl;

import com.hxb.dao.CategoryDao;
import com.hxb.pojo.EASYBUY_PRODUCT_CATEGORY;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    RowMapper<EASYBUY_PRODUCT_CATEGORY> categoryMapper = new RowMapper<EASYBUY_PRODUCT_CATEGORY>() {
        @Override
        public EASYBUY_PRODUCT_CATEGORY mapRow(ResultSet resultSet, int i) throws SQLException {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            int pid = resultSet.getInt(3);
            EASYBUY_PRODUCT_CATEGORY category = new EASYBUY_PRODUCT_CATEGORY(id,name,pid);
            return category;
        }
    };

    @Override
    public List<EASYBUY_PRODUCT_CATEGORY> findAll() {
        List<EASYBUY_PRODUCT_CATEGORY> list = jdbcTemplate.query("select * from  `springboot-tms`.easybuy_product_category where EPC_PARENT_ID=0", categoryMapper);
        return list;
    }
}
