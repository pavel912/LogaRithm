package com.pavel.lobanov.LogaRithm.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginResponse {
    private String token;

    private long expiresIn;
}
