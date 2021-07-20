package io.wakelesstuna.springsecurityjwt.security.jwt.model;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuthRequest {

    private String username;
    private String password;
}
