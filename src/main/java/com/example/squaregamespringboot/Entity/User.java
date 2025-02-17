package com.example.squaregamespringboot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

public class User {

    @Id
    public int id;
    public @Email @NotEmpty String email;
    public @NotEmpty @Min(8) String password;
    public @NotEmpty String name;
    public @NotEmpty @Max(18) String surname;

    public User(int id, String email, String password, String name, String surname) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public User() {

    }
}
