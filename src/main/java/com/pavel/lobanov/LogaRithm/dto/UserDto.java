package com.pavel.lobanov.LogaRithm.dto;

import lombok.*;

import java.time.Instant;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class UserDto {
    private Long id;
    private Instant createdAt;
    private Long userRoleId;
    private Long addressLocationId;
    private String username;
    private String password;
}

