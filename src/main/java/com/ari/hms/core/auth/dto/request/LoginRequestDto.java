package com.ari.hms.core.auth.dto.request;

import lombok.Data;

@Data
public class LoginRequestDto {

    private String username;

    private String password;
}
