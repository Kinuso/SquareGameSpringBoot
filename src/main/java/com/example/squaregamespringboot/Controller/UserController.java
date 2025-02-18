package com.example.squaregamespringboot.Controller;

import com.example.squaregamespringboot.Entity.User;
import com.example.squaregamespringboot.Entity.UserCreationParams;
import com.example.squaregamespringboot.Entity.UserDto;
import com.example.squaregamespringboot.Entity.UserEntity;
import com.example.squaregamespringboot.Repository.UserEntityRepository;
import com.example.squaregamespringboot.Service.JpaUserDao;
import com.example.squaregamespringboot.Service.UserService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    public UserService userService;

    @Autowired
    public JpaUserDao jpaUserDao;

    @PostMapping("/users")
    public UserEntity createUser(@RequestBody UserEntity params) {
        UserEntity userEntity = new UserEntity(params.getEmail(), params.getPassword());
        return this.jpaUserDao.upsert(userEntity);
    }

    @GetMapping("/users/{userId}")
    public UserDto getUser(@PathVariable UUID userId) {
// TODO - actually get and return user with id 'userId'
        @NotNull Optional<UserEntity> userEntity = jpaUserDao.findById(userId);

        return new UserDto(userEntity.get().getEmail(), userEntity.get().getEmail());
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
