package com.cognizant.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.Base64;
import java.util.Map;
import java.util.HashMap;
import com.cognizant.jwt.util.JwtUtil;

@RestController
public class AuthController {

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Basic ")) {
            // Decode Base64 encoded credentials
            String base64Credentials = authHeader.substring("Basic ".length());
            byte[] decoded = Base64.getDecoder().decode(base64Credentials);
            String[] credentials = new String(decoded).split(":", 2);

            String username = credentials[0];
            String password = credentials[1];

            // Dummy auth check
            if ("user".equals(username) && "pwd".equals(password)) {
                String token = JwtUtil.generateToken(username);
                return Map.of("token", token);
            }
        }

        // Return unauthorized response
        Map<String, String> response = new HashMap<>();
        response.put("error", "Invalid Credentials");
        return response;
    }
}
