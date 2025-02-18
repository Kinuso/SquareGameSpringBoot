package com.example.squaregamespringboot.Service;

import com.example.squaregamespringboot.Entity.User;
import com.example.squaregamespringboot.Entity.UserDto;
import com.example.squaregamespringboot.Entity.UserEntity;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

@Service
public class UserServiceImpl implements UserService, HeartbeatSensor {

    @Autowired
    private UserDao userDao;

    public UserEntity createUser(UserEntity userEntity) {
        return userDao.upsert(userEntity);
    }

    public UserDto getUserById(String id) {

        @NotNull Optional<UserEntity> user = userDao.findById(UUID.fromString(id));
        return new UserDto(user.get().getEmail(), user.get().getId());
    }

    public User deleteUser(int id) {
        return null;
    }

    public User updateUser(User user) {
        return null;
    }


    @Override
    public ArrayList<String> getCurrentGame(String newGame) {
        return userDao.getCurrentGame(newGame);
    }

    @Override
    public boolean updateGame(User user) {
        return false;
    }

    @Override
    public int get() {
        return 0;
    }
}
