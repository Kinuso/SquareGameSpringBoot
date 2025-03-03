package com.example.squaregamespringboot.Service;

import com.example.squaregamespringboot.Entity.User;
import com.example.squaregamespringboot.Entity.UserDto;
import com.example.squaregamespringboot.Entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


public interface UserService {

    UserEntity createUser(UserEntity userEntity);

    User updateUser(User user);

    UserDto getUserById(String id);

    User deleteUser(int id);

    ArrayList<String> getCurrentGame(String newGame);

    boolean updateGame(User user);

    boolean isValidUser(String userId);

}
