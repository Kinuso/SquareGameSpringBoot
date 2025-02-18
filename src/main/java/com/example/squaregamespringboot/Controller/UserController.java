package com.example.squaregamespringboot.Controller;

import com.example.squaregamespringboot.Entity.User;
import com.example.squaregamespringboot.Entity.UserCreationParams;
import com.example.squaregamespringboot.Entity.UserDto;
import com.example.squaregamespringboot.Entity.UserEntity;
import com.example.squaregamespringboot.Repository.UserEntityRepository;
import com.example.squaregamespringboot.Service.JpaUserDao;
import com.example.squaregamespringboot.Service.UserService;
import com.example.squaregamespringboot.Service.UserServiceImpl;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
public class UserController {


    @Autowired
    private UserService userService;


    @PostMapping("/users")
    public UserEntity createUser(@RequestBody UserEntity params) {
        UserEntity userEntity = new UserEntity(params.getEmail(), params.getPassword());
        return this.userService.createUser(userEntity);
    }

    @GetMapping("/users/{userId}")
    public UserDto getUser(@PathVariable String userId) {
        return userService.getUserById(userId);
    }

    @PutMapping("/users/{userId}")
    public UserDto updateUser(@RequestBody UserCreationParams params, @PathVariable String userId) {
// TODO - actually update and return user with id 'userId'
        return null;
    }

    @DeleteMapping("/users/{userId}")
    public boolean deleteUser(@PathVariable String userId) {
// TODO - actually delete user'
        return true;
    }

}
