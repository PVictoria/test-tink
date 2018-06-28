package com.springboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


@Service
public class AppRepository implements ApplicationRepository {
    @Autowired
    private JdbcTemplate jtm;
    @Override
    public List<Application> findAll() {
        String sql = "SELECT * FROM APPLICATION";

        List<Application> apps = jtm.query(sql, new BeanPropertyRowMapper(Application.class));

//        for (int i = 0; i < apps.size(); i++){
//            System.out.print(apps.get(i).getDtCreated().toString());
//        }

        return apps;
    }

    @Override
    public Application findById(Long contactId)  {

        String sql = " SELECT * FROM APPLICATION " +
                "  WHERE DT_CREATED = (SELECT  MAX(DT_CREATED) FROM "+
                " (SELECT * FROM APPLICATION WHERE CONTACT_ID = ? )) ";

            Application app = (Application) (jtm.queryForObject(sql, new Object[]{contactId}, //new ApplicationRowMapper()));
                    new BeanPropertyRowMapper(Application.class)));




        return app;
    }
}
