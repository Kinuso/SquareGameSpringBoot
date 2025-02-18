package com.example.squaregamespringboot.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class InMemoryUserDao implements HeartbeatSensor {

    private ArrayList<String> games = new ArrayList<String>();

    public ArrayList<String> getCurrentGame (String newGame) {
        games.add(newGame);
        return games;
    };

    @Override
    public int get() {
        return 0;
    }
}
