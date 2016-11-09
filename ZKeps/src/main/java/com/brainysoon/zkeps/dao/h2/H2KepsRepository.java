package com.brainysoon.zkeps.dao.h2;

import com.brainysoon.zkeps.bean.Kep;
import com.brainysoon.zkeps.dao.KepsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by brainy on 16-11-8.
 */
@Repository
public class H2KepsRepository implements KepsRepository, RowMapper<Kep> {

    @Autowired
    private JdbcOperations jdbcOperations;

    @Override
    public List<Kep> findKeps(long max, long count) {
        return null;
    }

    @Override
    public Kep findOne(long kepId) {
        return jdbcOperations.queryForObject(QUERY_KEP_BY_KEP_ID, this, kepId);
    }

    @Override
    public List<Kep> findPopKeps() {

        List<Kep> keps = new ArrayList<>();

        List rows = jdbcOperations.queryForList(QUERY_POP_KEPS);

        Iterator it = rows.iterator();

        while (it.hasNext()) {

            Map map = (Map) it.next();

            Kep kep = new Kep();
            kep.setKepId(map.get("kepId").toString());
            kep.setUserName(map.get("userName").toString());
            kep.setKepTime((java.sql.Date) map.get("kepTime"));
            kep.setKepTitle(map.get("kepTitle").toString());
            kep.setKepMsg(map.get("kepMsg").toString());
            kep.setKepContent(map.get("kepContent").toString());
            kep.setStars((int) map.get("stars"));

            keps.add(kep);
        }

        return keps;
    }

    @Override
    public long countKeps() {
        return jdbcOperations.queryForLong(COUNT_KEPS);
    }

    @Override
    public boolean addKep(Kep kep) {

        jdbcOperations.update(INSERT_KEP,
                kep.getKepId(),
                kep.getUserName(),
                kep.getKepTime(),
                kep.getKepTitle(),
                kep.getKepMsg(),
                kep.getKepContent(),
                kep.getStars());

        return true;
    }

    @Override
    public Kep mapRow(ResultSet rs, int rowNum) throws SQLException {

        Kep kep = new Kep();

        kep.setKepId(rs.getString(1));
        kep.setUserName(rs.getString(2));
        kep.setKepTime(rs.getDate(3));
        kep.setKepTitle(rs.getString(4));
        kep.setKepMsg(rs.getString(5));
        kep.setKepContent(rs.getString(6));
        kep.setStars(rs.getInt(7));

        return kep;
    }
}
