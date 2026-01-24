package com.pavel.lobanov.LogaRithm.dto;

import lombok.*;

import java.time.Instant;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class UserRoleDto {
    private Long id;
    private Instant createdAt;
    private String name;
    private String description;
}

