package com.example.squaregamespringboot.Service;

import com.example.squaregamespringboot.Entity.User;
import com.example.squaregamespringboot.Entity.UserEntity;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

@Service
public class UserServiceImpl implements UserService, HeartbeatSensor, UserDao {

    @Override
    public User createUser(User user) {
        return user;
    }

    @Override
    public User deleteUser(int id) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Autowired
    public InMemoryUserDao userDao;

    @Override
    public ArrayList<String> getCurrentGame(String newGame) {
        return userDao.getCurrentGame(newGame);
    }

    @Override
    public boolean updateGame(User user) {
        return false;
    }

    @Override
    public Stream<User> findAll() {
        return Stream.empty();
    }

    @Override
    public @NotNull Optional<UserEntity> findById(UUID UserEntity) {
        return Optional.empty();
    }

    @Override
    public UserEntity upsert(UserEntity userEntity) {
        return null;
    }

    @Override
    public void delete(UUID userId) {

    }

    @Override
    public int get() {
        return 0;
    }
}
