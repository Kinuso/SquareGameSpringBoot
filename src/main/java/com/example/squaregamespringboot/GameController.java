package com.example.squaregamespringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class GameController {

    @Autowired
    public UserServiceImpl userServiceImpl;

    @GetMapping("/games/{newGame}")
    public ArrayList<String> createGame(@PathVariable String newGame) {
// TODO - actually delete user'
        return userServiceImpl.getCurrentGame(newGame);
    }
}
