package com.example.k8sdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Value("${logging.level:INFO}")
    private String logLevel;

    @Value("${db.password:defaultSecret}")
    private String dbPassword;

    @GetMapping("/success1")
    public String successResponse1() {
        return "Success 1: Everything is working fine!";
    }

    @GetMapping("/success2")
    public String successResponse2() {
        return "Success 2: All systems operational!";
    }

    @GetMapping("/client-error")
    public String clientError() {
        throw new IllegalArgumentException("Client Error: Invalid request parameters!");
    }

    @GetMapping("/server-error")
    public String serverError() {
        throw new RuntimeException("Server Error: Unexpected issue occurred!");
    }

    @GetMapping("/config")
    public String getConfig() {
        return "Logging Level: " + logLevel + " | DB Password: " + dbPassword;
    }
}
