//package com.springboot.rest;
//
//import org.springframework.jdbc.core.RowMapper;
//
//import java.sql.Date;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class ApplicationRowMapper implements RowMapper {
//
//
//    @Override
//    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
//        Application app = new Application();
//        app.setApplicationId(resultSet.getLong("APPLICATION_ID"));
//        app.setContact(resultSet.getLong("CONTACT_ID"));
////        app.setContact(new Contact(resultSet.getLong("CONTACT_ID")));
//        app.setDtCreated(new Date(resultSet.getLong("DT_CREATED")));
//        app.setProduct(resultSet.getString("PRODUCT_NAME"));
////        app.setProduct(new Product(resultSet.getString("PRODUCT_NAME")));
//        return app;
//    }
//}
