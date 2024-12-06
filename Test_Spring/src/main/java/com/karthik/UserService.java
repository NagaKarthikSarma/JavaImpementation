package com.karthik;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private static DataSource dataSource; // Inject the DataSource bean

    public static List<User> getUsers() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        List<Map<String, Object>> rows = jdbcTemplate.queryForList("select * from argon");

        List<User> users = new ArrayList<>(); // Create an empty list inside the method
        for (Map<String, Object> row : rows) {
            User user = new User();
            user.setId((Long) row.get("AId")); // Assuming AId is a Long
            user.setName((String) row.get("Aname"));
            users.add(user);
        }
        return users;
    }
}
