package com.example.squaregamespringboot.Service;

import com.example.squaregamespringboot.Entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface UserService {

    User createUser(User user);

    User updateUser(User user);

    User getUserById(int id);

    User deleteUser(int id);

    ArrayList<String> getCurrentGame(String newGame);

    boolean updateGame(User user);
}
