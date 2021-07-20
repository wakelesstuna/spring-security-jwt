package io.wakelesstuna.springsecurityjwt.security.jwt.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AuthResponse {

    private final String jwtToken;

}
