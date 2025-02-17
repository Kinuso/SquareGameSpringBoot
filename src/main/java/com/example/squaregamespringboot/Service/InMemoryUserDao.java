package com.example.squaregamespringboot.Service;

import com.example.squaregamespringboot.Entity.User;
import com.example.squaregamespringboot.Entity.UserDao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class InMemoryUserDao implements UserDao {

    private ArrayList<String> games = new ArrayList<String>();

    // Changer le typage par une partie
    public ArrayList<String> getCurrentGame (String newGame) {
        games.add(newGame);
        return games;
    };

    // Changer le typage par une partie
    public boolean updateGame (User user) {
        return false;
    };
}
