package com.example.squaregamespringboot.Entity;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class UserCreationParams {

    public final @NotNull @Email String email;
    public final @NotEmpty String password;

    public UserCreationParams(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
