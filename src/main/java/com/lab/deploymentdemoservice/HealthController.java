package com.lab.deploymentdemoservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
                "status", "UP",
                "service", "deployment-demo-service",
                "version", "v2"
        );
    }
    @GetMapping("/config")
    public Map<String, String> config() {

        return Map.of(
                "environment", System.getenv("APP_ENV"),
                "region", System.getenv("APP_REGION"),
                "apiKey", System.getenv("API_KEY")
        );
    }
}
