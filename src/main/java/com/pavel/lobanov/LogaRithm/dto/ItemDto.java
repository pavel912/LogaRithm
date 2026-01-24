package com.pavel.lobanov.LogaRithm.dto;

import lombok.*;

import java.time.Instant;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class ItemDto {
    private Long id;
    private Instant createdAt;
    private String name;
}

