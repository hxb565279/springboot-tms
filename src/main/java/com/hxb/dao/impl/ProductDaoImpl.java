package com.hxb.dao.impl;

import com.hxb.dao.ProductDao;
import com.hxb.pojo.EASYBUY_PRODUCT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    RowMapper<EASYBUY_PRODUCT> productMapper = new RowMapper<EASYBUY_PRODUCT>() {
        @Override
        public EASYBUY_PRODUCT mapRow(ResultSet resultSet, int i) throws SQLException {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String desc = resultSet.getString(3);
            int cid = resultSet.getInt("epc_id");
            String img = resultSet.getString("EP_FILE_NAME");
            EASYBUY_PRODUCT product = new EASYBUY_PRODUCT();
            product.setEP_ID(id);
            product.setEP_NAME(name);
            product.setEP_DESCRIPTION(desc);
            product.setEPC_ID(cid);
            product.setEP_FILE_NAME(img);
            return product;
        }
    };

    @Override
    public List<EASYBUY_PRODUCT> findByCid(int categoryID) {
//        select * from easybuy_product where epc_id=31
        List<EASYBUY_PRODUCT> list = jdbcTemplate.query("select * from  `springboot-tms`.easybuy_product where epc_id=?", productMapper, categoryID);
        return list;
    }
}
