package com.heo;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Map;

public class Test {
    public void testParse() {
        String token = "xxxxx.yyyyy.zzzzz";
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("itheima")).build();
        DecodedJWT decodedJWT = jwtVerifier.verify(token);
        Map<String, Claim> claims = decodedJWT.getClaims();
        System.out.println(claims.get("user"));
    }
}
