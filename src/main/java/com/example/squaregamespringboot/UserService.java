package com.example.squaregamespringboot;

public interface UserService {

    User createUser(User user);

    User updateUser(User user);

    User getUserById(int id);

    User deleteUser(int id);
}
