package com.cognizant.jwt.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtUtil {
    private static final String SECRET_KEY = "your_secret_key";

    public static String generateToken(String username) {
        long currentTime = System.currentTimeMillis();
        return Jwts.builder()
            .setSubject(username)
            .setIssuedAt(new Date(currentTime))
            .setExpiration(new Date(currentTime + 1000 * 60 * 10)) // 10 min
            .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
            .compact();
    }
}
