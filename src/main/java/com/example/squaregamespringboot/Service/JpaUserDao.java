package com.example.squaregamespringboot.Service;

import com.example.squaregamespringboot.Entity.User;
import com.example.squaregamespringboot.Entity.UserDao;

import java.util.ArrayList;

public class JpaUserDao implements UserDao {

    @Override
    public ArrayList<String> getCurrentGame(String newGame) {
        return null;
    }

    @Override
    public boolean updateGame(User user) {
        return false;
    }
}
