package com.example.AuthenticateAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @GetMapping("/dashboard")
    public Map<String, Object> getAdminDashboard() {
        // Sample response (replace with real data)
        Map<String, Object> response = new HashMap<>();
        response.put("totalUsers", 150);
        response.put("totalProjects", 25);
        return response;
    }
}
