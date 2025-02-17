package com.example.squaregamespringboot.Service;

import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Service
public class RandomHeartbeat implements HeartbeatSensor {

    private final SecureRandom random = new SecureRandom();

    public int get() {
        return this.random.nextInt(40, 230);
    }

}
