package com.example.squaregamespringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping("/users")
    public User createUser(@RequestBody User params) {
// TODO - actually create a new user
        User user = new User(params.id, params.email, params.password, params.name, params.surname);
        return this.userService.createUser(user);
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
