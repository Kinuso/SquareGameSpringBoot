package com.example.squaregamespringboot.Service;

import com.example.squaregamespringboot.Entity.User;
import com.example.squaregamespringboot.Entity.UserEntity;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

public interface UserDao {

        // Changer le typage par une partie
        ArrayList<String> getCurrentGame (String newGame);

        // Changer le typage par une partie
        boolean updateGame (User user);

        @NotNull Stream<User> findAll();

        @org.jetbrains.annotations.NotNull Optional<UserEntity> findById(@NotNull UUID UserEntity);

        @NotNull
        UserEntity upsert(@NotNull UserEntity userEntity);

        void delete(@NotNull UUID userId);
}
