package com.brainysoon.zkeps.dao.mysql;

import com.brainysoon.zkeps.bean.Kep;
import com.brainysoon.zkeps.dao.KepsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by brainy on 16-11-20.
 */
@Repository
public class KepsRepositoryImpl implements KepsRepository, RowMapper<Kep> {

    //kepsWapper
    private static final String KEP_ID = "kepId";
    private static final String KEPER_NAME = "keperName";
    private static final String KEP_TIME = "kepTime";
    private static final String KEP_TITLE = "kepTitle";
    private static final String KEP_MSG = "kepMsg";
    private static final String KEP_CONTENT = "kepContent";
    private static final String STARS = "stars";

    private JdbcOperations jdbcOperations;

    @Autowired
    public void setJdbcOperations(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    @Override
    public List<Kep> findPopKeps() {

        return jdbcOperations.query(QUERY_POP_KEPS_BY_PAGE_INDEX, this);
    }

    @Override
    public Kep mapRow(ResultSet rs, int rowNum) throws SQLException {

        Kep kep = new Kep();

        kep.setKeperName(rs.getString(KEP_ID));
        kep.setKeperName(rs.getString(KEPER_NAME));
        kep.setKepTime(Timestamp.valueOf(rs.getString(KEP_TIME)));
        kep.setKepTitle(rs.getString(KEP_TITLE));
        kep.setKepMsg(rs.getString(KEP_MSG));
        kep.setKepContent(rs.getString(KEP_CONTENT));
        kep.setStars(Integer.valueOf(rs.getString(STARS)));

        return kep;
    }
}
