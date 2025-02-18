package com.example.squaregamespringboot.Repository;

import com.example.squaregamespringboot.Entity.UserEntity;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, String> {

    @Override
    @NotNull
    Optional<UserEntity> findById(String s);

    @Override
    <S extends UserEntity> @NotNull S save(@NotNull S entity);

    @Override
    void delete(@NotNull UserEntity entity);
}
