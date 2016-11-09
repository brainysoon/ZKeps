package com.brainysoon.zkeps.dao.h2;

import com.brainysoon.zkeps.bean.Keper;
import com.brainysoon.zkeps.dao.KeperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by brainy on 16-11-7.
 */
@Repository
public class H2KeperRepository implements KeperRepository, RowMapper<Keper> {

    private static final String INSERT_USER = "INSERT INTO keper VALUES(?,?,?,?,?,?,?,?)";
    private static final String COUNT_USER = "SELECT count(userName) FROM keper";
    private static final String QUERY_USER_BY_USERNAME = "SELECT * FROM keper WHERE userName=?";

    @Autowired
    private JdbcOperations jdbcOperations;

    @Override
    public boolean processRegister(Keper keper) {

        jdbcOperations.update(INSERT_USER,
                keper.getUserName(),
                keper.getPassword(),
                keper.getEmail(),
                keper.getNickName(),
                keper.getMotto(),
                keper.getAvator(),
                keper.getStars(),
                keper.getSlead());

        return true;
    }

    @Override
    public Keper findKeper(String userName) {
        return jdbcOperations.queryForObject(QUERY_USER_BY_USERNAME, this, userName);
    }

    @Override
    public long countUser() {
        return jdbcOperations.queryForLong(COUNT_USER);
    }

    @Override
    public Keper mapRow(ResultSet rs, int rowNum) throws SQLException {

        Keper keper = new Keper();

        keper.setUserName(rs.getString(1));
        keper.setPassword(rs.getString(2));
        keper.setEmail(rs.getString(3));
        keper.setNickName(rs.getString(4));
        keper.setMotto(rs.getString(5));
        keper.setAvator(rs.getString(6));
        keper.setStars(rs.getInt(7));
        keper.setSlead(rs.getInt(8));

        return keper;
    }

    @Override
    public List<Keper> findAllKepers() {
        return null;
    }
}