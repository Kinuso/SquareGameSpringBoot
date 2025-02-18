package com.example.squaregamespringboot.Service;

import com.example.squaregamespringboot.Entity.User;
import com.example.squaregamespringboot.Entity.UserEntity;
import com.example.squaregamespringboot.Repository.UserEntityRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

@Service
public class JpaUserDao implements UserDao {

    @Autowired
    UserEntityRepository userRepository;


    @Override
    public ArrayList<String> getCurrentGame(String newGame) {
        return null;
    }

    @Override
    public boolean updateGame(User user) {
        return false;
    }

    @Override
    public Stream<User> findAll() {
        return (Stream<User>) userRepository.findAll();
    }

    @Override
    public @NotNull Optional<UserEntity> findById(UUID UserEntity) {
        return userRepository.findById(String.valueOf(UserEntity));
    }

    @Override
    public UserEntity upsert(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public void delete(UUID userId) {

    }
}
