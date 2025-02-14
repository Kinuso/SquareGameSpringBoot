package com.example.squaregamespringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class JdbcUserDao {

    @Autowired
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate;
}
