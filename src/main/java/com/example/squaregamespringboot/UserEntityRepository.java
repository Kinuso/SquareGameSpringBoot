package com.example.squaregamespringboot;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {

    @Override
    @NotNull
    Optional<UserEntity> findById(Long aLong);

    @Override
    <S extends UserEntity> @NotNull S save(@NotNull S entity);

    @Override
    void delete(@NotNull UserEntity entity);
}
