package com.example.squaregamespringboot.Controller;
import com.example.squaregamespringboot.Service.HeartbeatSensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartbeatController {

    @Autowired
    @Qualifier("randomHeartbeat")
    private HeartbeatSensor heartbeatSensor;


    @GetMapping("/heartbeat")
    public int getHeartbeat() {
        return this.heartbeatSensor.get();
    };
}
