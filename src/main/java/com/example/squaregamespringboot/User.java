package com.example.squaregamespringboot;

import jakarta.validation.constraints.*;

public class User {

    public final int id;
    public final @Email @NotEmpty String email;
    public final @NotEmpty @Min(8) String password;
    public final @NotEmpty String name;
    public final @NotEmpty @Max(18) String surname;

    public User (int id, String email, String password, String name, String surname) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }
}
