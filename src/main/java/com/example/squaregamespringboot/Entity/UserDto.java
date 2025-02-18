package com.example.squaregamespringboot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

public final class UserDto {

    @Id
    public String id;
    public String email;

    public UserDto(String email, String id) {
        this.email = email;
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }
}
