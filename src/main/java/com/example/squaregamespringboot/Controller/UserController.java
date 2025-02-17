package com.example.squaregamespringboot.Controller;

import com.example.squaregamespringboot.Entity.User;
import com.example.squaregamespringboot.Entity.UserCreationParams;
import com.example.squaregamespringboot.Entity.UserDto;
import com.example.squaregamespringboot.Entity.UserEntity;
import com.example.squaregamespringboot.Repository.UserEntityRepository;
import com.example.squaregamespringboot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    public UserService userService;

    @Autowired
    public UserEntityRepository userEntityRepository;

    @PostMapping("/users")
    public UserEntity createUser(@RequestBody UserEntity params) {
// TODO - actually create a new user
        UserEntity userEntity = new UserEntity(params.getEmail(), params.getPassword());
        return this.userEntityRepository.save(userEntity);
    }

    @GetMapping("/users/{userId}")
    public UserDto getUser(@PathVariable int userId) {
// TODO - actually get and return user with id 'userId'
        return new UserDto(userId, "emailPasOuf@gmail.com");
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
