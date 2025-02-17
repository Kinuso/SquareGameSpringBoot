package com.example.squaregamespringboot.Entity;

import java.util.ArrayList;

public interface UserDao {

    // Changer le typage par une partie
    ArrayList<String> getCurrentGame (String newGame);

    // Changer le typage par une partie
    boolean updateGame (User user);
}
