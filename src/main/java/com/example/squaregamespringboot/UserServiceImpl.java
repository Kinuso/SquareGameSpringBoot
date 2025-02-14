package com.example.squaregamespringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService, UserDao {

    @Override
    public User createUser(User user) {
        return user;
    }

    @Override
    public User deleteUser(int id) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Autowired
    public InMemoryUserDao userDao;

    @Override
    public ArrayList<String> getCurrentGame(String newGame) {
        return userDao.getCurrentGame(newGame);
    }

    @Override
    public boolean updateGame(User user) {
        return false;
    }
}
