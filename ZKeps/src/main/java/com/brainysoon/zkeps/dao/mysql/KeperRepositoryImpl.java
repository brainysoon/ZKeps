package com.brainysoon.zkeps.dao.mysql;

import com.brainysoon.zkeps.bean.Keper;
import com.brainysoon.zkeps.dao.KeperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by brainy on 16-11-20.
 */
@Repository
public class KeperRepositoryImpl implements KeperRepository, RowMapper<Keper> {

    private static final String KEPER_NAME = "keperName";
    private static final String PASSWORD = "password";
    private static final String EMAIL = "email";
    private static final String NICK_NAME = "nickName";
    private static final String MOTTO = "motto";
    private static final String AVATOR = "avator";
    private static final String STARS = "stars";
    private static final String SLEAD = "slead";

    private JdbcOperations jdbcOperations;

    @Autowired
    public void setJdbcOperations(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    @Override
    public Keper findKeperByKeperName(String keperName) {

        Keper keper = null;

        try {
            keper = jdbcOperations.queryForObject(QUERY_KEPER_BY_KEPER_NAME, new String[]{keperName}, this);
        } catch (Exception e) {

            e.printStackTrace();
        }

        return keper;
    }

    @Override
    public Keper mapRow(ResultSet rs, int rowNum) throws SQLException {

        Keper keper = new Keper();

        keper.setKeperName(rs.getString(KEPER_NAME));
        keper.setPassword(rs.getString(PASSWORD));
        keper.setEmail(rs.getString(EMAIL));
        keper.setNickName(rs.getString(NICK_NAME));
        keper.setMotto(rs.getString(MOTTO));
        keper.setAvator(rs.getString(AVATOR));
        keper.setStars(rs.getInt(STARS));
        keper.setSlead(rs.getInt(SLEAD));

        return keper;
    }
}
