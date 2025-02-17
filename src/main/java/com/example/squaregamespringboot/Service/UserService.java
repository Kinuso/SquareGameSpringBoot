package com.example.squaregamespringboot.Service;

import com.example.squaregamespringboot.Entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User createUser(User user);

    User updateUser(User user);

    User getUserById(int id);

    User deleteUser(int id);
}
