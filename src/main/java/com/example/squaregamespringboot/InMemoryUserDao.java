package com.example.squaregamespringboot;

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
