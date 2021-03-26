package com.hxb.dao.impl;

import com.hxb.dao.UserDao;
import com.hxb.pojo.EASYBUY_USER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 和学博
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    RowMapper<EASYBUY_USER> userMapper = new RowMapper<EASYBUY_USER>() {
        @Override
        public EASYBUY_USER mapRow(ResultSet resultSet, int i) throws SQLException {
            String id = resultSet.getString(1);
            String name = resultSet.getString(2);
            String password = resultSet.getString(3);

            EASYBUY_USER user = new EASYBUY_USER();
            user.setEU_USER_ID(id);
            user.setEU_USER_NAME(name);
            user.setEU_PASSWORD(password);

            return user;
        }
    };

    @Override
    public EASYBUY_USER login(String name, String password) {
        List<EASYBUY_USER> list = jdbcTemplate.query("select * from `springboot-tms`.easybuy_user where EU_USER_ID=? and EU_PASSWORD=?", userMapper, name, password);
//        System.out.print(list+"---list");
        if(list!=null&&list.size()!=0){
            return list.get(0);
        }
        return null;
    }
}
